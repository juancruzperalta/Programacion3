package Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;

import Aseguradora.Condiciones.Condicion;


public class SeguroTemporal extends SeguroIntegrador {
	private LocalDate fInicio, fFin;

	
	public SeguroTemporal(String descripcion,int dni, LocalDate fInicio, LocalDate fFin) {
		super(descripcion, dni);
		this.fInicio =fInicio;
		this.fFin = fFin;
	}
	
	public LocalDate getfInicio() {
		return fInicio;
	}
	
	public boolean estaVigente() {
		return this.fInicio.isBefore(fFin);
	}

	public void setfInicio(LocalDate fInicio) {
		this.fInicio = fInicio;
	}

	public LocalDate getfFin() {
		return fFin;
	}

	public void setfFin(LocalDate fFin) {
		this.fFin = fFin;
	}

	public int montoAsegurado() {
		if(fInicio.isBefore(fFin)) {
			return this.montoAsegurado();
		}
		return 0;
	}
	
	public int numeroPoliza() {
		return this.numeroPoliza();
	}
	
	public int getCostoPoliza() {
		if(fInicio.isBefore(fFin)) {
			return this.getCostoPoliza();
		}
		return 0;
	}
	
	public ArrayList<SeguroGeneral> buscar(Condicion cond){
		ArrayList<SeguroGeneral> aux = new ArrayList<>();
		for(SeguroGeneral ss: seguros) {
			if(this.estaVigente() && cond.cumple(ss)) {
				aux.add(ss);
			}
		}
		return aux;
	}

}
