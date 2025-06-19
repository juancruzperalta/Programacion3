package gastoPublico;

public class ContribuyenteProgramador extends Contribuyente {
	private double facturadoSoftware;
	private double montoPorcentajeSoftware;
	public ContribuyenteProgramador(String nombre, int codigoIdentTri, double montoFijo,
			double getMontoFijoPorcentaje, double facturadoSoftware, double montoPorcentajeSoftware) {
		super(nombre, codigoIdentTri, montoFijo, getMontoFijoPorcentaje);
		this.facturadoSoftware = facturadoSoftware;
		this.montoPorcentajeSoftware = montoPorcentajeSoftware;
	}
	public double getFacturadoSoftware() {
		return facturadoSoftware;
	}
	public void setFacturadoSoftware(double facturadoSoftware) {
		this.facturadoSoftware = facturadoSoftware;
	}
	public double getMontoPorcentajeSoftware() {
		return montoPorcentajeSoftware;
	}
	public void setMontoPorcentajeSoftware(double montoPorcentajeSoftware) {
		this.montoPorcentajeSoftware = montoPorcentajeSoftware;
	}
	
	public double getRecaudadoContribuyente() {
		double valorFijo = super.getRecaudadoContribuyente();
		double valorSoftware = this.getFacturadoSoftware()*this.getMontoPorcentajeSoftware()/100;
		return valorFijo + valorSoftware;
	}
}
