package RegistroEmpresa;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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
	
	public String toString() {
		return nombre + "\t" + apellido + "\t" + "Edad" +"\t" + edad;
	}
	
	
	
	public static void main(String[]args) {
		Empleado ep1 = new Empleado("Bautista","sabe",25,3212,2000);
		UsuarioFinal uf = new UsuarioFinal("Nacho", "sabe", 20, "NachoSabe2", 311);
		Jerarquico jf = new Jerarquico("Juan","Peralta",20,3213,30000);
		
		jf.addEmpleadosACargo(ep1);
		System.out.println(ep1.toString() + "\n" + uf.toString() + "\n" +"Jerarquico \t" + jf.toString());
	}
	
}
