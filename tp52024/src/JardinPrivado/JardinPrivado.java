package JardinPrivado;

import java.time.LocalDate;

public class JardinPrivado {
	protected String nombreCientifico;
	protected String nombre;
	protected String paisOrigen;
	protected LocalDate fechaCompra;
	protected static int identificador=0;
	
	
	public JardinPrivado(String nombreCientifico, String nombre, String paisOrigen, LocalDate fechaCompra) {
		this.nombreCientifico = nombreCientifico;
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.fechaCompra = fechaCompra;
		identificador++;
	}
	
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public static int getIdentificador() {
		return identificador;
	}
	
	public static void main(String[]args) {
		JardinPrivado jp = new JardinPrivado("Planta eucalipto", "Eucalipto", "Argentina", LocalDate.of(2024,04,15));
	
		System.out.println("Identificador\t" + JardinPrivado.getIdentificador());
		System.out.println("Nombre\t" + jp.getNombre());
		System.out.println("Nombre cientifico\t" + jp.getNombreCientifico());
		System.out.println("Pais origen\t" + jp.getPaisOrigen());
		System.out.println("fecha compra\t" + jp.getFechaCompra());
		System.out.println("-------------------------------------------");
		JardinPrivado jp2 = new JardinPrivado("Pino X", "Pino", "Argentina", LocalDate.of(2023,04,15));		
		System.out.println("Identificador\t" + JardinPrivado.getIdentificador());
		System.out.println("Nombre\t" + jp2.getNombre());
		System.out.println("Nombre cientifico\t" + jp2.getNombreCientifico());
		System.out.println("Pais origen\t" + jp2.getPaisOrigen());
		System.out.println("fecha compra\t" + jp2.getFechaCompra());
		System.out.println("-------------------------------------------");
		JardinPrivado jp3 = new JardinPrivado("Rosa", "Rosa roja", "Argentina", LocalDate.of(2024,01,15));		
		System.out.println("Identificador\t" + JardinPrivado.getIdentificador());
		System.out.println("Nombre\t" + jp3.getNombre());
		System.out.println("Nombre cientifico\t" + jp3.getNombreCientifico());
		System.out.println("Pais origen\t" + jp3.getPaisOrigen());
		System.out.println("fecha compra\t" + jp3.getFechaCompra());
		System.out.println("-------------------------------------------");
		JardinPrivado jp4 = new JardinPrivado("Albol de SA", "SA violeta", "Rumania", LocalDate.of(2024,01,15));		
		System.out.println("Identificador\t" + JardinPrivado.getIdentificador());
		System.out.println("Nombre\t" + jp4.getNombre());
		System.out.println("Nombre cientifico\t" + jp4.getNombreCientifico());
		System.out.println("Pais origen\t" + jp4.getPaisOrigen());
		System.out.println("fecha compra\t" + jp4.getFechaCompra());
		System.out.println("-------------------------------------------");
		
	}
	
}
