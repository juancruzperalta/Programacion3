package Aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Aseguradora.Condiciones.Condicion;

public class SeguroIntegrador extends SeguroGeneral {
	private int dni;
	protected ArrayList<SeguroGeneral> seguros;
	public SeguroIntegrador(String descripcion, int dni) {
		super(descripcion);
		this.dni = dni;
		seguros = new ArrayList<>();
		
	}


	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public int getDNI() {
		return dni;
	}

	@Override
	public int numeroPoliza() {
		int suma=0;
		for(SeguroGeneral ss: seguros) {
			int mayor = ss.numeroPoliza();
			if(suma > mayor) {
				suma = ss.numeroPoliza();
			}
		}
		return suma;
	}

	@Override
	public int montoAsegurado() {
		int suma=0;
		
		for(SeguroGeneral ss: seguros) {
			suma += ss.montoAsegurado();
		}
		return suma;
	}

	@Override
	public int getCostoPoliza() {
		int suma=0;
		for(SeguroGeneral ss: seguros) {
			suma+=ss.getCostoPoliza();
		}
		return suma;
	}


	@Override
	public ArrayList<SeguroGeneral> buscar(Condicion cond, Comparator<SeguroGeneral> orden) {
		ArrayList<SeguroGeneral> aux = new ArrayList<>();
		for(SeguroGeneral ss: seguros) {
			aux.addAll(ss.buscar(cond,orden));
		}
		Collections.sort(aux, orden);
		return aux;
	}


}
