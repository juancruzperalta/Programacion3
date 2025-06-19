package Libreria;

import java.util.ArrayList;

public class Cliente {
	protected String nombre;
	protected String apellido;
	protected int dni;
	protected int direccion;
	protected ArrayList<String> autoresFav;
	protected ArrayList<String> generosFav;
	protected ArrayList<Producto> comprasCliente;
	protected double descuento;
	
	
	
	public Cliente(String nombre, String apellido, int dni, int direccion, double descuento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.descuento = descuento;
		autoresFav = new ArrayList<>();
		generosFav = new ArrayList<>();
		comprasCliente = new ArrayList<Producto>();
	}

	

	public String getNombre() {
		return nombre;
	}
	
	public void addComprasProducto(Producto p) {
		comprasCliente.add(p);
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



	public int getDireccion() {
		return direccion;
	}



	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}



	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	//conocer elprecio de unlibro orevista para un cliente determinado
	public double getPrecioProducto(Producto p) {
		return p.getPrecio()*this.getDescuento()/100;
	}
	

	//conocer si un cliente ya compró un libr oo revista determin
	//Si ya compro un libro deter- lo veo con que mi arreglo de productos
	//tenga un mismo producto que estoy preguntando.(contenga) agrego equals en producto
	public boolean yaComproLibroDeterminado(Producto p) {
		return comprasCliente.contains(p);
	}
	
	public void addGeneroFav(String generoFav) {
		generosFav.add(generoFav);
	}
	
	public void addAutorFav(String autorFav) {
		autoresFav.add(autorFav);
	}
	
	public String getGeneroFav() {
		String aux="";
		for(int i=0; i<generosFav.size(); i++) {
			aux = generosFav.get(i);
		}
		return aux;
	}
	public String getAutorFav() {
		String aux="";
		for(int i=0; i<autoresFav.size();i++) {
			aux = autoresFav.get(i);
		}
		return aux;
	}
	public boolean teGustaAutor(String autor) {
		return autoresFav.contains(autor);
	}
	public boolean teGustaGenero(String genero) {
		return generosFav.contains(genero);
	}
		//conocer si un cliente le gusta libro o revista determina
	//Algunos clientes gusta solo si el libro es el autor del mismo 
	//en su lista favs
	//Otros le gusta que su autor este en su lista de fav y
	//ademas contenga al menos un genero de los que les gusta
	
	public boolean meGustaEsteLibroAutor(Producto prod) {
		return this.teGustaAutor(prod.getAutor());
	}
	public boolean meGustaAutorYGenero(Producto prod) {
		if(this.teGustaGenero(prod.obtenerGeneros()) && this.teGustaAutor(prod.getAutor())) {
			return true;
		}
		return false;
	}
}
//cliente: nombre, apellido, dni y direccion, lista de autores fav
//y una lista de generos que gustan, tambien compras(libros o rev)
//clientes normales: 10%descuento, clientes frec: 15% socios: 30%
