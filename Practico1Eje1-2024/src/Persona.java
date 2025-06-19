
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	LocalDate fecha_nac;
	int dni;
	String sexo;
	int peso;
	double altura;

	public Persona(int dni) {
		
		nombre = "N";
		apellido = "N";
		edad = 0;
		fecha_nac = LocalDate.of(2000,1,1);
		this.dni = dni;
		sexo = "Femenino";
		peso = 1;
		altura = 1;
	}
	public Persona(int dni, String nombre, String apellido) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(int dni, String nombre, String apellido, LocalDate fecha_nac) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
	}
	
	
	
	public Persona(String nombre, String apellido, int edad, LocalDate fecha_nac, int dni, String sexo, int peso,
			double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_nac = fecha_nac;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public boolean estaCumpliendo() {
		return this.fecha_nac == LocalDate.now();
	}
	public boolean esMayorDeEdad() {
		return this.edad > 18;
	}
	public boolean esCoherente() {
		Period period = Period.between(this.fecha_nac, LocalDate.now()); 
		if(period.getYears() == edad) {
			return true;
		}
		return false;

	}
	public double masaCorporal() {
		return this.peso / (this.altura*this.altura);
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean estaEnForma() {
		if(this.masaCorporal() > 18.5 && this.masaCorporal() < 25) {
			return true;
		}else {
			return false;
		}
	}
	public boolean puedeVotar() {
		if(this.getEdad()>16) {
			return true;
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public LocalDate getFecha_nac() {
		return this.fecha_nac;
	}
	public String getSexo() {
		return sexo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public int getDni() {
		return dni;
	}
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public static void main(String[]args) {
		
	}
}
