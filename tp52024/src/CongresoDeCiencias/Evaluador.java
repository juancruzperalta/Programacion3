package CongresoDeCiencias;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	private String temas;
	ArrayList<Trabajo> trabajos;
	public Evaluador(String nombre, String temas) {
		this.nombre = nombre;
		this.temas = temas;
		trabajos = new ArrayList<>();
	}
	//Me añade un trabajo solo si los temas
	//son igual a la palabra clave que obtengo en getTrabajo.
	public void addTrabajo(Trabajo trabajo) {
		if(this.getTemas().equals(getTrabajos())) {			
			trabajos.add(trabajo);
		}
	}
	public boolean sosAptoTrabajo(Trabajo t) {
		if(this.getTemas().equals(t.getPalabraClave())){
				return true;
		}
		return false;
	}
	
	public String getTrabajos() {
		String trabajo="";
		for(int i=0; i<trabajos.size();i++) {
			trabajo = trabajos.get(i).getPalabraClave();
		}
		return trabajo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTemas() {
		return temas;
	}
	public void setTemas(String temas) {
		this.temas = temas;
	}
	
	
	//public boolean equals(Object o1) {
	//	Evaluador e = (Evaluador o1);
		
	//}
	
}
