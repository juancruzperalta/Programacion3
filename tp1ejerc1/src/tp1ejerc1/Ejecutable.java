package tp1ejerc1;

public class Ejecutable {

	public static void main(String[] args) {
		
		Persona a = new Persona(45398154);

		
		System.out.println(a.getDni());
		System.out.println(a.estaEnForma());
		System.out.println(a.MayorEdad());
		System.out.println(a.PuedeVotar());


	}

}
