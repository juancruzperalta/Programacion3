package tp4ejerc1;

public class Luz {
	private boolean luzPrendida;
	public Luz(boolean luzPrendida) {
		super();
		this.luzPrendida = luzPrendida;
	}

	public boolean isLuzPrendida() {
		return luzPrendida;
	}

	public void setLuzPrendida(boolean luzPrendida) {
		this.luzPrendida = luzPrendida;
	}
	public void encenderLuz() {
		if(!luzPrendida) {
			this.luzPrendida = true;
		}
	}
	public void apagarLuz() {
		if(luzPrendida) {
			this.luzPrendida =false;
		}
	}
	}
