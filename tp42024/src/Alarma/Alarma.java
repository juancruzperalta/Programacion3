package Alarma;

public class Alarma {
	boolean seRompioVidrio;
	boolean seAbrioPuerta;
	boolean movimientoDentro;
	Timbre timbre;
	
	public Alarma() {
		this.seRompioVidrio = false;
		this.seAbrioPuerta = false;
		this.movimientoDentro = false;
		timbre = new Timbre();
	}
	public boolean comprobar() {
		if(isSeAbrioPuerta() == true || isMovimientoDentro() == true || isSeRompioVidrio() == true) {
			return true;
		}
		return false;
	}
	//Si hace alguno de los 3, comprueba como verdadero.
	
	public String señalSonora() {
		if(comprobar()) {
			return timbre.hacerSonar();
		}
		return "";
	}
	public boolean isSeRompioVidrio() {
		return seRompioVidrio;
	}

	public void setSeRompioVidrio(boolean seRompioVidrio) {
		this.seRompioVidrio = seRompioVidrio;
	}

	public boolean isSeAbrioPuerta() {
		return seAbrioPuerta;
	}

	public void setSeAbrioPuerta(boolean seAbrioPuerta) {
		this.seAbrioPuerta = seAbrioPuerta;
	}

	public boolean isMovimientoDentro() {
		return movimientoDentro;
	}

	public void setMovimientoDentro(boolean movimientoDentro) {
		this.movimientoDentro = movimientoDentro;
	}
	

	public static void main(String[]args) {
		Alarma aa = new Alarma();
		aa.setMovimientoDentro(true);
		System.out.println("¿Se rompió algo?" + aa.comprobar());
		System.out.println(aa.señalSonora());
	}
}
