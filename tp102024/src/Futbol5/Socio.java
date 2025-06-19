package Futbol5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Socio {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean pagoUltimo;
	private ArrayList<Alquiler> alqRealizados;
	public Socio(String nombre, String apellido, int edad, boolean pagoUltimo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pagoUltimo = pagoUltimo;
		alqRealizados = new ArrayList<>();
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
	public boolean isPagoUltimo() {
		return pagoUltimo;
	}
	public void setPagoUltimo(boolean pagoUltimo) {
		this.pagoUltimo = pagoUltimo;
	}
	
	
	public void alquilarCancha(int cancha, int pago) {
		Alquiler aa = new Alquiler(cancha, pago, LocalDate.now());
		this.alqRealizados.add(aa);
	}

	public int alquileresCant(int cancha) {
			int can=0;
		for(Alquiler a:alqRealizados) {
			if(a.getNumCancha() == cancha) {
				can++;
			}
		}
		return can;
	}
	public boolean alquilasteLaCancha(int cancha) {
		return this.alqRealizados.contains(cancha);
	}
}
