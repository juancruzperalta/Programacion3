package Aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

import Aseguradora.Condiciones.Condicion;

public abstract class SeguroGeneral {
	private String descripcion;

	
	public SeguroGeneral(String descripcion) {
		super();
		this.descripcion = descripcion;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract int getDNI();
	public abstract int numeroPoliza();
	public abstract int montoAsegurado(); 
	public abstract int getCostoPoliza();
	public abstract ArrayList<SeguroGeneral> buscar(Condicion cond, Comparator<SeguroGeneral> orden);
}
