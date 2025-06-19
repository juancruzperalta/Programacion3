package ContactosCelular;

public class Celular {
	Contacto[] contacto;
	int totalContactos;
	
	public Celular() {
		contacto = new Contacto[50];
		totalContactos=0;
	}
	
	public void addContacto(Contacto c) {
		if(c != null && totalContactos < contacto.length) {
			contacto[totalContactos] = c;
			totalContactos++;
		}
	}
	public int totalidadContactos() {
		return totalContactos;
	}
	
}
