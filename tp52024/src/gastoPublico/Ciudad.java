package gastoPublico;

import java.util.ArrayList;

public class Ciudad {
	int gastosMantenimiento;
	int habitantes;
	String nombreCiudad;
	ArrayList<Contribuyente> contribuyente; 

	public Ciudad() {
		this.habitantes = 0;
		this.gastosMantenimiento = 0;
		this.nombreCiudad = "Default";
	}
	public Ciudad(int habitantes, int gastosMantenimiento, String nombreCiudad) {
		this.habitantes = habitantes;
		this.gastosMantenimiento = gastosMantenimiento;
		this.nombreCiudad = nombreCiudad;
		contribuyente = new ArrayList<>();
	}
	public void addContribuyente(Contribuyente cont) {
		contribuyente.add(cont);
	}
	public int getGastosMantenimiento() {
		return gastosMantenimiento;
	}
	public void setGastosMantenimiento(int gastosMantenimiento) {
		this.gastosMantenimiento = gastosMantenimiento;
	}
	
	public double getMontoRecaudadoCiudad() {
		double valor=0;
		for(int i=0; i<contribuyente.size(); i++) {
			valor = contribuyente.get(i).getRecaudadoContribuyente();
		}
		return valor;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	
	
}
