package Farmacia;

public class Medicamento {
	private String nombreMed;
	private String labProduce;
	private int precio;
	
	public Medicamento(String nombreMed, String labProduce, int precio) {
		this.nombreMed = nombreMed;
				this.labProduce = labProduce;
				this.precio = precio;
	}

	public String getNombreMed() {
		return nombreMed;
	}

	public void setNombreMed(String nombreMed) {
		this.nombreMed = nombreMed;
	}

	public String getLabProduce() {
		return labProduce;
	}

	public void setLabProduce(String labProduce) {
		this.labProduce = labProduce;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
    public String toString(){
        return this.getNombreMed() + " "+"|"  + this.getLabProduce() + " " + " " + "$"+this.getPrecio();
    }
}
