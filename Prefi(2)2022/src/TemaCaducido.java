import java.time.LocalDate;

public class TemaCaducido extends Tema {
	private LocalDate fecha;

	
	
	public TemaCaducido(String titulo, String descripcion, String ejeTematico, String autor, LocalDate fecha) {
		super(titulo, descripcion, ejeTematico, autor);
		this.fecha = fecha;
	}



	public void addComentario(Comentario cc) {
		if(LocalDate.now().isBefore(fecha)) {
			super.addComentario(cc);
		}
	}
	
	public Tema crearTema() {
		return new TemaCaducido(this.getTitulo(), this.getDescripcion(), this.ejeTematico(), this.getAutor(),this.fecha);
	}

}
