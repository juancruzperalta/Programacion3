package Peluqueria;

public class Peluqueria {
	Peluqueria[] peluquero;
	int contadorPeluqueros;
	Turno[] turnos;
	int contadorTurnos;
	public Peluqueria() {
		peluquero = new Peluqueria[4];
		turnos = new Turno[10];
		contadorPeluqueros=0;
		contadorTurnos=0;
	}
	
	public void addPeluquero(Peluqueria nombrePeluquero) {
		if(nombrePeluquero != null 
				&& contadorPeluqueros < peluquero.length) {
			peluquero[contadorPeluqueros] = nombrePeluquero;
			contadorPeluqueros++;
		}
	}
	public void addTurno(Turno th) {
		if(th != null && contadorTurnos < turnos.length) {
			turnos[contadorTurnos] = th;
			contadorTurnos++;
		}
	}
	public Peluqueria getPeluquero() {
		return peluquero[contadorPeluqueros];
	}


	public static void main(String[]args) {
		Peluqueria pp = new Peluqueria();
		System.out.println(pp.getPeluquero());
	}
}
