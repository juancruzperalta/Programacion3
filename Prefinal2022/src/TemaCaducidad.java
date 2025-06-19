import java.time.LocalDate;

public class TemaCaducidad extends Tema {
	private LocalDate fechaLimite;

	public TemaCaducidad(String titulo, String descripcion, String ejeTematico, String autor, LocalDate fechaLimite) {
		super(titulo, descripcion, ejeTematico, autor);
		this.fechaLimite = fechaLimite;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	
	public void addComentario(Comentario cc) {
		if(fechaLimite.isBefore(LocalDate.now())) {
			addComentario(cc);
		}
	}

}
