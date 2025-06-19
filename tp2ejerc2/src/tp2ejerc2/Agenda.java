package tp2ejerc2;

public class Agenda {
	private Reunion[] reuniones;
	private String Duena;
	private Persona[] persona;
	private int MAXIMO=100;
	private int punteroReuniones;
	private int punteroPersonas;
	
	public boolean addReunion(Reunion r) {
		if(punteroReuniones < MAXIMO) {
			reuniones[punteroReuniones]=r;
			punteroReuniones++;
		}
		return true;
	}
	public boolean addPersona(Persona p) {
		if(punteroPersonas < MAXIMO) {
			persona[punteroPersonas]= p;
			punteroPersonas++;
		}
		return true;
	}
	public String getDuena() {
		return Duena;
	}

	public void setDuena(String duena) {
		Duena = duena;
	}
}
