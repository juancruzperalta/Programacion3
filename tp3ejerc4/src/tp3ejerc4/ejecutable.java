package tp3ejerc4;

public class ejecutable {

	public static void main(String[] args) {
		celular c1 = new celular();
		contactos cont1 = new contactos("Juan","Juan",4,1,2,"juanc7peralta@gmail.com");
		contactos cont2 = new contactos("Juan","Juan",4,1,2,"juanc7peralta@gmail.com");
		contactos cont3 = new contactos("Juadsadan","dasdasdasdas",52,1,2,"juanc7peralta@gmail.com");

		c1.addContacto(cont1);
		c1.addContacto(cont2);
		c1.addContacto(cont3);
		System.out.println(c1.getDatosCompletos(cont2));
		System.out.println(cont1.promedioEdad(cont3));
		System.out.println(cont1.esIgual(cont2));
	}

}
