package JuegoDados;

public class Jugador {
	String nombre;
	int puntos;

	
	public Jugador(String nombre) {
		this.nombre = nombre;
		puntos=0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	
	public int acumularPuntosJugador() {
		return puntos++;
	}
	public int tirarDadosCubilete(Cubilete cc) {
		return cc.tirar();
	}

}
