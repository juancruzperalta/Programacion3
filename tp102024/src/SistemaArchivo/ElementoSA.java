package SistemaArchivo;

import java.util.ArrayList;
import java.util.Comparator;

import SistemaArchivo.Condiciones.Condicion;

public abstract class ElementoSA {
	private String nombre;
	private int fechaCreacion;
	public ElementoSA(String nombre, int fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(int fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public abstract double getTamanio();
	
	public abstract ArrayList<ElementoSA> buscar(Condicion cond, Comparator<ElementoSA> comp);
}
