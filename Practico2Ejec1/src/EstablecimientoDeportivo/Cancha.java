package EstablecimientoDeportivo;

public class Cancha {
	String tipoCancha;
	int valor;
	int descuento;
	public Cancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
		this.setValor(valor);
	}
	public String getTipoCancha() {
		return tipoCancha;
	}
	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		if(this.tipoCancha == "Padel") {
			valor = 100;
		}else {
			if(this.tipoCancha == "Futbol") {
				valor =400;
			}
		}
	}
	
	
}
