import java.time.LocalDate;

public class Comprimido extends Directorio {
	private double compresion;
	public Comprimido(String nombre, LocalDate fecha, double comp) {
		super(nombre, fecha);
		this.compresion = comp;
	}

	public double getTamanio() {
		return super.getTamanio()*compresion;
	}
}
