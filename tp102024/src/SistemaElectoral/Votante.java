package SistemaElectoral;

import java.time.LocalTime;

public class Votante {
	private Candidato candidatoAVotar;
	private LocalTime horaVoto;
	private int dni;
	
	public Votante(Candidato candidatoAVotar, int dni) {
		super();
		this.candidatoAVotar = candidatoAVotar;
		this.horaVoto = LocalTime.now();
		this.dni = dni;
	}
	public Candidato getCandidatoAVotar() {
		if(this.candidatoAVotar == null) {
			return null;
		}
		return candidatoAVotar;
	}
	public void setCandidatoAVotar(Candidato candidatoAVotar) {
		this.candidatoAVotar = candidatoAVotar;
	}
	public LocalTime getHoraVoto() {
		return horaVoto;
	}
	public int getDni() {
		return dni;
	}
	
	
}
