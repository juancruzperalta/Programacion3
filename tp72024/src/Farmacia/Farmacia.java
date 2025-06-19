package Farmacia;

import java.util.ArrayList;

import Farmacia.Condicion.Condicion;

public class Farmacia {
	private ArrayList<Medicamento> meds;
	private String nombre;
	
	public Farmacia(String nombre) {
		this.nombre = nombre;
		meds = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addMedicamento(Medicamento mm) {
		if(!meds.contains(mm)) {
			meds.add(mm);
		}
	}
	public ArrayList<Medicamento> buscarMed(Condicion cond){
		ArrayList<Medicamento> medicam = new ArrayList<>();
		
		for(Medicamento med: meds) {
			if(cond.filtrar(med)) {
				medicam.add(med);
			}
		}
		return medicam;
	}
}

/*Una farmacia desea poder buscar aquellos medicamentos que 
son producidos por el laboratorio Bayer.
*/