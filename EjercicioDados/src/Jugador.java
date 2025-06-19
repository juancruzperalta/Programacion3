
public class Jugador {
	private String jugador1;
	private String jugador2;
	private int puntaje;
	
	public Jugador(String j1, String j2) {
		this.jugador1 = j1;
		this.jugador2 = j2;
		puntaje = 0;
	}
	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}
	public String getJugador2() {
		return jugador2;
	}
	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void IncrementarPuntos() {
		puntaje++;
	}
	
}
