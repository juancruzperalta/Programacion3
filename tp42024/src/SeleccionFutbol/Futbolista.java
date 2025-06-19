package SeleccionFutbol;

import java.time.LocalDate;

public class Futbolista extends Contingente {
	
	String posicion;
	String pierna;
	int goles;
	
	public Futbolista(String nombre, String apellido, int pasaporte,
			LocalDate fechaNac, String estado, String posicion, String pierna, int goles) {
		super(nombre, apellido, pasaporte, fechaNac, estado);
		this.posicion = posicion;
		this.pierna = pierna;
		this.goles = goles;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getPierna() {
		return pierna;
	}

	public void setPierna(String pierna) {
		this.pierna = pierna;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	
	public static void main(String[]args) {
		Futbolista ff = new Futbolista("Juan","Peralta",45398154, LocalDate.of(2003, 9, 30), "En pais de origen", "Delantero", "Derecha", 30);
		
		System.out.println("Nombre\t" + ff.getNombre() + "\t" + ff.getApellido());
		System.out.println("Fecha nac\t" + ff.getFechaNac());
		System.out.println("Pierna y posicion\t" + ff.getPierna() + "\t" + ff.getPosicion());
		System.out.println("goles\t" + ff.getGoles());
		System.out.println("¿Puede jugar?\t"+ ff.puedeJugar());
		
	}
	
	
}
