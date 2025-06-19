package CompaniaEnvios;

public class Paquete extends Elemento{
	private int peso;
	private boolean retiroSucursal;
	public Paquete(String destinatario, String remitente, String direccion, int peso, boolean retiroSucursal, int numTracking) {
		super(destinatario, remitente, direccion, numTracking);
		this.peso = peso;
		this.retiroSucursal = retiroSucursal;
	}

	
	
	public boolean isRetiroSucursal() {
		return retiroSucursal;
	}



	public void setRetiroSucursal(boolean retiroSucursal) {
		this.retiroSucursal = retiroSucursal;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	@Override
	public double getPeso() {
		return peso;
	}
	
	
}
