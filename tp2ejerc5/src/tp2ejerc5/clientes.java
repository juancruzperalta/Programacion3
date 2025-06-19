package tp2ejerc5;

import java.util.ArrayList;

public class clientes {
	private String cliente;
	private boolean esFrecuente;
	private ArrayList<turnos> ts;
	
	
	
	public clientes(String cliente, boolean esFrecuente) {
		super();
		this.cliente = cliente;
		this.esFrecuente = esFrecuente;
		ts = new ArrayList<turnos>();
	}
	public void turnos(turnos t) {
		ts.add(t);
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setEsFrecuente(boolean esFrecuente) {
		this.esFrecuente = esFrecuente;
	}
	public turnos turnoDisponible() {
		turnos t;
		for(int i=0; i<ts.size(); i++) {
			t = ts.get(i);
			if(ts.contains(t)) {
				return t;
			}
		}
		return null;
	}
	public turnos getTurno(int i) {
		i=i-1;
		if((i>=0) && (i<ts.size())){
			return ts.get(i);
		}
		return null;
	}	
}
