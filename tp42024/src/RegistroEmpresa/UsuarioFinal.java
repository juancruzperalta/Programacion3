package RegistroEmpresa;

public class UsuarioFinal extends Persona {
	
	String nombreUsuario;
	double password;
	
	public UsuarioFinal(String nombre, String apellido, int edad, String nombreUsuario, double password) {
		super(nombre, apellido, edad);
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public String toString() {
		return "UsuarioFinal" +"\t" + super.toString() +"\t" + nombreUsuario;
	}
	
	

}
