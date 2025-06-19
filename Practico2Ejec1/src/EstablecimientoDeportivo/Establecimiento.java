package EstablecimientoDeportivo;

public class Establecimiento {
	Cancha[] canchas;
	Turno[] turnos;
	int contadorCanchas;
	int contadorTurnos;
	public Establecimiento() {
		canchas = new Cancha[10];
		turnos = new Turno[10];
		contadorCanchas = 0;
	}
	
	public void addTurno(Turno tt) {
		if(tt != null && contadorTurnos < turnos.length) {
			turnos[contadorTurnos] = tt;
			contadorTurnos++;
		}
	}
	
	public void addCancha(Cancha ch) {
		if(ch != null && contadorCanchas < canchas.length) {
			canchas[contadorCanchas] = ch;
			contadorCanchas++;
		}
	}
	public int canchasDisponibles() {
		return canchas.length - contadorCanchas;
	}
	public int canchasUtilizadas() {
		return contadorCanchas;
	}
	
	
}
