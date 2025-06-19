package tp3ejerc3;

public class ejecutable {

	public static void main(String[] args) {
		juego j1 = new juego();
		personaje p1 = new personaje("Jose",true, true,2,2,2,2);
		personaje p2 = new personaje("albert",true, true,2,23,2,2);

		j1.addPersonaje(p1);
		j1.addPersonaje(p2);
		
		System.out.println(j1.getDatosEnfrentamiento(p1) < j1.getDatosEnfrentamiento(p2));
		if(j1.getDatosEnfrentamiento(p1) == j1.getDatosEnfrentamiento(p2)) {
			System.out.println(j1.getEmpate(p1) < j1.getEmpate(p2));
		}
	}

}
