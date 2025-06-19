package SistemaNotificaciones;

public interface Encriptador extends Notificador{
	
	String encriptar();
	String descencriptar(String original);
}
