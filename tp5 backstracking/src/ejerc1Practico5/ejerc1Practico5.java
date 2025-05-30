package ejerc1Practico5;
import java.util.List;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Iterator;
public class ejerc1Practico5 {	

	Hashtable<Integer, List<Integer>> habitaciones;
	Solucion mayoresPasosDados;
	int numeroEntrada;
	int numeroSalida;

	
	public ejerc1Practico5(Hashtable<Integer, List<Integer>> habitaciones, int numeroEntrada,
			int numeroSalida) {
		super();
		this.habitaciones = habitaciones;
		this.numeroEntrada = numeroEntrada;
		this.numeroSalida = numeroSalida;
	}
	public void backTracking() {
		Estado estadoInicial = new Estado(new LinkedList<>(), 0, 1);
		mayoresPasosDados = new Solucion(new LinkedList<>(), 0);
		backTracking(estadoInicial);
	}

	private void backTracking(Estado e) {
		if(e.numeroHabitacionActual() == numeroSalida) {
			if(mayoresPasosDados==null|| e.pasosActuales > mayoresPasosDados.cantidadDePasosDados) {
				mayoresPasosDados.habitacionesPasadas.clear();
				mayoresPasosDados.cantidadDePasosDados = e.pasosActuales;
				mayoresPasosDados.habitacionesPasadas.addAll(e.habitacionesVisitadas);
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
		for(int i=0; i<mayoresPasosDados.habitacionesPasadas.size(); i++) {			
		System.out.println("Paso por ->" + mayoresPasosDados.habitacionesPasadas.get(i));
		}
		System.out.println("Pasos dados "+ mayoresPasosDados.getCantidadDePasosDados());
	}
}
