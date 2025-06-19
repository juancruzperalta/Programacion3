package SistemaNotificaciones;

public class ComprimirEmail extends NotificadorEmail implements GZIP{

	ComprimirEmail(String emailEnvio, String emailRecepcion) {
		super(emailEnvio, emailRecepcion);
	}

	@Override
	public String comprimirInformacion() {
		String emailComprimido = "";
		if(this.emailEnvio != null) {
			emailComprimido = this.emailEnvio.concat(emailEnvio); 
		}//No sabia como comprimirlo la verdad, por eso le concatene otro así quedaba distinto almenos
		return emailComprimido;
	}

	@Override
	public String descomprimirInformacion(String descomprimido) {
		return this.emailRecepcion = descomprimido;
	}//El email que recibi hoy, no fue comprimido, entonces lo igualo al descomprimido..
	//tampoco sabia bien que tirar acá...

}
