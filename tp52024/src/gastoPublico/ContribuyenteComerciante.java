package gastoPublico;

public class ContribuyenteComerciante extends Contribuyente {
	private double montoPorcentaje;
	private double ventas;
	
	public ContribuyenteComerciante(String nombre, int codigoIdentTri, double montoFijo,
			double getMontoFijoPorcentaje, double montoPorcentaje, double ventas) {
		super(nombre, codigoIdentTri, montoFijo, getMontoFijoPorcentaje);
		this.montoPorcentaje = montoPorcentaje;
		this.ventas = ventas;
	}

	public double getMontoPorcentaje() {
		return montoPorcentaje;
	}

	public void setMontoPorcentaje(double montoPorcentaje) {
		this.montoPorcentaje = montoPorcentaje;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	public double getRecaudadoContribuyente() {
		double montoFijo= super.getRecaudadoContribuyente();
		double recaudadoVenta = this.getVentas()*this.getMontoPorcentaje()/100;
		
		return montoFijo + recaudadoVenta;
	}
}
