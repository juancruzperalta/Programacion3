import java.util.ArrayList;

public class Vivero {
	private ArrayList<Planta> plantas;
	private String nombre;
	
	public Vivero(String nombre) {
		plantas = new ArrayList<>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addPlanta(Planta pp) {
		this.plantas.add(pp);
	}
	
	
	public ArrayList<Planta> buscar(Condicion cond){
		ArrayList<Planta> aux = new ArrayList<>();
		for(Planta pp: plantas) {
			if(cond.cumple(pp)) {
				aux.add(pp);
			}
		}
		return aux;
	}
}
