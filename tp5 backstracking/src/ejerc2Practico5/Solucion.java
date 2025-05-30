package ejerc2Practico5;

import java.util.LinkedList;
import java.util.List;

public class Solucion {
	List<Casilla> solucion = new LinkedList<>();
	int pasosQueYaDi;
	int sumaDeValores;
	public Solucion(List<Casilla> solucion, int pasosQueYaDi, int sumaDeValores) {
		super();
		this.solucion = solucion;
		this.pasosQueYaDi = pasosQueYaDi;
		this.sumaDeValores = sumaDeValores;
	}
	public List<Casilla> getSolucion() {
		return solucion;
	}
	public void setSolucion(List<Casilla> solucion) {
		this.solucion = solucion;
	}
	public int getPasosQueYaDi() {
		return solucion.size();
	}
	public void setPasosQueYaDi(int pasosQueYaDi) {
		this.pasosQueYaDi = pasosQueYaDi;
	}
	public int getSumaDeValores() {
		return sumaDeValores;
	}
	public void setSumaDeValores(int sumaDeValores) {
		this.sumaDeValores = sumaDeValores;
	}
	
	
}
