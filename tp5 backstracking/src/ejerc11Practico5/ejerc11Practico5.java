package ejerc11Practico5;

import java.util.LinkedList;
import java.util.List;

public class ejerc11Practico5 {
	int fila, col;
	
	Solucion caminoMasCorto;
	Celda celdaABuscar; //Cargador.
	Celda posRobot;
	Celda[][] casa;
	public ejerc11Practico5(int fila, int col,Celda celdaABuscar, Celda posRobot,
			Celda[][] casa) {
		super();
		this.fila = fila;
		this.col = col;
		this.celdaABuscar = celdaABuscar;
		this.posRobot = posRobot;
		this.casa = casa;
	}
	
	public Solucion backTracking() {
		Estado e = new Estado(new LinkedList<>(),posRobot,0);
		caminoMasCorto = new Solucion(new LinkedList<>(), Integer.MAX_VALUE);
		e.visitadasActuales.add(posRobot);
		backTracking(e);
		return caminoMasCorto;
	}
	private void backTracking(Estado e) {
		if(e.getCeldaActual().equals(this.celdaABuscar)) {
			if(e.getPasosDadosActual() < this.caminoMasCorto.getPasosDadosMasCortos()) {
				this.caminoMasCorto.setCaminoMasCorto(new LinkedList<>(e.visitadasActuales));
				this.caminoMasCorto.setPasosDadosMasCortos(e.getPasosDadosActual());
			}
		}else {
			for (Celda hijo : obtenerAdyacentes(e.getCeldaActual())) {
					if(e.noEsVisitada(hijo)) {
						if(hijo.getPosCelda() != 1) {//No es obstaculo
							e.moverCeldaSiguiente(hijo);
							e.sumarUnPasoDado();
							e.ponerComoVisitado(hijo);
							backTracking(e);
							e.restarPasoDado();
							e.quitarVisitado();
					}
				}
			}
		}
	}
	private LinkedList<Celda> obtenerAdyacentes(Celda actual) {
	    LinkedList<Celda> adyacentes = new LinkedList<>();
	    int f = actual.getFila();
	    int c = actual.getCol();

	    if (f > 0) adyacentes.add(casa[f - 1][c]);        
	    if (f < fila - 1) adyacentes.add(casa[f + 1][c]);
	    if (c > 0) adyacentes.add(casa[f][c - 1]);        
	    if (c < col - 1) adyacentes.add(casa[f][c + 1]);   

	    return adyacentes;
	}
	public void imprimirCaminoCorto() {
	    List<Celda> camino = caminoMasCorto.getCaminoMasCorto();
	     for (int i = 0; i < camino.size(); i++) {
	        Celda c = camino.get(i);
	            System.out.println("Paso "+ i + " Fila " + c.getFila() + " | Col " + c.getCol());
	        }
	     System.out.println("Cantidad total de pasos: " + this.caminoMasCorto.getPasosDadosMasCortos());
	}
}
