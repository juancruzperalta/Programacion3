package Libreria;

import java.util.ArrayList;

public class Producto {
	protected String nombre;
	protected String autor;
	protected double precio;
	protected int cantPaginas;
	protected String resumen;
	protected ArrayList<String> generos;
	
	
	public Producto(String nombre, String autor, double precio, int cantPaginas, String resumen) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantPaginas = cantPaginas;
		this.resumen = resumen;
		generos = new ArrayList<String>();
	}


	public String getNombre() {
		return nombre;
	}
	
	public void addGeneros(String generoProd) {
		generos.add(generoProd);
	}
	
	public String obtenerGeneros() {
		String aux="";
		for(int i=0; i<generos.size();i++) {
			aux= generos.get(i);
		}
		return aux;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantPaginas() {
		return cantPaginas;
	}


	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}


	public String getResumen() {
		return resumen;
	}


	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	
	public boolean equals(Object o1) {
		try {
			Producto p1 = (Producto) o1;
			return p1.getNombre() == this.getNombre();
		}catch(Exception exc) {
			return false;
		}
	}
}




//Libro: nombre, autor(solo uno), precio, cantidad de páginas,
//resumen y generos literarios que abarca(puede ser más de uno)
//Revista: posee nombre, autor, cantidad páginas, precio, resumen,
//y un listado de generos.
//libro y revista son iguales
