package SeleccionFutbol;

import java.time.LocalDate;

public class Masajista extends Contingente{
	String titulo;
	int CantExperiencia;
	public Masajista(String nombre, String apellido, int pasaporte, LocalDate fechaNac, String estado, String titulo, int CantExperiencia) {
		super(nombre, apellido, pasaporte, fechaNac, estado);
		
		this.titulo = titulo;
		this.CantExperiencia = CantExperiencia;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getCantExperiencia() {
		return CantExperiencia;
	}
	public void setCantExperiencia(int cantExperiencia) {
		CantExperiencia = cantExperiencia;
	}
	
	
}
