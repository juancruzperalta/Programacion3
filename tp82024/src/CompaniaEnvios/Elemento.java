package CompaniaEnvios;

public abstract class Elemento {
	private String destinatario;
	private String remitente;
	private String direccion;
	private int numTracking;
	public Elemento(String destinatario, String remitente, String direccion, int numTracking) {
		super();
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.direccion = direccion;
		this.numTracking = numTracking;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getNumTracking() {
		return numTracking;
	}
	public void setNumTracking(int numTracking) {
		this.numTracking = numTracking;
	}
	public abstract double getPeso();
	
	public String toString() {
		return this.getDestinatario() + this.getRemitente() + this.getDireccion() + this.getNumTracking();
	}
}
