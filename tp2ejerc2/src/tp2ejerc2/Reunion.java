package tp2ejerc2;

import java.time.LocalDate;
import java.time.LocalTime;


public class Reunion {
	private String lugar;
	private String tema;
	private LocalDate inicio;
	private LocalTime inicioT;
	private int duracion;
	
	private Persona[] asistentes;
	private int Maximo=100;
	private int CantAsistentes; 
	
	public Reunion(String lugar, String tema, LocalDate inicio, LocalTime inicioT, int duracion) {
		this.lugar = lugar;
		this.tema = tema;
		this.inicio = inicio;
		this.inicioT = inicioT;
		this.duracion = duracion;
		
		asistentes = new Persona[Maximo];
		CantAsistentes = 0;
	}
	public void addAsistentes(Persona p1) {
		if(CantAsistentes < Maximo) {
			asistentes[CantAsistentes]=p1;
			CantAsistentes++;
		}
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalTime getInicioT() {
		return inicioT;
	}

	public void setInicioT(LocalTime inicioT) {
		this.inicioT = inicioT;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Persona[] getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(Persona[] asistentes) {
		this.asistentes = asistentes;
	}

	public int getCantAsistentes() {
		return CantAsistentes;
	}

	public void setCantAsistentes(int cantAsistentes) {
		CantAsistentes = cantAsistentes;
	}
}
