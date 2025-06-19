public class Persona {
	private String nombre;
	private int edad;
	private int fechaNacimiento;
	private int dni;
	private String sexo;
	
	
	private Persona(int dni) {
		nombre = "Jose";
		edad = 12;
		fechaNacimiento = 1/1/2002;
		this.dni = dni;
		sexo = "Femenino";
	}
}
