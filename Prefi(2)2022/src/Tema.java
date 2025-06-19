import java.util.ArrayList;

public class Tema extends TemaGenerico {
	private String titulo;
	private String descripcion;
	private ArrayList<String> palabrasClave;
	private String ejeTematico;
	private String autor;
	private ArrayList<Comentario> comentarios;
	
	
	
	public Tema(String titulo, String descripcion, String ejeTematico, String autor) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.ejeTematico = ejeTematico;
		this.autor = autor;
		palabrasClave = new ArrayList<>();
		comentarios = new ArrayList<>();
	}
	
	public void addPalabraClave(String pp) {
		palabrasClave.add(pp);
	}
	
	public void addComentario(Comentario cc) {
		comentarios.add(cc);
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
	public String ejeTematico() {
		return this.ejeTematico;
	}

	@Override
	public ArrayList<String> palabrasClave() {
		return new ArrayList<String>(this.palabrasClave);
	}






	@Override
	public TemaGenerico copiar(Condicion cond) {
		Tema tt = new Tema(this.titulo, this.descripcion, this.ejeTematico, this.autor);
		if(cond.cumple(tt)) {			
		for(String pp: palabrasClave) {
			tt.addPalabraClave(pp);
		}
		for(Comentario cc: comentarios) {
			tt.addComentario(cc);
		}
		return tt;
		}
		return null;
	}

	public boolean tenesPalabraClave(String palabraClave) {
		return palabrasClave.contains(palabraClave);
	}

	public boolean tenesComentario(String autorComentario) {
		for(Comentario cc: comentarios) {
			if( cc.getAutor().equals(autorComentario)) {
				return true;
			}
		}
		return false;
	}
	public Tema crearTema() {
		return new Tema(this.titulo,this.descripcion, this.ejeTematico, this.autor);
	}

	@Override
	public int cantTemas(Condicion cond) {
		if(cond.cumple(this)) {
			return 1;
		}
		return 0;
	}

}
