package AlarmaSensorial;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;

	public AlarmaLuminosa() {
		super();
		luz = new Luz();
	}
	public void encenderLuz() {
		if(this.señalSonora() == true) {
			luz.enciendoLaLuz();
		}
	}
}
