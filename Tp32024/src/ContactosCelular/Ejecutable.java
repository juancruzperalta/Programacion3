package ContactosCelular;

import java.time.LocalDate;

public class Ejecutable {
	public static void main(String[]args) {
		Contacto cc = new Contacto("Juan","Peralta",LocalDate.of(2003,9,30),600680,"Larrea", "juanc7peralta@gmail.com");
		Contacto c1 = new Contacto("Juan","Peralta",LocalDate.of(2003,9,30),600680,"Larrea", "juanc7peralta@gmail.com");

		Celular celu = new Celular();
		celu.addContacto(cc);
		celu.addContacto(c1);
		System.out.println("Poseen el mismo telefono" + cc.poseoElMismoTelefono(c1));
		System.out.println("Soy igual\t" + cc.soyRepetido(c1));
	}
}
