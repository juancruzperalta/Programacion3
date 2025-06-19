package SeleccionFutbol;

import java.time.LocalDate;

public class Ejecutable {

	public static void main(String[] args) {
		Futbolista ff = new Futbolista("Juan", "Peralta", 45398154, LocalDate.of(2003, 9, 30), "Viajando", "Lateral", "Derecho", 30);
		Entrenador ee = new Entrenador("Jose", "Tecla", 32131233, LocalDate.of(1975, 12, 2), "En pais de origen", 32133333);
		Masajista mm = new Masajista("Lorem", "Ipsum", 32131233, LocalDate.of(1500, 2, 23),"En pais de origen", "Masajista Prof", 20);
		
		System.out.println("Nombre\t"+ ff.getNombre());
		System.out.println("Posicion\t"+ ff.getPosicion());
		System.out.println("Goles\t"+ ff.getGoles());
		System.out.println("¿Puede participar?\t"+ ff.puedeJugar());
		System.out.println("---------------------------------------");
		System.out.println("Nombre\t"+ ee.getNombre());
		System.out.println("identificador\t"+ ee.getIdentificadorFederacion());
		System.out.println("¿Puede participar?\t"+ ee.puedeJugar());
		System.out.println("---------------------------------------");
		System.out.println("Nombre\t"+ mm.getNombre());
		System.out.println("Titulo\t"+ mm.getTitulo());
		System.out.println("Experiencia\t"+ mm.getCantExperiencia());
		System.out.println("¿Puede participar?\t"+ mm.puedeJugar());

	}

}
