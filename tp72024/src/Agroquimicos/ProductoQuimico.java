package Agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
	private String nombre;
	private ArrayList<Cultivo> cultivos;
	private ArrayList<String> estadoPatologico;
	public ProductoQuimico(String nombre) {
		this.nombre = nombre;
		cultivos = new ArrayList<>();
		estadoPatologico = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addCultivoProducto(Cultivo cc) {
		cultivos.add(cc);
	}
	
	public void addEstadoQuePuedoTratar(String estadoPatologico) {
		this.estadoPatologico.add(estadoPatologico);
	}
	public String loQueCuroComoProducto() {
		String aux="";
		for(String est: estadoPatologico) {
			aux += est;
		}
		return aux;
	}
	
	public boolean puedoTratarEsteEstado(Enfermedad ee) {
		if(this.loQueCuroComoProducto().equals(ee.getEstadoPatologico())) {
			return true;
		}
		return false;
	}
	
	public boolean equals(Object o1) {
		ProductoQuimico pq = (ProductoQuimico) o1;
		return this.loQueCuroComoProducto() == pq.loQueCuroComoProducto();
	}
	
}
