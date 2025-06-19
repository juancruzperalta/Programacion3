package SeleccionFutbol;

import java.time.LocalDate;

public class Contingente {
	String nombre;
	String apellido;
	int pasaporte;
	LocalDate fechaNac;
	String estado;
	
	public Contingente(String nombre, String apellido, int pasaporte, LocalDate fechaNac, String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
		this.fechaNac = fechaNac;
		this.estado = estado;
	}

	public boolean puedeJugar() {
		if(this.estado == "Viajando") {
			return false;
		}else if(this.estado == "En concentración") {
			return false;
		}
		else if(this.estado == "En pais de origen"){
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	
	
	
}
//Entrenador identificador
//Masajistas: titulo y años de experiencia
