package CongresoDeCiencias;

import java.util.ArrayList;

public class Trabajo {
	private String nombreTrabajo;
	ArrayList<String> palabrasClaves;

	
	public Trabajo(String nombreTrabajo) {
		this.nombreTrabajo = nombreTrabajo;
		palabrasClaves = new ArrayList<>();
	}
	public void addPalabraClave(String p) {
		palabrasClaves.add(p);
	}
	public String getPalabraClave(){
		String aux = "";
		for(int i=0; i<palabrasClaves.size();i++) {
			aux = palabrasClaves.get(i);
		}
		return aux;
	}
	
	public String getNombreTrabajo() {
		return nombreTrabajo;
	}
	public void setNombreTrabajo(String nombreTrabajo) {
		this.nombreTrabajo = nombreTrabajo;
	}
	
	
}
