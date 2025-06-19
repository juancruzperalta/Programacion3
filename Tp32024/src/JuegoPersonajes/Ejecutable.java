package JuegoPersonajes;

public class Ejecutable {
	public static void main(String[]args) {
		Personaje pj = new Personaje("Juan", "Ironman", true, 200, 75, 1000, 1.95,29);
		Personaje pj2 = new Personaje("Lorena", "La mujer Maravilla", true, 100, 55, 500, 1.65,39);
		Personaje pj3 = new Personaje("Mirta", "Isabella", false, 400, 75, 200, 1.95,29);
		Personaje pj4 = new Personaje("Alfredo", "Hulk", true, 250, 75, 1000, 1.95,29);
		Juego jg = new Juego();
		jg.addPersonaje(pj);
		jg.addPersonaje(pj2);
		jg.addPersonaje(pj3);
		jg.addPersonaje(pj4);
		
		System.out.println("Juan\n" + "altura\t" + pj.getAltura() + "\nfuerza\t" + pj.getFuerza() + "\nVelocidad\t" + pj.getVelocidad());
		System.out.println("------------------------------------------------");
		System.out.println("Lorena\n" + "altura\t" + pj2.getAltura() + "\nfuerza\t" + pj2.getFuerza() + "\nVelocidad\t" + pj2.getVelocidad());
		System.out.println("------------------------------------------------");
		System.out.println("ganador \t" + jg.enfrentarPersonaje(pj2, pj));
		System.out.println("------------------------------------------------");
		System.out.println("Mirta\n" + "altura\t" + pj3.getAltura() + "\nfuerza\t" + pj3.getFuerza() + "\nVelocidad\t" + pj3.getVelocidad());
		System.out.println("------------------------------------------------");
		System.out.println("Alfredo\n" + "altura\t" + pj4.getAltura() + "\nfuerza\t" + pj4.getFuerza() + "\nVelocidad\t" + pj4.getVelocidad());
		System.out.println("------------------------------------------------");
		System.out.println("Ganador \t" + jg.enfrentarPersonaje(pj3, pj4));
	}
}
