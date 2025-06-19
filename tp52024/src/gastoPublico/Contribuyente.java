package gastoPublico;

import java.util.ArrayList;

public class Contribuyente {
	protected String nombre;
	protected int codigoIdentTri;
	protected double montoFijo;
	protected double getMontoFijoPorcentaje;
	ArrayList<ContribuyenteComerciante> contriComer;
	ArrayList<ContribuyenteProgramador> contriProg;
	
	public Contribuyente(String nombre, int codigoIdentTri, double montoFijo, double getMontoFijoPorcentaje) {
		this.nombre = nombre;
		this.codigoIdentTri = codigoIdentTri;
		this.montoFijo = montoFijo;
		this.getMontoFijoPorcentaje = getMontoFijoPorcentaje;
		contriComer = new ArrayList<>();
		contriProg = new ArrayList<>();
	}

	public void addContribuyenteComerciante(ContribuyenteComerciante cc) {
		contriComer.add(cc);
	}
	public void addContribuyenteProgramador(ContribuyenteProgramador cp) {
		contriProg.add(cp);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMontoFijoPorcentaje() {
		return getMontoFijoPorcentaje;
	}

	public void setGetMontoFijoPorcentaje(double getMontoFijoPorcentaje) {
		this.getMontoFijoPorcentaje = getMontoFijoPorcentaje;
	}

	public int getCodigoIdentTri() {
		return codigoIdentTri;
	}

	public void setCodigoIdentTri(int codigoIdentTri) {
		this.codigoIdentTri = codigoIdentTri;
	}

	public double getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	
	public double getRecaudadoContribuyente() {
		return this.getMontoFijo()*this.getMontoFijoPorcentaje()/100;
	}
	
}
