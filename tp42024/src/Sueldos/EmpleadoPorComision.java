package Sueldos;

public class EmpleadoPorComision extends Empleado {
	int ventas;
	double comisionPorVenta;

	public EmpleadoPorComision(String nombre, int horasTrabajadas, int salarioFijo, int ventas, double comisionPorVenta) {
		super(nombre, horasTrabajadas, salarioFijo);
		this.ventas= ventas;
		this.comisionPorVenta = comisionPorVenta;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public double valorAumentadoPorComisionYVenta() {
		return this.getVentas()*this.comisionPorVenta;
	}
//Lo que hace esto es que al vender 10 por ejemplo, y una comisión de 10% por venta te sumaría 100$
	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}

	public double getSalarioFinalPorVenta() {
		return this.getSalarioFijo()+this.valorAumentadoPorComisionYVenta();
	}
//Aca al salario fijo le sumamos los 100$
	public static void main(String[]args) {
		EmpleadoPorComision ee = new EmpleadoPorComision("Lorena", 20, 1250, 10, 10);
		System.out.println("Ganancia de ventas y comision\t "+ ee.valorAumentadoPorComisionYVenta());
		System.out.println("Nombre\t" + ee.getNombre());
		System.out.println("Salario\t" + ee.getSalarioFijo());
		System.out.println("Salario final por venta sumada\t" + ee.getSalarioFinalPorVenta());
	}
}
