package tp2ejerc4;

public class canchas {
	private String paddle;
	private String futbol;
	private int precioPaddle;
	private int precioFutbol;
	private int descuentoPaddle;
	private int descuentoFutbol;

	public canchas(String paddle, String futbol) {
		super();
		this.paddle = paddle;
		this.futbol = futbol;
		precioPaddle = 100;
		precioFutbol = 400;
		descuentoPaddle = 100%10;
		descuentoFutbol = 400%10;
	}
	public String getPaddle() {
		return paddle;
	}
	public void setPaddle(String paddle) {
		this.paddle = paddle;
	}
	public String getFutbol() {
		return futbol;
	}
	public void setFutbol(String futbol) {
		this.futbol = futbol;
	}
	public int getPrecioPaddle(turnos ts) {
		if(ts.isSocios()) {
			return precioPaddle-descuentoPaddle;
		}
		return precioPaddle;
	}
	public int getPrecioFutbol(turnos ts) {
		if(ts.isSocios()) {
		return precioFutbol-descuentoFutbol;
		}
		return precioFutbol;
	}

}