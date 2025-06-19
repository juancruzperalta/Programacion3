import java.util.ArrayList;
import java.util.Comparator;

public class Elemento extends ElementoPaquete {
	private int valor;
	private int antiguedad;
	private String descripcion;
	public Elemento(int codigoIdentificado, int valor, int antiguedad, String desc) {
		super(codigoIdentificado);
		this.valor = valor;
		this.antiguedad = antiguedad;
		this.descripcion = desc;
	}
	

	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
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


	@Override
	public int getValor() {
		return valor;
	}

	@Override
	public int antiguedad() {
		return antiguedad;
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
