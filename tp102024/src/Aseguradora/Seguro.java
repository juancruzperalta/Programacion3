package Aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Aseguradora.Condiciones.Condicion;

public class Seguro extends SeguroGeneral {
	private int DNI;
	private int numeroPoliza;
	private int montoAsegurado;
	private CalcularMonto cc;
	
	public Seguro(String descripcion, int dni, int numeroPoliza
			, int montoAsegurado, CalcularMonto cc) {
		super(descripcion);
		this.DNI = dni;
		this.numeroPoliza = numeroPoliza;
		this.montoAsegurado = montoAsegurado;
		this.cc = cc;
	}

	public CalcularMonto getCc() {
		return cc;
	}

	public void setCc(CalcularMonto cc) {
		this.cc = cc;
	}

	public void setDNI(int dni) {
		this.DNI = dni;
	}


	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}



	public void setMontoAsegurado(int montoAsegurado) {
		this.montoAsegurado = montoAsegurado;
	}

	@Override
	public int getDNI() {
		return this.DNI;
	}

	@Override
	public int numeroPoliza() {
		return this.numeroPoliza;
	}

	@Override
	public int montoAsegurado() {
		return montoAsegurado;
	}

	@Override
	public int getCostoPoliza() {
		return cc.CalcularMonto(this);
	}

	@Override
	public ArrayList<SeguroGeneral> buscar(Condicion cond, Comparator<SeguroGeneral> orden) {
		ArrayList<SeguroGeneral> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		Collections.sort(aux, orden);
		return aux;
	}

}
