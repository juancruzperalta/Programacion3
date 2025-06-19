import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoSA {
	private String nombre;
	private LocalDate fechaCreacion;
	public ElementoSA(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaCreacion = fecha;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public abstract double getTamanio();
	
	public abstract ArrayList<Archivo> buscar(Condicion cond, Comparator<Archivo> orden);
	public abstract ElementoSA Copiar();

	public abstract ElementoSA Copiar(Condicion cond);
}
