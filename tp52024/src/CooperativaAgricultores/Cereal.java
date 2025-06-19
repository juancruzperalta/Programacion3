package CooperativaAgricultores;

import java.util.ArrayList;
//Intente hacerlo de una forma distinta
//De como vimos en clase
//Y de hacerlo individualmente para prácticarlo
//Esta manera me salio, gracias por revisar
public class Cereal {
	ArrayList<String> cereales;
	String nombre;
	ArrayList<String> mineralesReq;
	public Cereal(String nombre) {
		this.nombre = nombre;
		cereales = new ArrayList<>();
		mineralesReq = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean addCereal(Lote lo) {
		if(mineralesQueRequiero().equals(lo.getMineralesQueTengo())){
			return true;
		}
		return false;
	}
	
	
	public boolean equals(Object o1) {
		try {
			Cereal c1 = (Cereal)o1;
			return c1.getNombre().equals(nombre);
		}catch(Exception e){
			return false;
		}
	}
	
	public String mineralesQueRequiero() {
		String aux="";
		for(int i=0; i<mineralesReq.size();i++) {
			aux = mineralesReq.get(i);
		}
		return aux;
	}
	
	
	
}
