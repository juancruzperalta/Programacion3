
public class Dado {
	int caras;
	int ultValor;
	
	public Dado() {
		this(6);
	}

	public Dado(int caras) {
		this.setCaras(caras);
		this.tirarDados();
	}
	
	public int getCaras() {
		return caras;
	}

	public void setCaras(int caras) {
		if(caras > 0) {
			this.caras = caras;			
		}
	}

	public int getUltValor() {
		return ultValor;
	}
	
	public int tirarDados() {
		ultValor = (int)( Math.random()*caras)+1;
		return ultValor;
	}
	
}
