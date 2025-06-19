package tp2ejerc3;

import java.util.ArrayList;

public class provincia {
	ArrayList<ciudad> cds;
	private String nombreProv;
	
	public provincia(String nombreProv) {
		cds = new ArrayList<ciudad>();
		this.nombreProv = nombreProv;
	}
	
	public ciudad getCiudad(String nombre) {
		ciudad cd;
		for(int i=0; i<cds.size();i++) {
			cd = cds.get(i);
			if(cd.getNombre().equals(nombre)) {
				return cd;
			}
		}
		return null;
	}
	public ciudad getCiudad(int i) {
		i = i-1;// transformo numero de episodio en posicion en arraylist
		if ((i>=0) && ( i<cds.size())) {
			return cds.get(i);
		}
		
		return null;
	}
	public String getNombreProv() {
		return nombreProv;
	}

	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}

	public void addCiudad(ciudad c) {
		cds.add(c);
	}
	public int mitadDeficit(ciudad c) {
		if(c.deficit()> cds.size()/2) {
			return 1;
		}
		return 0;
	}
}
