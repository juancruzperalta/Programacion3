package ModernizandoElSombrero;

import java.util.ArrayList;

public class Casa {
	ArrayList<String> cualidades;
	ArrayList<CasaEnemiga> casasEnemiga;
	String nombreCasa;
	int cantMaxima;
	ArrayList<Alumno> alumnos;
	public Casa(int cantMaxima, String nombreCasa) {
		this.cantMaxima = cantMaxima;
		cualidades = new ArrayList<>();
		alumnos = new ArrayList<>();
		this.nombreCasa = nombreCasa;
		casasEnemiga = new ArrayList<>();
	}
	
	
	public String getNombreCasa() {
		return nombreCasa;
	}


	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}


	public int getCantMaxima() {
		return cantMaxima;
	}
	public void setCantMaxima(int cantMaxima) {
		this.cantMaxima = cantMaxima;
	}
	//Si el alumno pertenece a otra casa, no es mi casa, puede ser enemiga.
	public void addAlumnoCasa(Alumno aa) {
		if(getCantMaxima() > alumnos.size()-1 && tieneCualidades(aa) && !aa.pertenezcoACasa()) {
			alumnos.add(aa);
		}
	}
	public String cantAlumnos() {
		String alumns ="";
		for(int i=0; i<alumnos.size();i++) {
			alumns += alumnos.get(i).getNombre();
		}
		return alumns;
	}
	public void addCualidadesRequeridas(String cualReq) {
		cualidades.add(cualReq);
	}
	public void addCasaEnemiga(CasaEnemiga ce) {
		casasEnemiga.add(ce);
	}
	public String getCualidadesRequeridas() {
		String aux="";
		for(int i=0; i<cualidades.size();i++) {
			aux = cualidades.get(i);
		}
		return aux;
	}
	
	public boolean tieneCualidades(Alumno a) {
		if(getCualidadesRequeridas().equals(a.getCualidades())) {
			return true;
		}
		return false;
	}

	
	
}
