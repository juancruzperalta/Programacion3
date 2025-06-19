import java.util.ArrayList;

public class Libreria {
	protected ArrayList<Cliente> clientes;
	protected ArrayList<Producto> revista;
	protected ArrayList<Producto> libros;
	private String nombreLib;
	public Libreria(String nombreLib) {
		this.nombreLib = nombreLib;
		clientes = new ArrayList<Cliente>();
		revista = new ArrayList<Producto>();
		libros = new ArrayList<Producto>();
	}
	public String getNombreLib() {
		return nombreLib;
	}
	public void setNombreLib(String nombreLib) {
		this.nombreLib = nombreLib;
	}
	
	public double getPrecioLibro(Producto p1, Cliente c1) {
		return p1.getPrecio()*c1.getDescuento()/100;
	}
	
	public boolean yaComprasteLibro(Producto p1, Cliente cc) {
		return cc.yaCompraste(p1);
	}
	
	public ArrayList<Cliente> clienteGustaLibro(Producto pp){
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
