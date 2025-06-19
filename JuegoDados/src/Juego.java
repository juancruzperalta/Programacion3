
public class Juego {
	Jugador j1;
	Jugador j2;
	Cubilete cc;
	int rondas;
	int minimo;
	public Juego() {
		this(2,6);
	}
	public Juego(int cantDados, int caras) {
		this.cc = new Cubilete(cantDados, caras);
		this.j1 = new Jugador("Jugador 1");
		this.j2 = new Jugador("Jugador 2");
		this.rondas = 10;
		this.minimo = 7;
	}
	public Juego(Jugador j1, Jugador j2, int rondas, int minimo) {
		this.j1 = j1;
		this.j2 = j2;
		this.rondas = rondas;
		this.minimo = minimo;
	}
	public Jugador getJ1() {
		return j1;
	}
	public void setJ1(Jugador j1) {
		this.j1 = j1;
	}
	public Jugador getJ2() {
		return j2;
	}
	public void setJ2(Jugador j2) {
		this.j2 = j2;
	}
	public int getRondas() {
		return rondas;
	}
	public void setRondas(int rondas) {
		this.rondas = rondas;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	
	public Jugador jugar() {
		for (int i=0; i<rondas;i++) {
			int tiradaJ1 = j1.tirarDados(cc);
			int tiradaJ2 = j2.tirarDados(cc);
			
			if(tiradaJ1 > tiradaJ2) {
				j1.aumentarPuntos();
			}else {
				if(tiradaJ2 > tiradaJ1) {
					j2.aumentarPuntos();
				}
			}
		}
		return this.jugadorGanador();
	}
	public Jugador jugadorGanador() {
		if(j1.getPuntaje() > minimo && j1.getPuntaje() > j2.getPuntaje()) {
			return j1;
		}else {
			if(j2.getPuntaje() > minimo && j2.getPuntaje() > j1.getPuntaje()) {
				return j2;
			}
		}
		return null;
	}
	
}
