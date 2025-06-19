package tp2ejerc4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class turnos {
	private boolean socios;
	private LocalDate fecha;
	private LocalTime hora;
	private LocalDate fechaAnterior;
	
	public turnos(LocalDate fecha, LocalTime hora, LocalDate fechaAnterior) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.fechaAnterior = fecha.plusMonths(-2);;
		
	}

	public boolean isSocios() {
		return socios;
	}

	public boolean setSocios(boolean socios) {
		if(LocalDate.now().isAfter(fechaAnterior)) {
			return true;
		}
		return false;
	}
	public LocalDate getFechaAnterior() {
		return fechaAnterior;
	}

	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

}