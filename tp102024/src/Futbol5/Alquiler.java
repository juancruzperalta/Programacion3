package Futbol5;

import java.time.LocalDate;

public class Alquiler {
	private int numCancha;
	private int pagoAlquiler;
	private LocalDate fecha;
	
	public Alquiler(int numCancha, int pagoAlquiler, LocalDate fecha) {
		this.numCancha = numCancha;
		this.pagoAlquiler = pagoAlquiler;
		this.fecha =fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNumCancha() {
		return numCancha;
	}

	public void setNumCancha(int numCancha) {
		this.numCancha = numCancha;
	}

	public int getPagoAlquiler() {
		return pagoAlquiler;
	}

	public void setPagoAlquiler(int pagoAlquiler) {
		this.pagoAlquiler = pagoAlquiler;
	}
	
}
