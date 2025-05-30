package ejerc3Practico6;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class ejerc3Practico6 {
	List<Actividad> conjAct;
	Actividad actActual;
	Solucion mejorSolucionEncontrada;
	public ejerc3Practico6(List<Actividad> conjAct) {
		super();
		this.conjAct = conjAct;
		mejorSolucionEncontrada = new Solucion(new LinkedList<>(), 0);
	}
	
	public Solucion greedy() {
		Collections.sort(conjAct); //ordeno el arr
		actActual = conjAct.get(0); //tomo la primera actividad del conjunto
		mejorSolucionEncontrada.actSolucion.add(actActual); //La añado
		mejorSolucionEncontrada.cantidadActEncontradas++; //sumo una vez como encontrada
		conjAct.remove(actActual); //la remuevo, para que la próxima comience como 0, la primera
		//como el arr está ordenado, la mejor sería la primera
		while(!conjAct.isEmpty() && actActual.getHoraComienzo()>0) {
			Actividad mejorSelec = seleccionarMejorActividad();//tomo la primera nueva
			conjAct.remove(mejorSelec);//la saco
			if(actActual.getHoraComienzo() >= mejorSelec.getHoraFin() //hago lo que dice el enunciado
					//ci >= fj (comienzo de actual, es mayor a la hora de fin de la siguiente)
					|| mejorSelec.getHoraComienzo() >= actActual.getHoraFin()) {
				mejorSolucionEncontrada.actSolucion.add(mejorSelec); //agrego la sig
				mejorSolucionEncontrada.cantidadActEncontradas++;//sumo una vez
				actActual = mejorSelec;//vuelvo la sig a la actual así cuando entro vuelve a hacer
				//lo mismo, la siguiente se pone en la pos que estaba la actActual anterior.
			}else {
				conjAct.remove(mejorSelec);//si no lo saco y pruebo con la sig...
			}
		}
		if(mejorSolucionEncontrada.actSolucion!=null) {
			return mejorSolucionEncontrada;
		}
		return null;
	}

	private Actividad seleccionarMejorActividad() {
		Actividad primera = conjAct.get(0);
		return primera;
	}
	
	public void imprimirActividad() {
		for(int i=0; i<mejorSolucionEncontrada.actSolucion.size(); i++) {
			System.out.println(mejorSolucionEncontrada.actSolucion.get(i));
		}
		System.out.println(mejorSolucionEncontrada.getCantidadActEncontradas());
	}
}
