package Parcial1462024.backtracking;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class palabraBacktracking {
	List<String> conjuntoLetras;
	SolucionBacktracking mejorSecuencia;
	diccionarBacktracking dic;
	int maximoLetras;
	public palabraBacktracking(List<String> conjuntoLetras, int maximoLetras) {
		super();
		this.conjuntoLetras = conjuntoLetras;
		this.maximoLetras = maximoLetras;
		dic = new diccionarBacktracking();
	}
	
	public SolucionBacktracking backTracking() {
		mejorSecuencia = new SolucionBacktracking(new LinkedList<>());
		estadoBacktracking estadoInic = new estadoBacktracking(new LinkedList<>(),0, null);
		backTracking(estadoInic);
		return mejorSecuencia;
	}
	private void backTracking(estadoBacktracking e) {
		if(e.cantidadLetras == maximoLetras) {
			if(dic.esPalabraValida(e.palabrasVisitadas)) {				
			mejorSecuencia.secuenciaPalabras.add(new LinkedList<>(e.palabrasVisitadas));
			}
		}else {
			Iterator<String> letraH = this.conjuntoLetras.iterator();
			while(letraH.hasNext()) {
				String hija = letraH.next();
				if(!e.yaVisite(hija)) {
					e.avanzarSiguienteLetra(hija);
					e.sumarUnaLetraMas();
					e.agregarComoVisitada(hija);
					if(!poda(e))
						backTracking(e);
					e.restarUnaLetra();
					e.desmarcarVisita();
				}
			}
		}
	}

	private boolean poda(estadoBacktracking e) {
		String primeraLetra = e.palabrasVisitadas.get(0);
			if(!esVocal(primeraLetra)) {
				return false;
		}
		return true;
	}
	private boolean esVocal(String letra) {
		return letra.equals("A") || letra.equals("E") || letra.equals("I") ||
			   letra.equals("O") || letra.equals("U");
	}

	public void imprimirMetodo() {
		for(int i=0; i<mejorSecuencia.secuenciaPalabras.size();i++) {
			System.out.println(mejorSecuencia.secuenciaPalabras.get(i));
		}
		
	}
}
