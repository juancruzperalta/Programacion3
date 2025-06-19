package Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
	private String nombre;
	private ArrayList<Enfermedad> enfermedades;
	
	
	public Cultivo(String nombre) {
		this.nombre = nombre;
		enfermedades = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addEnfermedad(Enfermedad ee) {
		enfermedades.add(ee);
	}
	
	public String obtenerMisEnfermedades() {
		String aux="";
		for(Enfermedad ee: enfermedades) {
			aux += ee.getEstadoPatologico();
		}
		return aux;
	}
	
	public boolean meSirveProducto(ProductoQuimico pp) {
		if(this.obtenerMisEnfermedades().equals(pp.loQueCuroComoProducto())) {
			return true;
		}
		return false;
	}
}
