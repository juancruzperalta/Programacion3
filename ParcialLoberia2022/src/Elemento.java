import java.util.ArrayList;
import java.util.Comparator;

public class Elemento extends ElementoAlquiler {
	private String descripcion;
	private int valor;
	private int antiguedad;
	
	

	public Elemento(int codigo, String descripcion, int valor, int antiguedad) {
		super(codigo);
		this.descripcion = descripcion;
		this.valor = valor;
		this.antiguedad = antiguedad;
	}
	

	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public int getValor() {
		return this.valor;
	}

	@Override
	public int getAntiguedad() {
		return this.antiguedad;
	}


	@Override
	public ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

}
