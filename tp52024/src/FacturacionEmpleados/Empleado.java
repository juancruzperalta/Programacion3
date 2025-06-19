package FacturacionEmpleados;

public class Empleado {
	protected String nombre;
	protected String apellido;
	protected static int dni=1;
	protected double sueldoMensual;

	
	public Empleado(String nombre, String apellido,double sueldoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		dni++;
		this.sueldoMensual = sueldoMensual;
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

	public int getDni() {
		return dni;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	public String toString() {
			return "Empleado{"+ this.getNombre()+","+this.getApellido() 
			                +"," + this.getDni() +"}";
	}
	
	
}
//Empleado: nombre, apellido, dni, sueldo mensual
//Algunos son vendedores: sueldo basico + extrra por venta
//Listado de empleados: suma total de gastos en sueldos
//Agregar nuevos empleados:
//empleado con bonos: bono adicional si logran un numero de ventas
