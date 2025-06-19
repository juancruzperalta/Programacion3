package SitioWebNoticias;

import java.util.ArrayList;

public class Categoria {
	private String descripcion;
	private String imagenAsociada;
	private ArrayList<Categoria> elems;
	private ArrayList<Noticia> noticias;
	
	public Categoria(String descripcion, String imagenAsociada) {
		this.descripcion = descripcion;
		this.imagenAsociada = imagenAsociada;
		elems = new ArrayList<>();
		noticias = new ArrayList<>();
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagenAsociada() {
		return imagenAsociada;
	}


	public void setImagenAsociada(String imagenAsociada) {
		this.imagenAsociada = imagenAsociada;
	}


	public void addCategoria(Categoria c) {
		if(!elems.contains(c)) {
			elems.add(c);
		}
	}
	
	public Categoria copia(){
		Categoria cc = new Categoria(this.getDescripcion(), this.getImagenAsociada());
			for(Categoria elems: elems) {
				cc.addCategoria(elems.copia());
			}
		return cc;
	}
	
	public ArrayList<Noticia> buscar(Condicion cond){
		ArrayList<Noticia> aux = new ArrayList<>();
		for(Noticia nn: noticias) {
			if(cond.cumple(nn)) {
				aux.add(nn);
			}
		}
		return aux;
	}
	
	
	public ArrayList<Categoria> listado(){
		ArrayList<Categoria> aux = new ArrayList<>(elems);
		
		aux.add(this);
		for(Categoria cc: elems) {
			aux.add(cc);
		}
		return aux;
	}
	
	public String toString() {
		return this.getDescripcion() + this.getImagenAsociada();
	}
} 
