package Recupe29622.Backtracking;
import java.util.*;
public class Backtracking {
	Solucion solucion;
	int filaMAX, colMAX;
	int[][] sudoku = new int [filaMAX][colMAX];
	public Backtracking(int[][] sudoku, int filaMAX, int colMAX) {
		super();
		this.filaMAX = filaMAX;
		this.colMAX = colMAX;
		this.sudoku = sudoku;
	}
	
	public Solucion backTracking() {
		Estado e = new Estado(new int[filaMAX][colMAX], 0,0,0);
		solucion = new Solucion(new int[filaMAX][colMAX]);
		backTracking(e);
		return solucion;
	}
	private void backTracking(Estado e) {
		if(e.filaAct == filaMAX) {
			for (int i = 0; i < filaMAX; i++) {
				for (int j = 0; j < colMAX; j++) {
					solucion.sudokuResuelto[i][j] = e.sodukoActual[i][j];
				}
			}
		}else {
			List<Integer> hijos= generarHijos(sudoku, e.filaAct,e.colAct);//Me trae los hijos
			//Ya verificados que puedan ir en una fila de alto y una col de ancho.
			for(Integer hi: hijos) {
				int hijoAnterior = e.valorAct;
				e.avanzarUnHijo(hi);
				e.agregarVisitadoH(hi);
				e.avanzarPos();
				//if(!poda(e)) {
					backTracking(e);
			//	}
				e.retrocederHijo(hijoAnterior);
				e.desmarcarVisita();
			}
		}
	}

	private List<Integer> generarHijos(int[][] sudoku2, int fila, int col) {
	    List<Integer> hijos = new ArrayList<>();
	    for (int num = 1; num <= 9; num++) {
	        if (esValido(sudoku2, fila, col, num)) {
	            hijos.add(num);
	        }
	    }
	    return hijos;
	}

	private boolean esValido(int[][] sudoku, int fila, int col, int num) {
	    // Verificar fila
	    for (int j = 0; j < colMAX; j++) {
	        if (sudoku[fila][j] == num) return false;
	    }
	    // Verificar columna
	    for (int i = 0; i < filaMAX; i++) {
	        if (sudoku[i][col] == num) return false;
	    }
	    // Verificar subcuadro 3x3
	    int startFila = (fila / 3) * 3;
	    int startCol = (col / 3) * 3;
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (sudoku[startFila + i][startCol + j] == num) return false;
	        }
	    }
	    return true;
	}

	public void imprimirSolucion() {
		for(int i=0; i<filaMAX; i++) {
			for(int j=0; j<colMAX; j++) {
				System.out.print(sudoku[i][j] + " | ");
			}
			System.out.println("");
		}
	}
	
}
