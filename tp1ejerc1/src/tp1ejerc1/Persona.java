package tp1ejerc1;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private int fechaNacimiento;
	private int dni;
	private String sexo;
	private int peso;
	private int altura;
	
	private Persona() {
		nombre = "N";
		apellido = "N";
		edad = 15;
		fechaNacimiento = 1/1/2000;
		sexo = "Femenino";
		peso = 89;
		altura = 195;
		
	}
	public Persona(int dni) {
	    this();
		this.dni = dni;
	
	}
	public Persona(int dni, String nombre, String apellido) {
		this(dni);
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(int dni, String nombre, String apellido, int FechaNacimiento) {
		this(dni, nombre, apellido);
		this.fechaNacimiento = FechaNacimiento;
	}
	public int masaCorporal() {
		return peso/(altura*altura);
	}
	public boolean estaEnForma() {
		if(masaCorporal()>18 && masaCorporal()<25) {
			return true;
		}
		return false;

	}
	
	public int getDni() {
		return this.dni;
	}
	public String MayorEdad() {
		if(edad>18) {
			return "Es mayor de edad" + ":" +edad;
		}
		return "menor";
	}
	public String PuedeVotar() {
		if(edad>16) {
			return "Es mayor de edad para votar" + ":" +edad;
		}
		return "No puede votar";
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
