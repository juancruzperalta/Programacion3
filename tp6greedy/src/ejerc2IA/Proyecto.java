package ejerc2IA;

public class Proyecto implements Comparable<Proyecto>{
	int fechaLimite;
	int duracion;
	int valorBeneficio;
	public Proyecto(int fechaLimite, int duracion, int valorBeneficio) {
		super();
		this.fechaLimite = fechaLimite;
		this.duracion = duracion;
		this.valorBeneficio = valorBeneficio;
	}
	public int getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(int fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public int getValorBeneficio() {
		return valorBeneficio;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public void setValorBeneficio(int valorBeneficio) {
		this.valorBeneficio = valorBeneficio;
	}
	@Override
	public String toString() {
		return "Proyecto [fechaLimite=" + fechaLimite + ", duracion=" + duracion + ", valorBeneficio=" + valorBeneficio
				+ "]";
	}
	@Override
	public int compareTo(Proyecto o) {
		return Integer.compare(this.valorBeneficio, o.valorBeneficio);
	}
	
	
}
