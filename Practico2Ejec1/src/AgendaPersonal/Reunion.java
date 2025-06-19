package AgendaPersonal;
public class Reunion {
	Persona[] pers;
	int duracion;
	String lugar;
	int contador;
	String tema;
	
	public Reunion(int duracion, String lugar, String tema) {
		pers = new Persona[15];
		this.duracion = duracion;
		this.lugar = lugar;
		this.tema = tema;
		contador=0;
	}
	
	public String getTema() {
		return tema;
	}
	public int totalDePersonas() {
		return contador;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public void addPersona(Persona pe) {
		if(pe != null && contador < pers.length) {
			for(int i=0; i<pers.length;i++) {
				pers[contador] = pe;
				contador++;
			}
		}
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
}
