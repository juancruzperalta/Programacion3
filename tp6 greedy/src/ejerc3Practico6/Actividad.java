package ejerc3Practico6;

public class Actividad implements Comparable<Actividad>{
	int horaComienzo;
	int horaFin;
	String nombreAct;
	
	public Actividad(int horaComienzo, int horaFin, String nombreAct) {
		super();
		this.horaComienzo = horaComienzo;
		this.horaFin = horaFin;
		this.nombreAct = nombreAct;
	}
	public int getHoraComienzo() {
		return horaComienzo;
	}
	public void setHoraComienzo(int horaComienzo) {
		this.horaComienzo = horaComienzo;
	}
	public int getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}
	public String toString() {
		return nombreAct + "---> | " + this.horaComienzo + " | " + this.horaFin;
	}@Override
    public int compareTo(Actividad otra) {
        // Ordenar por hora de fin (criterio greedy típico)
        return Integer.compare(this.horaFin, otra.horaFin);
    }
}
