package ejerc3Practico6;

import java.util.List;

public class Solucion {
	List<Actividad> actSolucion;
	int cantidadActEncontradas;
	

	public Solucion(List<Actividad> actSolucion, int cantidadActEncontradas) {
		super();
		this.actSolucion = actSolucion;
		this.cantidadActEncontradas = cantidadActEncontradas;
	}

	public int getCantidadActEncontradas() {
		return cantidadActEncontradas;
	}

	public void setCantidadActEncontradas(int cantidadActEncontradas) {
		this.cantidadActEncontradas = cantidadActEncontradas;
	}

	public List<Actividad> getActSolucion() {
		return actSolucion;
	}

	public void setActSolucion(List<Actividad> actSolucion) {
		this.actSolucion = actSolucion;
	}
	
}
