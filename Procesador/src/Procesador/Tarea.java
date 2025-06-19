package Procesador;

public class Tarea {

	double cpu;
	int prioridad;
	double memoria;
	
	public Tarea(double cpu, int prioridad, double memoria) {
		this.cpu = cpu;
		this.prioridad = prioridad;
		this.memoria = memoria;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	
	public void ejecutar() {
		//ACA IRIA LA EJECUCION REAL DE LA TAREA
		System.out.println("Se ejecuto tarea<"+cpu+","+prioridad+","+memoria+">");
	}
	
}
