package JuegoDados;

public class Dado {
	int caras;
	int ultValor;

	public Dado(int caras) {
		this.caras = caras;
		ultValor=0;
		this.obtenerDado();
	}
	public int getCaras() {
		return caras;
	}
	public void setCaras(int caras) {
		if(caras > 6 && caras < 1) {
			caras = 6;
		}
		this.caras = caras;
	}
	public int getUltValor() {
		return ultValor;
	}
	
	public int obtenerDado() {
		ultValor = (int)(Math.random()*(caras)+1);
		return ultValor;
	}
	public static void main(String[] args) {
		Dado d1 = new Dado(5);
		Dado d2 = new Dado(9);
		
		System.out.println(d1.getUltValor());
		System.out.println(d2.getUltValor());
		
	
		for(int i =0; i<20; i++) {
			System.out.println("D1:" + d1.obtenerDado());
			System.out.println("D2:" + d2.obtenerDado());
			
		}
	   
	}
}
