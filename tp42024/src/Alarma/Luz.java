package Alarma;

public class Luz{
	boolean LuzActiva;
	
	
	public Luz() {
		super();
	}
	public void enciendoLaLuz() {
		this.LuzActiva = true;
	}
	public void apagarLaLuz() {
		this.LuzActiva = false;
	}
	public boolean isLuzActiva() {
		return LuzActiva;
	}
}
