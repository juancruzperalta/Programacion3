package SistemaNotificaciones;

public class NotificadorSMS implements Notificador{
	String num;
	String notificacion;
	NotificadorSMS (String numeroTelefono){
		 num = numeroTelefono;
	}
	
	@Override
	public void enviarNotificacion(String s) {
		this.notificacion = s;
		
	}

	@Override
	public String getNotificacion() {
		return this.notificacion;
	}

}
