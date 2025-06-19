import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private int dni;
	private ArrayList<ElementoAbstracto> elementosAlquilados;
	public Cliente(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		elementosAlquilados = new ArrayList<>();
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	public void addElemento(ElementoAbstracto ee) {
		if(!elementosAlquilados.contains(ee)) {
			elementosAlquilados.add(ee);
		}
	}
	public int cantAlquilados() {
		return elementosAlquilados.size();
	}
	
}
