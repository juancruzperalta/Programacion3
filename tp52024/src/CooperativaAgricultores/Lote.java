package CooperativaAgricultores;

import java.util.ArrayList;

public class Lote {
	
	int hectareas;
	ArrayList<String> minerales;
	public Lote(int hectareas) {
		this.hectareas = hectareas;
		minerales = new ArrayList<>();
	}
	public int getHectareas() {
		return hectareas;
	}
	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	
	public String getMineralesQueTengo() {
		String aux="";
		for(int i=0; i<minerales.size();i++) {
			aux = minerales.get(i);
		}
		return aux;
	}
	//lo veo en el que hicimos en clase
	public boolean puedoSembrar(Cereal c) {
		return c.addCereal(this);
	}

}
