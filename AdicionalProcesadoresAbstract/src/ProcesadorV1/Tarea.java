package ProcesadorV1;

public class Tarea {
	protected int prioridad;
	protected int usoMemoria;
	protected int usoCpu;
	
	public Tarea(int prioridad, int usoMemoria, int usoCpu) {
		this.prioridad = prioridad;
		this.usoMemoria = usoMemoria;
		this.usoCpu = usoCpu;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public int getUsoMemoria() {
		return usoMemoria;
	}
	public void setUsoMemoria(int usoMemoria) {
		this.usoMemoria = usoMemoria;
	}
	public int getUsoCpu() {
		return usoCpu;
	}
	public void setUsoCpu(int usoCpu) {
		this.usoCpu = usoCpu;
	}
	
	public String ejecutar() {
		return "JAJAJAJAJ";
	}
}
