
public class Jugador {
	String nombre;
	int puntaje;
	
	
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		puntaje = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void aumentarPuntos() {
		puntaje++;
	}

	public int tirarDados(Cubilete cc) {
		return cc.tirar();
	}
	
}
