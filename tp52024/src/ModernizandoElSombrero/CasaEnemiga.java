package ModernizandoElSombrero;

import java.util.ArrayList;

public class CasaEnemiga extends Casa {
	ArrayList<Casa> casasEnemiga;
	public CasaEnemiga(int cantMaxima, String nombreCasa) {
		super(cantMaxima, nombreCasa);
		casasEnemiga = new ArrayList<>();
}
//Yo heredo, ya que imagino que una casa enemiga
	//Es una casa, no más que es enemiga de la otra
	//Tiene su nombre y la cantidad de personas aceptadas	
	public boolean aceptoAlumno(Alumno aa) {
		if(this.getCualidadesRequeridas().equals(aa.getCualidades())) {
			return true;
		}
		return false;
	}
	public void addCasaEnemiga(Casa casaE) {
		casasEnemiga.add(casaE);
	}
	public String casasEnemig() {
		String aux="";
		for(int i=0; i<casasEnemiga.size();i++) {
			aux = casasEnemiga.get(i).getNombreCasa();
		}
		return aux;
	}
}
