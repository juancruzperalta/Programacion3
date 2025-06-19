import java.util.ArrayList;

public class Curso extends CursoGenerico {
	private int precio;
	private ArrayList<String> docentes;
	private ArrayList<String> palabrasClave;
	private int cantHoras;
	
	
	

	public Curso(String nombre, int precio, int cantHoras) {
		super(nombre);
		this.precio = precio;
		this.cantHoras = cantHoras;
		docentes = new ArrayList<>();
		palabrasClave =new ArrayList<>();
	}
	public void addPalabraClave(String pp) {
		if(!palabrasClave.contains(pp)) {
			palabrasClave.add(pp);
		}
	}
	public void addDocente(String docente) {
		if(!docentes.contains(docente)) {
			docentes.add(docente);
		}
	}
	
	
	
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	@Override
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public ArrayList<String> getDocentes() {
		return new ArrayList<>(this.docentes);
	}

	@Override
	public ArrayList<String> palabrasClave() {
		return new ArrayList<>(this.palabrasClave);
	}

	@Override
	public int getCantHoras() {
		return this.cantHoras;
	}
	@Override
	public int cantCursos() {
		return 1;
	}
	@Override
	public Curso cursoMasCaro() {
		return this;
	}
	@Override
	public ArrayList<Curso> buscar(Condicion cond) {
		ArrayList<Curso> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

}
