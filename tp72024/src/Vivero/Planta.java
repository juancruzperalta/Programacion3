package Vivero;

import java.util.ArrayList;

public class Planta {
	private String nombre;
	private ArrayList<String> nombreVulgares;
	private String clasificacion;
	private String familia;
	private String clase;
	private int requerimientoSol;
	private int requerimientoAgua;
	
	public Planta(String nombre, String clasificacion, String familia, String clase, int requerimientoSol,
			int requerimientoAgua) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.familia = familia;
		this.clase = clase;
		this.requerimientoSol = requerimientoSol;
		this.requerimientoAgua = requerimientoAgua;
		nombreVulgares = new ArrayList<>();
	}
	
	public void addNombresVulgares(String nombre) {
		this.nombreVulgares.add(nombre);
	}
	
	public String getNombresVulgares() {
		String aux="";
		for(String nomb: nombreVulgares) {
			aux+=nomb;
		}
		return aux;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getRequerimientoSol() {
		return requerimientoSol;
	}

	public void setRequerimientoSol(int requerimientoSol) {
		this.requerimientoSol = requerimientoSol;
	}

	public int getRequerimientoAgua() {
		return requerimientoAgua;
	}

	public void setRequerimientoAgua(int requerimientoAgua) {
		this.requerimientoAgua = requerimientoAgua;
	}

	public boolean tenesPalabraVulgar(String palabraVulgar) {
		return nombreVulgares.contains(palabraVulgar); 
	}
	
	
	public String toString() {
		return "<" + "Nombre:" + " " + this.getNombre() +"\n" + "Clasificacion:" + " " + this.getClasificacion() +"\n" +
				"Familia:" + " " + this.getFamilia() +"\n" + "Clase:" + " " + this.getClase() +"\n" +
				"Requerimiento Sol:" + " " + this.getRequerimientoSol() +"\n" + "Requerimiento Agua:" + " " 
				+ this.getRequerimientoAgua() +"\n" + "Nombre Vulgares:" + " " + this.getNombresVulgares() +">"+"\n";
	}
	
	
	
}
