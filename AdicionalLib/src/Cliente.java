import java.util.ArrayList;

public class Cliente {
	protected String nombre;
	protected String apellido;
	private int dni;
	protected int direccion;
	protected double descuento;
	protected ArrayList<String> generosFav;
	protected ArrayList<String> autoresFav;
	protected ArrayList<Producto> prodsCompro;
	
	
	public Cliente(String nombre, String apellido, int dni, int direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		generosFav = new ArrayList<>();
		autoresFav = new ArrayList<>();
		prodsCompro = new ArrayList<Producto>();
	}

	public void addGeneroFav(String generoFav) {
		if(!generosFav.contains(generoFav)) {
			generosFav.add(generoFav);
		}
	}
	public void addAutorFav(String autoreFav) {
		if(!autoresFav.contains(autoreFav)) {
			autoresFav.add(autoreFav);
		}
	}
	public boolean yaCompraste(Producto p1) {
		if(prodsCompro.contains(p1)) {
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


	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
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


	public int getDireccion() {
		return direccion;
	}

	public boolean teGusta(Producto pp) {
		if(autoresFav.contains(pp.getAutor())) {
			return true;
		}
		return false;
	}
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	
}
