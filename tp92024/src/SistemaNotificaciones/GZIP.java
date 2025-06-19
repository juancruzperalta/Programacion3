package SistemaNotificaciones;

public interface GZIP extends Notificador{
	
	String comprimirInformacion();
	String descomprimirInformacion(String descomprimido);

}
