package Alarma;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;

	public AlarmaLuminosa() {
		super();
		luz = new Luz();
	}
	public void encenderLuz() {
		if(this.comprobar() == true) {
			luz.enciendoLaLuz();
		}
	}
}
