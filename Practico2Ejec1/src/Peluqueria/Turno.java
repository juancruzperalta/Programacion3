package Peluqueria;

import java.time.LocalDate;

public class Turno {
	String nombre;
	Peluqueria peluquero;
	LocalDate dia;

	public Turno(String nombre, Peluqueria peluquero, LocalDate dia) {
		this.nombre = nombre;
		this.peluquero = peluquero;
		this.dia = dia;
	}
	
	public Peluqueria getPeluquero() {
		return peluquero;
	}

	public void setPeluquero(Peluqueria peluquero) {
		this.peluquero = peluquero;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
}
