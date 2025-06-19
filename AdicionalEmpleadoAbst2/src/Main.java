
public class Main {
	public static void main(String[]args) {
		Empresa ee = new Empresa();
		EmpleadoHorasExtra e1 = new EmpleadoHorasExtra("Juan", 1, 200, 200);
		EmpleadoPorVentas e2 = new EmpleadoPorVentas("Josesiño", 2, 2000, 10);
		EmpleadoSueldoFijo e3 = new EmpleadoSueldoFijo("Alberto",3,200);
		ee.addEmpleado(e1);
		ee.addEmpleado(e2);
		ee.addEmpleado(e3);

		System.out.println(ee.listadoEmpleado());
		System.out.println(ee.gastoTotal());
	}
}
