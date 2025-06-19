import java.util.ArrayList;

public class Libreria {
	protected String nombre;
	protected ArrayList<Producto> productos;
	protected ArrayList<Cliente> clientes;
	public Libreria(String nombre) {
		this.nombre = nombre;
		productos = new ArrayList<Producto>();
		clientes = new ArrayList<Cliente>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void addProductos(Producto pp) {
		productos.add(pp);
	}
	public void addCliente(Cliente cc) {
		clientes.add(cc);
	}
	
	public double getPrecioLibroCliente(Producto pp, Cliente cc) {
		return pp.getPrecio()- pp.getPrecio()*cc.getDescuento()/100;
	}
	
	public boolean clienteComproRevista(Producto pp, Cliente cc) {
		return cc.yaCompraste(pp);
	}
	
	public ArrayList<Cliente> teGustaLibro(Producto pp) {
		ArrayList<Cliente> aux = new ArrayList<Cliente>();
		
		for(int i=0; i<clientes.size();i++) {
			Cliente ci = clientes.get(i);
			if(ci.teGusta(pp)) {
				aux.add(ci);
			}
		}
		return aux;
	}
}
