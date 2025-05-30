package ejerc2Pract6;

import java.util.List;

public class Mochila {
	List<Objeto> objetosDentro;
	int pesoMaximoMochila;
	public Mochila(List<Objeto> objetosDentro, int pesoMaximoMochila) {
		super();
		this.objetosDentro = objetosDentro;
		this.pesoMaximoMochila = pesoMaximoMochila;
	}
	public List<Objeto> getObjetosDentro() {
		return objetosDentro;
	}
	public void setObjetosDentro(List<Objeto> objetosDentro) {
		this.objetosDentro = objetosDentro;
	}
	public int getPesoMaximoMochila() {
		return pesoMaximoMochila;
	}
	public void setPesoMaximoMochila(int pesoMaximoMochila) {
		this.pesoMaximoMochila = pesoMaximoMochila;
	}
	
}
