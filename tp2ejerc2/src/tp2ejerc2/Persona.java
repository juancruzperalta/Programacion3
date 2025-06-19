package tp2ejerc2;

public class Persona {
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	
	public Persona(String n, String a, String e, int t) {
		this.nombre = n;
		this.apellido = a;
		this.email = e;
		this.telefono = t;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
