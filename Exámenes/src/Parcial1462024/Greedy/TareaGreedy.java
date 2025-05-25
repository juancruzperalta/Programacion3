package Parcial1462024.Greedy;

public class TareaGreedy implements Comparable<TareaGreedy>{
	int tiempoEjec;
	int puntaje;
	int caducidad;
	String nombre;

	public TareaGreedy(int tiempoEjec, int puntaje, int caducidad, String nombre) {
		super();
		this.tiempoEjec = tiempoEjec;
		this.puntaje = puntaje;
		this.caducidad = caducidad;
		this.nombre = nombre;
	}
	public int getTiempoEjec() {
		return tiempoEjec;
	}
	public void setTiempoEjec(int tiempoEjec) {
		this.tiempoEjec = tiempoEjec;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public int getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}
	@Override
	public int compareTo(TareaGreedy o) {
	    return Integer.compare(o.getPuntaje(), this.getPuntaje()); // Mayor puntaje primero
	}
	
	public String toString() {
		return this.nombre + "---> " + this.getPuntaje() + " | " + this.getCaducidad();
	}
	
}
