package AlarmaSensorial;

public class Sensor {
	boolean hayAlguien;
	String zona;
	public Sensor(String zona) {
		super();
		this.hayAlguien = false;
		this.zona = zona;
	}
	public boolean isHayAlguien() {
		return hayAlguien;
	}
	public void setHayAlguien(boolean hayAlguien) {
		this.hayAlguien = hayAlguien;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	
}
