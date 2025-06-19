package tp4ejerc1;

public class AlarmaLuminosa extends alarma{
	private Luz isLuz;

	public AlarmaLuminosa(Luz isLuz) {
		super();
		this.isLuz = isLuz;
	}

	public Luz getIsLuz() {
		return isLuz;
	}

	public void setIsLuz(Luz isLuz) {
		this.isLuz = isLuz;
	}
	
}
