
public class Dado {
	
	private int cantidadCaras;
	private int ultimoValor;

	public Dado() {
		this.cantidadCaras = 0;
		
	}

	public Dado(int caras) {
		this.setCantidadCaras(caras);
		
	}


	public int getCantidadCaras() {
		return cantidadCaras;
	}

	public void setCantidadCaras(int cantidadCaras) {
		if(cantidadCaras>0) {
		this.cantidadCaras = cantidadCaras;
		}
	}

	public int getUltimoValor() {
		return ultimoValor;
	}
	
	public int tirarDado() {
		
		ultimoValor = (int) (Math.random()*cantidadCaras)+1;
		return ultimoValor;
	}
}