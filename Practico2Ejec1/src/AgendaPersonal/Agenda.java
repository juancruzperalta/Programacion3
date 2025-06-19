package AgendaPersonal;

public class Agenda {
	Reunion[] reu;
	int contador;

	public Agenda() {
		reu = new Reunion[10];
		contador =0;
	}
	
	public void addReunion(Reunion re) {
		if(re != null && contador < reu.length) {
			reu[contador] = re;
			contador++;
		}
	}
	public int cantidadDeReuniones() {
		return contador;
	}
	public int DuracionReunion() {
		int duracion =0;
		for(int i=0; i<contador;i++) {
			duracion = reu[i].getDuracion();
		}
		return duracion;	
	}
	
	public String obtenerTema() {
		String tema ="";
		for(int i=0; i<contador;i++) {
			tema = reu[i].getTema();
		}
		return tema;
	}
	public int cantidadPersonas() {
		int pers =0;
		for(int i=0; i<contador;i++) {
			pers = reu[i].totalDePersonas();
		}
		return pers;
	}
	public String lugarReunion() {
		String lugar="";
		for(int i=0; i<contador;i++) {
			lugar = reu[i].getLugar();
		}
		return lugar;
	}
}
