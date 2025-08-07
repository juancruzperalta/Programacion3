package ejerc3;

public class Actividad implements Comparable<Actividad>{
	int tiempoComienzo;
	int tiempoFin;
	public Actividad(int tiempoComienzo, int tiempoFin) {
		super();
		this.tiempoComienzo = tiempoComienzo;
		this.tiempoFin = tiempoFin;
	}
	public int getTiempoComienzo() {
		return tiempoComienzo;
	}
	public void setTiempoComienzo(int tiempoComienzo) {
		this.tiempoComienzo = tiempoComienzo;
	}
	public int getTiempoFin() {
		return tiempoFin;
	}
	public void setTiempoFin(int tiempoFin) {
		this.tiempoFin = tiempoFin;
	}
	@Override
	public int compareTo(Actividad o) {
	    return Integer.compare(this.tiempoComienzo+this.tiempoFin, o.tiempoComienzo+o.tiempoFin);
	}
	@Override
	public String toString() {
		return "Actividad [tiempoComienzo=" + tiempoComienzo + ", tiempoFin=" + tiempoFin + "]";
	}
	
}
