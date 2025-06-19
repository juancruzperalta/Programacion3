package tp2ejerc3;
import java.util.ArrayList;

public class Pais {
//	private int gastoPublico;
//	private String nombre;
	ArrayList<provincia> prov;
	public Pais() {
		super();
//		this.nombre = nombre;
		prov = new ArrayList<provincia>();
	}
	public void addProvincia(provincia pp) {
		prov.add(pp);
	}
	public provincia getProv(int nroProv) {
		nroProv = nroProv-1;
		if((nroProv>=0) && (nroProv<prov.size())) {
			return prov.get(nroProv);
		}
		return null;
	}
	public ciudad getCiudad(int nroProv, int nroCiudad) {
		provincia pedida = this.getProv(nroProv);
		if (pedida!=null) {
		  return pedida.getCiudad(nroCiudad);
		} else {
		   return null;
		}
	}
	
	public ciudad getCiudad(String nombre) {
		for(int i=0; i<prov.size();i++) {
			provincia pv = prov.get(i);
			ciudad cd = pv.getCiudad(nombre);
			if(cd != null) {
				return cd;
			}
		}
		return null;
	}
//	public int getGastoPublico(int nroProv, int nroCiudad) {
//		ciudad cid = this.getCiudad(nroProv, nroCiudad);
//		if(cid.getHabitantes() > 100000) {
//			int gastoPublico=cid.getGastosCiudad();
//			return gastoPublico;
//		}
//		return 0;
//	}
//	public boolean getDeficit(int nroProv, int nroCiudad) {
//		ciudad c= this.getCiudad(nroProv,nroCiudad);
//		return c.deficit();
//	}
}