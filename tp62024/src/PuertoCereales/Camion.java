package PuertoCereales;

import java.time.LocalDate;

public class Camion extends ListaOrdenada{
	private String nombre;
	private String toneladas;
	private LocalDate fecha_carga;
	
	
	
	public Camion(String nombre, String toneladas, LocalDate fecha_carga) {
		this.nombre = nombre;
		this.toneladas = toneladas;
		this.fecha_carga = fecha_carga;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getToneladas() {
		return toneladas;
	}
	public void setToneladas(String toneladas) {
		this.toneladas = toneladas;
	}
	public int getFecha_carga() {
		return fecha_carga.lengthOfMonth();
	}
	public void setFecha_carga(LocalDate fecha_carga) {
		this.fecha_carga = fecha_carga;
	}
	public boolean sosMayor(ListaOrdenada l1) {
		return this.getFecha_carga()<((Camion)l1).getFecha_carga();
	}
	
	
}
