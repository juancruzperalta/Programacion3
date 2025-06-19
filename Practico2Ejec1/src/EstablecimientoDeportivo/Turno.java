package EstablecimientoDeportivo;

import java.time.LocalDate;
import java.time.LocalTime;
public class Turno {
	String nombre;
	LocalTime hora;
	LocalDate dia;
	public Turno(String nombre, LocalTime hora, LocalDate dia) {
		this.nombre = nombre;
		this.hora = hora;
		this.dia = dia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	public boolean esSocio() {
		return false;
	}
}
