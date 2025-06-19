package SeleccionFutbol;

import java.time.LocalDate;

public class Entrenador extends Contingente{

	int identificadorFederacion;
	
	public Entrenador(String nombre, String apellido, int pasaporte, LocalDate fechaNac, String estado, int identificadorFederacion) {
		super(nombre, apellido, pasaporte, fechaNac, estado);
		this.identificadorFederacion = identificadorFederacion;
	}

	public int getIdentificadorFederacion() {
		return identificadorFederacion;
	}

	public void setIdentificadorFederacion(int identificadorFederacion) {
		this.identificadorFederacion = identificadorFederacion;
	}
	
	

}
