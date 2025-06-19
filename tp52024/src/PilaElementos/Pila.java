package PilaElementos;

import java.util.ArrayList;

public class Pila {
	ArrayList<String> pilas;
	String nombrePila;
	public Pila(String nombrePila) {
		this.nombrePila = nombrePila;
		pilas = new ArrayList<>();
	}
	public String getNombrePila() {
		return nombrePila;
	}
	public void setNombrePila(String nombrePila) {
		this.nombrePila = nombrePila;
	}
	
	public void addElementos(String pila) {
		pilas.add(pila);
	}
	
	public void removeElementos(int index) {
		pilas.remove(index);
	}
	
	public int cantidadElementosAlmacenados() {
		return pilas.size();
	}
	//Esto la verdad no sé si esta bien así...
	public Object nuevaPilaCopia() {
		return pilas.clone();
	}
	
	//Profe la verdad no sé como seguir...no me tiran los metodos
	//No sé si los tengo que crear yo o que es con arreglos y no con arraylist.
	
}
