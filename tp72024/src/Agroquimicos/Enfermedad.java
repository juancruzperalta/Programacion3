package Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
	private String nombre;
	private ArrayList<String> estadoPatologico;
	public Enfermedad(String nombre) {
		super();
		this.nombre = nombre;
		estadoPatologico = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addEstadoPatologico(String estadoPatologico) {
		this.estadoPatologico.add(estadoPatologico);
	}
	public String getEstadoPatologico() {
		String aux="";
		for(String estP: estadoPatologico) {
			aux += estP;
		}
		return aux;
	}
	
	
	public boolean equals(Object o1) {
		Enfermedad e1 = (Enfermedad) o1;
		return e1.getEstadoPatologico() == this.getEstadoPatologico();
	}
}	
