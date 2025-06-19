import java.util.ArrayList;
import java.util.Comparator;

public abstract class AbstractPedido {
	private String nombre;
	private String apellido;
	public AbstractPedido(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public abstract int cantPedidos();
	public abstract int volumenEstimado();
	public abstract int pesoEstimado();
	public abstract ArrayList<String> palabrasClave();
	public abstract ArrayList<Pedido> buscar(Condicion cond);
	public abstract ArrayList<Pedido> buscar(Condicion cond, Comparator<Pedido> orden);
}
