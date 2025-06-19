package Sueldos;

public class EmpleadoHorasExtra extends Empleado {
	
	double comisionHorasExtra = 0;

	public EmpleadoHorasExtra(String nombre, int horasTrabajadas, int salarioFijo, double comisionHorasExtra) {
		super(nombre, horasTrabajadas, salarioFijo);
		this.comisionHorasExtra = comisionHorasExtra;
		
	}
	public double getSalarioHorasExtra() {
		return this.getSalarioFijo()+((this.getComisionHorasExtra()/100)*this.getSalarioFijo());
	}
	
	public double getComisionHorasExtra() {
		return comisionHorasExtra;
	}

	public void setComisionHorasExtra(double comisionHorasExtra) {
		this.comisionHorasExtra = comisionHorasExtra;
	}
	
	

	public static void main(String[]args) {
		EmpleadoHorasExtra  ee = new EmpleadoHorasExtra("Josefa", 20, 3000, 25);
		System.out.println("nombre\t"+ ee.getNombre());
		System.out.println("salario\t"+ ee.getSalarioFijo());
		System.out.println("horas trabajadas\t" + ee.getHorasTrabajadas());
		System.out.println("salario con horas extra\t" +ee.getSalarioHorasExtra());
	}
}
