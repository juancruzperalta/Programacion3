package Avicola;

public class CongeladoPorAire{
	double nitrogeno;
	double oxigeno;
	double dioxidoDeCarbono;
	double vaporDeAgua;
	public CongeladoPorAire(double nitrogeno, double oxigeno, double dioxidoDeCarbono, double vaporDeAgua) {
	
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dioxidoDeCarbono = dioxidoDeCarbono;
		this.vaporDeAgua = vaporDeAgua;
	}
	public double getNitrogeno() {
		return nitrogeno;
	}
	public void setNitrogeno(double nitrogeno) {
		this.nitrogeno = nitrogeno;
	}
	public double getOxigeno() {
		return oxigeno;
	}
	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}
	public double getDioxidoDeCarbono() {
		return dioxidoDeCarbono;
	}
	public void setDioxidoDeCarbono(double dioxidoDeCarbono) {
		this.dioxidoDeCarbono = dioxidoDeCarbono;
	}
	public double getVaporDeAgua() {
		return vaporDeAgua;
	}
	public void setVaporDeAgua(double vaporDeAgua) {
		this.vaporDeAgua = vaporDeAgua;
	}

	
}
