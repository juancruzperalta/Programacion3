package AgendaPersonal;

public class Persona {
	int telefono;
	String email;
	String nombre;
	public Persona(int telefono, String email, String nombre) {
		this.telefono = telefono;
		this.email = email;
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

