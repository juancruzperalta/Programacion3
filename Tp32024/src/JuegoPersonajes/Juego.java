package JuegoPersonajes;

public class Juego {
	Personaje[] pers;
	int cantPersonajes;
	public Juego() {
		pers = new Personaje[10];
		cantPersonajes=0;
	}
	
	public void addPersonaje(Personaje j) {
		if(j !=null && cantPersonajes < pers.length) {
			pers[cantPersonajes] = j;
			cantPersonajes++;
		}
	}
	public int cantPersonajes() {
		return cantPersonajes;
	}
	public String enfrentarPersonaje(Personaje j, Personaje otroPersonaje) {
		if(j.getFuerza() > otroPersonaje.getFuerza()) {
			return j.getNombreReal();
		}else {
			if(otroPersonaje.getFuerza() > j.getFuerza()) {
				return otroPersonaje.getNombreReal();
			}
		}
		if(j.getVelocidad() > otroPersonaje.getVelocidad()) {
			return j.getNombreReal();
		}else {
			if(j.getVelocidad() < otroPersonaje.getVelocidad()) {
				return otroPersonaje.getNombreReal();
			}
		}
		return "Empate, son muy buenos";
		
	}
	
}
