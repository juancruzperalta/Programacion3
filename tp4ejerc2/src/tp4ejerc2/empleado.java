package tp4ejerc2;

public class empleado {
	private String nombre;
	private String apellido;
	private int sueldoFijo;
	private int horasTrabajadas;
	private double gananciaHora;
	public empleado(String nombre, String apellido, int sueldoFijo, int horasTrabajadas, double gananciaHora) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoFijo = sueldoFijo;
		this.horasTrabajadas = horasTrabajadas;
		this.gananciaHora = gananciaHora;
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
	public int getSueldoFijo() {
		return sueldoFijo;
	}
	public void setSueldoFijo(int sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double getGananciaHora() {
		return gananciaHora;
	}
	public void setGananciaHora(double gananciaHora) {
		this.gananciaHora = gananciaHora;
	}
	public double gananciaTotalEmpleado() {
		return this.getSueldoFijo();
	}
}
//Sueldos
//Una empresa de informática posee tres tipos de empleados. Los empleados contratados
//reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
//por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
//Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
//cantidad de ventas realizadas.
//Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
//la semana.