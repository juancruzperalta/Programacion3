package EjercicioEmpleado;

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
	
	public boolean equals(Object o1) {
		Empleado eOtro = (Empleado) o1;
		return eOtro.getNroLegajo() == this.getNroLegajo();
		
	}
	
	public String toString() {
		return "<"+this.getNombre() + "------" + this.getNroLegajo()+ "------" + this.getSueldo()+">";
	}
}
