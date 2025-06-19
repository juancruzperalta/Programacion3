import java.util.ArrayList;

public class Producto {
	protected String nombre;
	protected String autor;
	protected int precio;
	protected int cantPaginas;
	protected String resumen;
	protected ArrayList<String> generosLit;
	
	
	public Producto(String nombre, String autor, int precio, int cantPaginas, String resumen) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantPaginas = cantPaginas;
		this.resumen = resumen;
		generosLit = new ArrayList<>();
	}

	
	public String getNombre() {
		return nombre;
	}
	public void addGeneroLit(String generoLit) {
		if(!generosLit.contains(generoLit)) {
			generosLit.add(generoLit);
		}
	}
	
	public String obtenerGeneros() {
		String aux="";
		for(int i=0; i<generosLit.size();i++) {
			aux += generosLit.get(i);
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


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
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
			return(this.getNombre().equals(p1.getNombre()));
		}catch(Exception exc) {
			return false;
		}
	}
}
	