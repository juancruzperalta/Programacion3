package ejerc1Practico5;
import java.util.List;
import java.util.LinkedList;
public class Solucion {
	List<Integer> habitacionesPasadas = new LinkedList<>();
	int cantidadDePasosDados;
	public Solucion(List<Integer> habitacionesPasadas, int cantidadDePasosDados) {
		super();
		this.habitacionesPasadas = habitacionesPasadas;
		this.cantidadDePasosDados = cantidadDePasosDados;
	}
	public int getCantidadDePasosDados() {
		return cantidadDePasosDados;
	}
	public void setCantidadDePasosDados(int cantidadDePasosDados) {
		this.cantidadDePasosDados = cantidadDePasosDados;
	}
	public List<Integer> getHabitacionesPasadas() {
		return habitacionesPasadas;
	}
	public void setHabitacionesPasadas(List<Integer> habitacionesPasadas) {
		this.habitacionesPasadas = habitacionesPasadas;
	}
	
}
