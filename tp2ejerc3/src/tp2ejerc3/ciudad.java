package tp2ejerc3;

import java.util.ArrayList;

public class ciudad{

	private int habitantes;
	private String nombre;
	private int montoRecaudado;
	private int gastosCiudad;
	ArrayList<impuestos> imps;
	
	public ciudad(int habitantes, String nombre, int montoRecaudado, int gastos) {
		this.habitantes = habitantes;
		this.nombre = nombre;
		this.gastosCiudad = gastos;
		this.montoRecaudado = montoRecaudado;
		imps = new ArrayList<impuestos>();
	}
	
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public impuestos getImpuestos(int i) {
			i = i-1;
			if ((i>=0) && ( i<imps.size())) {
				return imps.get(i);
			}
			
			return null;
	}
	public void addImpuestos(impuestos imp) {
		imps.add(imp);
	}
	public int getGastosCiudad() {
		return gastosCiudad;
	}
	public void setGastosCiudad(int gastosCiudad) {
		this.gastosCiudad = gastosCiudad;
	}
	
	public int getMontoRecaudado() {
		return montoRecaudado;
	}

	public void setMontoRecaudado(int montoRecaudado) {
		this.montoRecaudado = montoRecaudado;
	}

	public int deficit() {
		if(getGastosCiudad()>getMontoRecaudado()) {
			return getGastosCiudad()-getMontoRecaudado();
		}
		return 0;
	}
	
	
}
