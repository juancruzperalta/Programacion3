package ejerc2Practico5;

import java.util.List;
import java.util.LinkedList;
public class ejerc2Practico5 {
	int fila;
	int col;
	Casilla casillaBusqueda;//Casilla a buscar
	Casilla[][] laberinto = new Casilla[fila][col];
	Solucion mejorSolucion;
	Casilla inicio;

	
	public ejerc2Practico5(int fila, int col, Casilla casillaBusqueda, Casilla[][] laberinto, Solucion mejorSolucion,
			Casilla inicio) {
		super();
		this.fila = fila;
		this.col = col;
		this.casillaBusqueda = casillaBusqueda;
		this.laberinto = laberinto;
		this.mejorSolucion = mejorSolucion;
		this.inicio = inicio;
	}
	public void backTracking() {
		Estado estado = new Estado(new LinkedList<>(), inicio, 0, 0);
		mejorSolucion = new Solucion(new LinkedList<>(), 0, 0);
		estado.visitados.add(inicio);
		backTracking(estado);
	}
	private void backTracking(Estado e) {
		if(e.getCasillaActual() == casillaBusqueda) {
			if(mejorSolucion.solucion.size()==0 || e.getValorTotalSuma() < mejorSolucion.sumaDeValores) {
			    mejorSolucion.sumaDeValores = e.valorTotalSuma;
			    mejorSolucion.solucion = new LinkedList<>(e.getVisitados());
			}
		}else {
			List<Casilla> hijos = generarHijos(e.getCasillaActual());
			for(Casilla hijo: hijos) {	
				if (!e.visitados.contains(hijo)) {
					e.aplicarMovimiento(hijo);
					e.sumarValorActual(hijo.posValor);
					e.agregarComoVisitado(hijo);
						backTracking(e);
					e.restarValorActual(hijo.posValor);
					e.desHacerComoVisitado();
				}
			}
		}
	}
	private List<Casilla> generarHijos(Casilla actual) {
		List<Casilla> hijos = new LinkedList<>();

		int f = actual.posFila;
		int c = actual.posCol;

		if (actual.arriba && f > 0 && laberinto[f - 1][c] != null) {
			hijos.add(laberinto[f - 1][c]);
		}
		if (actual.abajo && f < fila - 1 && laberinto[f + 1][c] != null) {
			hijos.add(laberinto[f + 1][c]);
		}
		if (actual.izq && c > 0 && laberinto[f][c - 1] != null) {
			hijos.add(laberinto[f][c - 1]);
		}
		if (actual.der && c < col - 1 && laberinto[f][c + 1] != null) {
			hijos.add(laberinto[f][c + 1]);
		}

		return hijos;
	}
	public void imprimirEstado() {
		for(int i=0; i<mejorSolucion.solucion.size(); i++) {
			System.out.print(mejorSolucion.solucion.get(i));
			System.out.println();
		}
		System.out.println("Pasos dados hasta el camino " + mejorSolucion.getPasosQueYaDi());
	}
	
}
