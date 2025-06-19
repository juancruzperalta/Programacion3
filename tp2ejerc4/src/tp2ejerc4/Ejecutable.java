package tp2ejerc4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejecutable {

	public static void main(String[] args) {
		canchas c1 = new canchas("paddle","futbol");
		turnos t1 = new turnos(LocalDate.now(), LocalTime.of(12, 50), LocalDate.now());
		establecimiento e = new establecimiento();
		
		e.addCanchas(c1);
		e.addTurnos(t1);
		System.out.println(t1.getFecha());
		System.out.println(t1.getFechaAnterior());
		System.out.println(t1.getHora());

		System.out.println(c1.getPrecioFutbol(t1));
		System.out.println(c1.getPrecioPaddle(t1));
		
	}

}
