package RegistroEmpresa;

public class Empleado extends Persona {

	int numeroLegajo;
	int sueldo;
	
	public Empleado(String nombre, String apellido, int edad, int numeroLegajo, int sueldo) {
		super(nombre, apellido, edad);
		this.numeroLegajo = numeroLegajo;
		this.sueldo = sueldo;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String toString() {
		return "Empleado -" +"\t" + super.toString() +"\t"+ "Legajo" +"\t"+ numeroLegajo +"\t"+ "Sueldo" +"\t"+ sueldo;
	}
	


}
