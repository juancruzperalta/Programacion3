package EmpleadoV3;

public class calcularHoraExtra extends calcularSueldo {
	double precioHoraExtra;
	
	
	
	public calcularHoraExtra(double precioHoraExtra) {
		super();
		this.precioHoraExtra = precioHoraExtra;
	}



	public double getPrecioHoraExtra() {
		return precioHoraExtra;
	}



	public void setPrecioHoraExtra(double precioHoraExtra) {
		this.precioHoraExtra = precioHoraExtra;
	}



	@Override
	public double calcularPago(Empleado e1) {
		return e1.getHorasExtra()*precioHoraExtra;
	}

}
