package EmpleadoV3;

public class calcularVenta extends calcularSueldo {
	private int ventas;
	
	public calcularVenta(int ventas) {
		this.ventas = ventas;
	}


	public int getVentas() {
		return ventas;
	}


	public void setVentas(int ventas) {
		this.ventas = ventas;
	}


	@Override
	public double calcularPago(Empleado e1) {
		return this.getVentas()*e1.getComision()/100;
	}

}
