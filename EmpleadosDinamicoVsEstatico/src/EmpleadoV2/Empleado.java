package EmpleadoV2;

public class Empleado {
	protected String nombre;
	protected int dni;
	protected double sueldo;
	private CalcularSueldo ss;
	protected double porcentaje;
	
	public Empleado(String nombre, int dni, double sueldo, double porcentaje) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		ss = new CalculadorSueldoFijo(sueldo);
		this.porcentaje = porcentaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldo(Empleado ee) {
		return ss.liquidarSueldo(ee);
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public void cambiarTipoCalculo(CalcularSueldo cs) {
		ss = cs;
	}
	
}
