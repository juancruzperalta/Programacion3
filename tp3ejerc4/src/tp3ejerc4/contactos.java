package tp3ejerc4;

import java.time.LocalDate;

public class contactos {
	private String nombre;
	private String apellido;
	private int edad;
	private int numero;
	private int direccion;
	private String email;
	
	public contactos(String nombre, String apellido, int edad, int numero, int direccion,
			String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.numero = numero;
		this.direccion = direccion;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
			return apellido;
			}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public boolean esIgual(contactos cont) {
		if(nombre.equalsIgnoreCase(cont.getNombre())
				&& apellido.equalsIgnoreCase(cont.getApellido()) 
				&& numero == cont.getNumero()) {
			return true;
		}
		return false;
	}
	public double promedioEdad(contactos cont1) {
		return edad/cont1.getEdad();
	}
	
	
}