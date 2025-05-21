package ejerc1Practico5;
import java.util.List;
import java.util.LinkedList;
public class Estado {
	List<Integer> habitacionesVisitadas = new LinkedList<>();
	int pasosActuales;
	int numeroHabitacionActual;


	public Estado(List<Integer> habitacionesVisitadas, int pasosActuales, int numeroHabitacionActual) {
		super();
		this.habitacionesVisitadas = habitacionesVisitadas;
		this.pasosActuales = pasosActuales;
		this.numeroHabitacionActual = numeroHabitacionActual;
	}
	public int getPasosActuales() {
		return pasosActuales;
	}
	public void setPasosActuales(int pasosActuales) {
		this.pasosActuales = pasosActuales;
	}
	public int numeroHabitacionActual() {
		return this.numeroHabitacionActual;
	}
	public void avanzarSiguienteHabitacion(Integer habitacionSiguiente) {
		this.numeroHabitacionActual = habitacionSiguiente;
	}
	public void sumarUnPaso() {
		this.pasosActuales++;
	}
	public void confirmarQuePase(Integer habitacionPasada) {
		habitacionesVisitadas.add(habitacionPasada);
	}
	public void retrocederHabitacion(Integer habitacionAnterior) {
		this.numeroHabitacionActual = habitacionAnterior;
	}
	public void restarUnPaso() {
		this.pasosActuales--;
	}
	public void deshacerUltimoVisitado() {
		this.habitacionesVisitadas.remove(habitacionesVisitadas.size()-1);
	}
	
	
}
