package RegistroEmpresa;

import java.util.ArrayList;

public class Jerarquico extends Persona{

	int numeroLegajo;
	int sueldo;
	ArrayList<Empleado> empleados;
	
	public Jerarquico(String nombre, String apellido, int edad, int numeroLegajo, int sueldo) {
		super(nombre, apellido, edad);
		this.numeroLegajo= numeroLegajo;
		this.sueldo = sueldo;
		empleados = new ArrayList<>();
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
	
	public String listaEmpleadosACargo() {
		String empl = "";
		for(int i=0; i<empleados.size(); i++) {
			empl += empleados.get(i).getNombre();
		}
		return empl;
	}
	public void addEmpleadosACargo(Empleado e) {
		if(e != null) {
			empleados.add(e);
		}
	}
	
	public String toString() {
		return "Empleados a Cargo" + "\t" + this.listaEmpleadosACargo() + "\t" + "Legajo"+ "\t" + numeroLegajo 
				+"\t" + "sueldo" +"\t"+ sueldo;
	}
	
}
