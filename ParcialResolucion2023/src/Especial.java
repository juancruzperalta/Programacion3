import java.util.ArrayList;

public class Especial extends Basico {
		
	private ArrayList<String> especialidades;
	private int costoEstimado;
	
	public Especial(String nombre, int empAfec, int tiempoEst, calcularCosto cc, int costo) {
		super(nombre, empAfec, tiempoEst, cc);
		this.costoEstimado =costo;
		especialidades = new ArrayList<>();
	}

	public int getCostoEstimado() {
		return costoEstimado;
	}

	public void setCostoEstimado(int costoEstimado) {
		this.costoEstimado = costoEstimado;
	}

	public void addEspecialidad(String esp) {
		if(!especialidades.contains(esp)) {
			especialidades.add(esp);
		}
	}


}
