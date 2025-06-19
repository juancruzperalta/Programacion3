package Avicola;

import java.time.LocalDate;

public class Producto {
	LocalDate fechaVenc;
	int numeroLote;
	LocalDate fechaEnvasado;
	String granjaOrigen;
	//Todos tienen algo en común :
	//Fecha vencimiento y numero de lote
	
	//Producto fresco se va, hace lo mismo que Producto.
	public Producto(LocalDate fechaVenc, int numeroLote,LocalDate fechaEnvasado, String granjaOrigen) {
		this.fechaVenc = fechaVenc;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
	}
	public LocalDate getFechaVenc() {
		return fechaVenc;
	}
	public void setFechaVenc(LocalDate fechaVenc) {
		this.fechaVenc = fechaVenc;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	
}
