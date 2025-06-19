package CooperativaAgricultores;

import java.util.ArrayList;

public class Cooperativa {
	ArrayList<Cereal> cereales;
	ArrayList<Lote> lotes;
	String nombreCop;
	ArrayList<String> mineralesPriSec;
	
	
	
	
	public Cooperativa(String nombreCop) {
		this.nombreCop = nombreCop;
		cereales = new ArrayList<>();
		lotes = new ArrayList<>();
		mineralesPriSec = new ArrayList<>();
	}
	public String getNombreCop() {
		return nombreCop;
	}
	public void setNombreCop(String nombreCop) {
		this.nombreCop = nombreCop;
	}
	
	public void addCereal(Cereal cere) {
		cereales.add(cere);
	}
	public void addLote(Lote lo) {
		lotes.add(lo);
	}
	
	public void minsPriSec(String minsPriSec) {
		mineralesPriSec.add(minsPriSec);
	}
	
	public ArrayList<Cereal> cerealSembradoLote(Lote lo){
		ArrayList<Cereal> sal = new ArrayList<>();
		for(int i=0; i<cereales.size(); i++) {
			Cereal aux = cereales.get(i);
			if(aux.addCereal(lo)) {
				sal.add(aux);
			}
		}
		return sal;
	}
	
	public ArrayList<Lote> cerealDeterminado(Cereal c){
		ArrayList<Lote> sal = new ArrayList<>();
		for(int i=0; i<lotes.size(); i++) {
			Lote aux = lotes.get(i);
			if(aux.puedoSembrar(c)) {
				sal.add(aux);
			}
		}
		return sal;
	}
	
	
}
