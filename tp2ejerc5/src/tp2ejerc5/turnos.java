package tp2ejerc5;

import java.time.LocalDate;

public class turnos {
	private LocalDate turn;
	
	public turnos(LocalDate turn, boolean esDisponible) {
		super();
		this.turn = turn;
	}
	public LocalDate getTurn() {
		return turn;
	}
	public void setTurn(LocalDate turn, peluqueria p) {
		if(p.getPeluqueros() != null) {
			p.setPeluqueros(p);
			this.turn = turn;
			
		}
	}

}
//Los clientes al solicitar un turno indican con cuál
//peluquero se desean cortar. El sistema además de registrar los turnos, debe poder buscar
//el primer turno disponible, también el primero disponible con un determinado
//peluquero