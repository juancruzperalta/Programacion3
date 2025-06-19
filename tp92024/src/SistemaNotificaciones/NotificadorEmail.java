package SistemaNotificaciones;

public class NotificadorEmail implements Notificador{
	String emailEnvio, emailRecepcion;
	String notificacion;
	
	//implementa la interface Notificador basada en emails
	 NotificadorEmail (String emailEnvio, String emailRecepcion){
		 this.emailEnvio = emailEnvio;
		 this.emailRecepcion = emailRecepcion;
	 }

	@Override
	public String getNotificacion() {
		return this.notificacion;
	}

	@Override
	public void enviarNotificacion(String s) {
		this.notificacion = s;
	}
}
