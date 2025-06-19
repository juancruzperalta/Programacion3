package tp2ejerc5;

import java.util.ArrayList;

public class peluqueria {
	private ArrayList<clientes> cls;
	private ArrayList<peluqueria> pl;
	private String peluquero;
	private int MAXIMO=4;
	
	
	
	public peluqueria(String peluqueros) {
		super();
		this.peluquero = peluqueros;
		pl = new ArrayList<peluqueria>();
		cls = new ArrayList<clientes>();
	}
	public void clientes(clientes c) {
		cls.add(c);
	}
	public peluqueria getPeluquero(int i) {
		i=i-1;
		if((i>=0) && (i<pl.size())){
			return pl.get(i);
		}
		return null;
	}	
	public clientes getCliente(int i) {
		i =i-1;
		if((i>=0) && (i<cls.size())) {
			return cls.get(i);
		}
		return null;
	}
	public void setPeluqueros(peluqueria peluqueros) {
		if(MAXIMO<4) {
		pl.add(peluqueros);
		MAXIMO++;
		}
	}
	public void getTurnoPeluqueros() {
		turnos ts;
		for(int i=0; i<cls.size(); i++) {
			clientes c = cls.get(i);
			ts = c.getTurno(i);
			
		}
	}
}
