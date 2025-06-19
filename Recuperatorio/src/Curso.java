import java.util.ArrayList;

public class Curso extends OfertaAcademica{
	private int precio;
	private ArrayList<String> docentes;
	private ArrayList<String> palabrasClave;
	private int horasCatedra;
	
	public Curso(String nombre, int horas) {
		super(nombre);
		this.horasCatedra = horas;
		docentes = new ArrayList<>();
		palabrasClave = new ArrayList<>();
	}

	public int getHorasCatedra() {
		return horasCatedra;
	}

	public void setHorasCatedra(int horasCatedra) {
		this.horasCatedra = horasCatedra;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public ArrayList<String> getDocentes() {
		ArrayList<String> aux = new ArrayList<>(docentes);
		return aux;
	}

	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> aux = new ArrayList<>(palabrasClave);
		return aux;
	}
	public void addPalabraClave(String pp) {
		if(!palabrasClave.contains(pp)) {
			palabrasClave.add(pp);
		}
	}
	public void addDocente(String docente) {
		docentes.add(docente);
	}

	@Override
	public int horasCatedra() {
		return this.horasCatedra;
	}

	@Override
	public int cantidadCursos() {
		return 1;
	}

	@Override
	public ArrayList<Curso> buscar(Condicion cond) {
		ArrayList<Curso> copia = new ArrayList<>();
		if(cond.cumple(this)) {
			copia.add(this);
		}
		return copia;
	}

	@Override
	public int cantDocentes() {
		return docentes.size();
	}

	public boolean tenesPalabra(String palabra) {
		return palabrasClave.contains(palabra);
	}



}
