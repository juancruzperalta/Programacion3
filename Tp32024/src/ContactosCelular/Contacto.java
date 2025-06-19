package ContactosCelular;

import java.time.LocalDate;

public class Contacto {
	String nombre;
	String apellido;
	LocalDate fecha_nac;
	int telefono;
	String direccion;
	String email;
	public Contacto(String nombre, String apellido, LocalDate fecha_nac, int telefono, String direccion, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
		this.telefono = telefono;
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
	public LocalDate getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean soyRepetido(Contacto otroContacto) {
		return (this.getNombre() == otroContacto.getNombre() &&
			this.getApellido() == otroContacto.getApellido()&&
			this.getTelefono() == otroContacto.getTelefono());
			
	}
	
	public int poseoElMismoTelefono(Contacto otroContacto) {
		int telefono=0;
		if(this.getTelefono() == otroContacto.getTelefono()) {
			telefono = this.getTelefono();
		}
		return telefono;
	}

}
