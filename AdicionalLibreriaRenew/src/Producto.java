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
	
	public void addGenero(String genero) {
		generos.add(genero);
	}
	
	public String getGeneros(){
		String aux = "";
		for(int i=0; i<generos.size(); i++) {
			aux = generos.get(i);
		}
		return aux;
	}
	
	
	public boolean equals(Object o1) {
		try {
		Producto p1 = (Producto) o1;
		return (this.getNombre().equals(p1.getGeneros()));
		}catch(Exception exc) {
			return false;
		}
	}
	
}
