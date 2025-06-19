package EmpleadoV3;

public class calcularSuma extends calcularSueldo {

	protected calcularSueldo c1;
	protected calcularSueldo c2;
	
	public calcularSuma(calcularSueldo c1, calcularSueldo c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public double calcularPago(Empleado e1) {
		return c1.calcularPago(e1)+c2.calcularPago(e1);
	}

}
