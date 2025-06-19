package EmpleadoV2;

public class Main {

	public static void main(String[] args) {
		Empleado ee = new Empleado("Juan", 45398154, 200, 20);
		CalcularSueldo cs = new CalculadorSueldoFijo(400);
		CalcularSueldo cs2 = new CalculadorVentasPorcentaje(20, 1000);
		CalcularSueldo cs3 = new CalculadorHorasExtra(200, 200);
		ee.cambiarTipoCalculo(cs3);
		CalcularSueldo cs4 = new CalculadorSuma(cs, cs3);
		ee.cambiarTipoCalculo(cs4);
		System.out.println(ee.getSueldo(ee));
	}

}
