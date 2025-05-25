package Parcial1462024.Greedy;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class procesadorGreedy {
	List<TareaGreedy> listaTarea;
	Solucion secuenciaÓptima;
	public procesadorGreedy(List<TareaGreedy> listaTarea) {
		super();
		this.listaTarea = listaTarea;
		secuenciaÓptima = new Solucion(new LinkedList<>());
	}
	
	public Solucion greedy() {
		Collections.sort(listaTarea);
		int caducidadAct=0;
		while(!listaTarea.isEmpty()) {
			TareaGreedy mejorTarea = seleccionarMejorTarea();
			listaTarea.remove(mejorTarea);
			if(mejorTarea.getCaducidad() > caducidadAct) {
				secuenciaÓptima.mejorCamino.add(mejorTarea);
				caducidadAct++;
			}
		}
		if(secuenciaÓptima.mejorCamino!=null) {
			return secuenciaÓptima;
		}
		return null;
	}

	private TareaGreedy seleccionarMejorTarea() {
		TareaGreedy mejorTarea = this.listaTarea.get(0);
		return mejorTarea;
	}
	
	public void imprimirTareas() {
		for(int i=0; i<secuenciaÓptima.mejorCamino.size(); i++) {
			System.out.println(secuenciaÓptima.mejorCamino.get(i));
		}
	}
}
