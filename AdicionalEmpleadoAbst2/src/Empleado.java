
public abstract class Empleado {
	protected String nombre;
	protected int nroLegajo;

	public Empleado(String nombre, int nroLegajo) {

		this.nombre = nombre;
		this.nroLegajo = nroLegajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	
	public abstract double getSueldo();
	
	public String toString() {
		return "<"+"Nombre"+" | "+this.getNombre() +" | "+ "Legajo" +" | "+ this.getNroLegajo() +" | "+ "Sueldo" +" | "+ this.getSueldo() +">";
	}
	public boolean equals(Object o1) {
		try {
		Empleado e1 = (Empleado) o1;
		return e1.getNroLegajo() == this.getNroLegajo();
		}catch(Exception exc) {
			return false;
		}
	}
}
/*
La empresa desa poder organizar el manejo de sueldos de sus 
empleados. De cada empleado guarda nombre, nro de Legajo. 
Hay empleados que cobran un sueldo fijo, otros cobra un 
sueldo que es las ventas por un porcentaje y otros cobrar 
por las horas trabajadas
Se desea poder calcular el total que debe pagará la empresa 
en concepto de sueldos
También imprimir un listado de todos los empleado*/
