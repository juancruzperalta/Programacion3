package tp3ejerc4;

import java.util.ArrayList;

public class celular {
	private ArrayList<contactos> cont;

	public celular() {
		super();
		cont = new ArrayList<contactos>();
	}
	public void addContacto(contactos c) {
		cont.add(c);
	}
	public contactos getContactos(int i) {
		i = i-1;
		if ((i>=0) && ( i<cont.size())) {
			return cont.get(i);
		}
		
		return null;
	}
	public String getDatosCompletos(contactos c) {
		return c.getApellido() + "Nombre"+":" +
				c.getNombre() + "Numero"+":" +
				c.getNumero() + "Edad"+ ":" +
				c.getEdad();
	}
}
//. El celular muestra
//información a modo de resumen donde se lista la totalidad de contactos, los contactos
//repetidos y el promedio de edad de los contactos. Asimismo
