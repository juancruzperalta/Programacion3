import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	protected int dni;
	private int direccion;
	protected ArrayList<String> generosFav;
	protected ArrayList<String> autoresFav;
	protected ArrayList<Producto> comprasHechas;
	protected double descuento;
	public Cliente(String nombre, String apellido, int dni, int direccion, double descuento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.descuento = descuento;
		generosFav = new ArrayList<String>();
		autoresFav = new ArrayList<String>();
		comprasHechas = new ArrayList<Producto>();
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public int getDireccion() {
		return direccion;
	}
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	public boolean yaCompraste(Producto pp) {
		return comprasHechas.contains(pp);
	}
	public void leGustaAutor(String autor) {
		autoresFav.add(autor);
	}
	public void leGustaGenero(String gen) {
		generosFav.add(gen);
	}
	
	public boolean teGusta(Producto pp) {
		return autoresFav.contains(pp.getAutor());
	}
	
	
	
	
}
