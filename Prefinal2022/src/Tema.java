import java.util.ArrayList;

public class Tema extends Elemento {
	private String titulo;
	private String descripcion;
	private ArrayList<String> palabraClave;
	private String ejeTematico;
	private String autor;
	private ArrayList<Comentario> comentarios;
	
	
	public Tema(String titulo, String descripcion, String ejeTematico, String autor) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.ejeTematico = ejeTematico;
		this.autor = autor;
		palabraClave = new ArrayList<>();
		comentarios = new ArrayList<>();
	}
	public void addComentario(Comentario cc) {
		comentarios.add(cc);
	}

	public void addPalabraClave(String pp) {
		if(!palabraClave.contains(pp)) {
			palabraClave.add(pp);
		}
	}
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getEjeTematico() {
		return ejeTematico;
	}


	public void setEjeTematico(String ejeTematico) {
		this.ejeTematico = ejeTematico;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> aux = new ArrayList<>(palabraClave);
		return aux;
	}

	@Override
	public String ejeTematico() {
		return this.ejeTematico;
	}
	@Override
	public Elemento copiar(Condicion cond) {
		Tema tt = new Tema(this.titulo, this.descripcion, this.ejeTematico, this.autor);
		ArrayList<String> aux = new ArrayList<>();
		for(String pp: palabraClave) {
			aux.addAll(palabraClave);
		}
		for(Comentario cc: comentarios) {
			tt.addComentario(cc);
		}
		if(cond.cumple(this)) {
			return tt;
		}
		return null;
	}
	@Override
	public int buscar(Condicion cond) {
		if(cond.cumple(this)) {
			return 1;
		}
		return 0;
	}
	
}
