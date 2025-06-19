package Libreria;

import java.util.ArrayList;

public class Libreria {
	protected ArrayList<Producto> productos;
	protected ArrayList<Cliente> clientes;
	protected String nombreLibreria;
	
	
	public Libreria(String nombreLibreria) {
		this.nombreLibreria = nombreLibreria;
		productos = new ArrayList<Producto>();
		clientes = new ArrayList<Cliente>();
	}


	public String getNombreLibreria() {
		return nombreLibreria;
	}


	public void setNombreLibreria(String nombreLibreria) {
		this.nombreLibreria = nombreLibreria;
	}
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	public void addProducto(Producto p) {
		productos.add(p);
	}
	//Devolver un listado de los clientes que les gusta un libro o rev
	public String gustaLibro(Producto p) {
		String aux="";
		for(int i=0; i<clientes.size();i++) {
			if(clientes.get(i).meGustaEsteLibroAutor(p)) {
				aux += "Solo por autor:"+"-" + clientes.get(i).getNombre()+ "\n";
			};
			if(clientes.get(i).meGustaAutorYGenero(p)) {
				aux += "Por Genero y autor:"+"-" + clientes.get(i).getNombre()+ "\n";
			}
		}
		return aux;
	}
	
}
//La libreria vende libros y revistas

