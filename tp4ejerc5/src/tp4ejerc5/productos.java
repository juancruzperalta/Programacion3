package tp4ejerc5;

import java.time.LocalDate;
import java.util.ArrayList;

public class productos {
	private LocalDate fechaVencimiento;
	private int numeroLote;
	private LocalDate fechaEnvasado;
	private String GranjaOrigen;
	private ArrayList<refrigerados> refg;
	private ArrayList<congelados> cong;
	
	public productos(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		GranjaOrigen = granjaOrigen;
		cong = new ArrayList<congelados>();
		refg = new ArrayList<refrigerados>();
	}
	
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getGranjaOrigen() {
		return GranjaOrigen;
	}
	public void setGranjaOrigen(String granjaOrigen) {
		GranjaOrigen = granjaOrigen;
	} 
}
