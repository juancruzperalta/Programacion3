package ModernizandoElSombrero;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private ArrayList<String> cualidades;
	private Casa casa;
	private ArrayList<Familia> familiares;
	public Alumno(String nombre) {
		this.nombre = nombre;
		cualidades = new ArrayList<>();
		familiares = new ArrayList<>();
	}
	
	public void addFamiliares(Familia fa) {
		familiares.add(fa);
	}
	
	public void addCualidades(String cual) {
		cualidades.add(cual);
	}
	public boolean pertenezcoACasa() {
		return casa != null;
	}
	public Casa getCasa() {
		return casa;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCualidades(){
		String aux="";
		for(int i=0; i<cualidades.size();i++) {
			aux=cualidades.get(i);
		}
		return aux;
	}
	public String getFamiliares() {
		String aux="";
		for(int i=0; i<familiares.size(); i++) {
			aux = familiares.get(i).getNombre();
		}
		return aux;
	}
}
