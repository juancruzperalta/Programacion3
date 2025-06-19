package Procesados;

public class Tarea{
	
	protected int cpu;
	protected int memoria;
	protected int prioridad;
	
	public Tarea(int cpu, int memoria, int prioridad) {
		this.cpu = cpu;
		this.memoria = memoria;
		this.prioridad = prioridad;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public void ejecutarTarea(Tarea t1) {
		System.out.println("Hola tarea ejecutada jajaajajaj");
	}
	
}