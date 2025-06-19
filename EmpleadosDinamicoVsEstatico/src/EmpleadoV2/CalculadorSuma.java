package EmpleadoV2;

public class CalculadorSuma extends CalcularSueldo {

	CalcularSueldo c1;
	CalcularSueldo c2;
	
	public CalculadorSuma(CalcularSueldo c1, CalcularSueldo c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	public double liquidarSueldo(Empleado ee) {
		return c1.liquidarSueldo(ee)+c2.liquidarSueldo(ee);
	}

}
