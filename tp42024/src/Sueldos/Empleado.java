package Sueldos;

public class Empleado {
	String nombre;
	int horasTrabajadas;
	int salarioFijo;
	
	public Empleado(String nombre, int horasTrabajadas, int salarioFijo) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioFijo = salarioFijo;
	}

	public final String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getSalarioFijo() {
		return salarioFijo;
	}

	public void setSalarioFijo(int salarioFijo) {
		this.salarioFijo = salarioFijo;
	}

	public static void main(String[]args) {
		Empleado ee = new Empleado("Juan",12,1200);
		System.out.println("Empleado\t"+ ee.getNombre());
		System.out.println("Salario fijo\t" +ee.getSalarioFijo());
		System.out.println("Horas trabajadas\t"+ ee.getHorasTrabajadas());
	}
}