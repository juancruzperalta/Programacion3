package tp4ejerc1;

public class sensor {
	private String zona;
	private boolean detectado;
	
	public sensor(String zona) {
		super();
		this.zona = zona;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public boolean isDetectado() {
		return detectado;
	}
	public void setDetectado(boolean detectado) {
		this.detectado = detectado;
	}
	
	
}
//alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
//se detectó un movimiento dentro del domicilio.