package Recupe29622.Backtracking;

import java.util.List;

public class Estado {
	int[][] sodukoActual;
	int filaAct;
	int colAct;
	int valorAct;
	
	public Estado(int[][] sodukoActual, int filaAct, int colAct, int valorAct) {
		super();
		this.sodukoActual = sodukoActual;
		this.filaAct = filaAct;
		this.colAct = colAct;
		this.valorAct = valorAct;
	}
	public int getValorAct() {
		return valorAct;
	}
	public void setValorAct(int valorAct) {
		this.valorAct = valorAct;
	}
	public int[][] getSodukoActual() {
		return sodukoActual;
	}
	public void setSodukoActual(int[][] sodukoActual) {
		this.sodukoActual = sodukoActual;
	}
	public int getFilaAct() {
		return filaAct;
	}
	public void setFilaAct(int filaAct) {
		this.filaAct = filaAct;
	}
	public int getColAct() {
		return colAct;
	}
	public void setColAct(int colAct) {
		this.colAct = colAct;
	}
	public void avanzarUnHijo(Integer hi) {
		if (hi >= 0 && hi < sodukoActual.length)
		this.valorAct = hi;
	}
	public void agregarVisitadoH(Integer hi) {
		if (filaAct >= 0 && filaAct < 9 && colAct >= 0 && colAct < 9)
			this.sodukoActual[filaAct][colAct] = hi;
	}
	public void retrocederHijo(int hijoAnterior) {
		
		this.valorAct=hijoAnterior;
	}
	public void desmarcarVisita() {
		if (filaAct >= 0 && filaAct < 9 && colAct >= 0 && colAct < 9)
			this.sodukoActual[filaAct][colAct] = 0;
	}
	
	public void avanzarPos() {
	    // Solo continuar si estamos dentro de los límites de las filas y columnas
	    while (filaAct < 9) {
	        // Si llegamos al final de una fila, avanzamos a la siguiente fila
	        if (colAct == 9) {
	            colAct = 0;
	            filaAct++;
	        }

	        // Si llegamos fuera de los límites de las filas, terminamos
	        if (filaAct == 9) {
	            return; // Terminamos porque ya no hay más celdas
	        }

	        // Si encontramos una celda vacía, salimos del ciclo
	        if (this.sodukoActual[filaAct][colAct] == 0) {
	            break;
	        }

	        // Si no es una celda vacía, pasamos a la siguiente columna
	        colAct++;
	    }
	}
}
