package Procesador;

public class Tarea {
	double prioridad;
	double memoria;
	double cpu;
	
	public Tarea(double prioridad, double memoria, double cpu) {
		this.prioridad = prioridad;
		this.memoria = memoria;
		this.cpu = cpu;
	}
	public double getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(double prioridad) {
		this.prioridad = prioridad;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	
	public String toString() {
		return "<"+ "Prioridad" + this.getPrioridad() + "," + "Cpu" + this.getCpu() + "," + "Memoria"+ this.getMemoria();
	}
}
