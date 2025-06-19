package Avicola;

public class CongeladoPorAgua{
	double gramosSal;
	double litrosAgua;
	
	public CongeladoPorAgua(double gramosSal, double litrosAgua) {
		this.gramosSal = gramosSal;
		this.litrosAgua = litrosAgua;
	}

	public double getGramosSal() {
		return gramosSal;
	}

	public void setGramosSal(double gramosSal) {
		this.gramosSal = gramosSal;
	}

	public double getLitrosAgua() {
		return litrosAgua;
	}

	public void setLitrosAgua(double litrosAgua) {
		this.litrosAgua = litrosAgua;
	}
	
	public double getSalinidadPorGramosSal() {
		return this.getLitrosAgua()/this.getGramosSal()*1000;
	}
	//formula de google : salinidad: S = mS / mW x 1000 (g/kg)
}
