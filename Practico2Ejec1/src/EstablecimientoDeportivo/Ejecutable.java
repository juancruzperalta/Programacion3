package EstablecimientoDeportivo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejecutable {
	public static void main(String[]args) {
		Turno tt = new Turno("Juan", LocalTime.of(10, 30), LocalDate.now());
		Cancha ch = new Cancha("Padel");
		Establecimiento ec = new Establecimiento();
		
		ec.addTurno(tt);
		ec.addCancha(ch);
		
		System.out.println();
	}
}
