package SistemaNotificaciones;

public class EncriptadorEmail extends NotificadorEmail implements Encriptador {
	String desencriptado;
	String encriptado = "021390123°||132109132134°$!CC__";
	int clave;
	EncriptadorEmail(String emailEnvio, String emailRecepcion, int clave) {
		super(emailEnvio, emailRecepcion);
		this.clave = clave;
	}

	@Override
	public String encriptar() {
		if(this.clave > 0) {
			this.emailEnvio = emailEnvio.concat(this.encriptado);
		}
		return emailEnvio;
	}

	@Override
	public String descencriptar(String original) {
		if(this.encriptar() != null) {
			if(this.emailEnvio.contains(this.emailRecepcion)) {
				if(clave > 0) {
					original = this.emailRecepcion;
				}
			}
		}
		return original;
	}

}
