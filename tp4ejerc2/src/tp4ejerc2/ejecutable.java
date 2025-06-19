package tp4ejerc2;

public class ejecutable {

	public static void main(String[] args) {
		empleado empleado = new empleado("jose", "juansito", 14500, 2, 7250);

		empleado empleado2 = new empleado("josssse", "juansito", 12200, 2, 6850);
		
		EmpleadoPorcentaje porcentaje = new EmpleadoPorcentaje("juan", "peralta", 14500, 4, 3, 506, 0.5);
		System.out.println(porcentaje.salarioVentasPorcentaje());
		
		EmpledoHoraExtra horaExtra = new EmpledoHoraExtra("jose", "siño", 12354, 10, 50, 35);
		
		System.out.println(horaExtra.sueldoHoraExtra());
	}

}
