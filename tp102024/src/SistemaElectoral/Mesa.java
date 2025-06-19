package SistemaElectoral;

import java.util.ArrayList;

public class Mesa {
	ArrayList<Votante> personasVota;
	ArrayList<Integer> padron;
	private String establecimiento;
	private String barrio;
	public Mesa(String establecimiento, String barrio) {
		super();
		this.establecimiento = establecimiento;
		this.barrio = barrio;
		personasVota = new ArrayList<>();
		padron = new ArrayList<>();
	}
	public String getEstablecimiento() {
		return establecimiento;
	}
	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	public void addVotante(Votante vv) {
		if(!personasVota.contains(vv) && this.obtenerPadron().contains(vv.getDni())) {
			personasVota.add(vv);
		}
	}
	
	public void addPadron(int dni) {
		if(!padron.contains(dni)) {
			padron.add(dni);
		}
	}
	
	public ArrayList<Integer> obtenerPadron(){
		ArrayList<Integer> padronCopia = new ArrayList<>(padron);
	
		return padronCopia;
	}
	
	public ArrayList<Votante> buscar(Condicion cond){
		ArrayList<Votante> aux = new ArrayList<>();
			
		for(Votante vv: personasVota) {
			if(cond.cumple(vv)) {
				aux.add(vv);
			}
		}
		return aux;
		
	}
}
