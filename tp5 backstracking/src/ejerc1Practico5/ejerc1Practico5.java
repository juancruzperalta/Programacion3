package ejerc1Practico5;
import java.util.List;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Iterator;
public class ejerc1Practico5 {	

	Hashtable<Integer, List<Integer>> habitaciones;
	Solucion mejorSolucion;
	int numeroEntrada;
	int numeroSalida;

	
	public ejerc1Practico5(Hashtable<Integer, List<Integer>> habitaciones, Solucion mejorSolucion, int numeroEntrada,
			int numeroSalida) {
		super();
		this.habitaciones = habitaciones;
		this.mejorSolucion = mejorSolucion;
		this.numeroEntrada = numeroEntrada;
		this.numeroSalida = numeroSalida;
	}
	public void backTracking() {
		Estado estadoInicial = new Estado(new LinkedList<>(), 0, 1);
		
		backTracking(estadoInicial);
	}

	private void backTracking(Estado e) {
		if(e.numeroHabitacionActual() == numeroSalida) {
			if(mejorSolucion==null|| e.pasosActuales > mejorSolucion.cantidadDePasosDados) {
				mejorSolucion.cantidadDePasosDados = e.pasosActuales;
				mejorSolucion.habitacionesPasadas.clear();
				mejorSolucion.habitacionesPasadas.addAll(e.habitacionesVisitadas);
			}
		}else {
			List<Integer> hijos = habitaciones.get(e.numeroHabitacionActual());
			for(Integer hijo: hijos) {
				Integer habitacionActual = e.numeroHabitacionActual;
				e.avanzarSiguienteHabitacion(hijo);
				e.sumarUnPaso();
				e.confirmarQuePase(hijo);
					backTracking(e);
				e.retrocederHabitacion(habitacionActual);
				e.restarUnPaso();
				e.deshacerUltimoVisitado();
			}
		}
	}
	public void imprimirMetodo() {
		System.out.println(mejorSolucion.getCantidadDePasosDados());
		for(int i=0; i<mejorSolucion.habitacionesPasadas.size(); i++) {			
		System.out.println(mejorSolucion.habitacionesPasadas.get(i));
		}
	}
}
