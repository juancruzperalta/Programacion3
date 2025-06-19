import java.util.ArrayList;
import java.util.Comparator;

public class Pedido extends AbstractPedido {
	private int direccion;
	private int volumen;
	private int peso;
	private ArrayList<String> palabras;
	

	public Pedido(String nombre, String apellido, int direccion, int volumen, int peso) {
		super(nombre, apellido);
		this.direccion = direccion;
		this.volumen = volumen;
		this.peso = peso;
		palabras = new ArrayList<>();
	}
	
	

	public int getDireccion() {
		return direccion;
	}



	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}



	public int getVolumen() {
		return volumen;
	}



	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int direccion() {
		return this.direccion;
	}

	@Override
	public int volumenEstimado() {
		return this.volumen;
	}

	@Override
	public int pesoEstimado() {
		return this.peso;
	}

	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> copia = new ArrayList<>(palabras);
		return copia;
	}



	@Override
	public int cantPedidos() {
		return 1;
	}



	@Override
	public ArrayList<Pedido> buscar(Condicion cond) {
		ArrayList<Pedido> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}



	@Override
	public ArrayList<Pedido> buscar(Condicion cond, Comparator<Pedido> orden) {
		ArrayList<Pedido> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

}
