package JuegoDados;

public class Cubilete {
	Dado[] dados;
	
	public Cubilete(int cantDados, int caras) {
		dados = new Dado[cantDados];
		for(int i=0; i<dados.length;i++) {
			dados[i]=new Dado(caras);
		}
	}
	public Cubilete(int cantDados) {
		this(cantDados,6);
	}

	public Dado[] getDados() {
		return dados;
	}

	public void setDados(Dado[] dados) {
		this.dados = dados;
	}
	public int tirar() {
		int suma=0;
		for(int i =0; i<dados.length; i++) {
			suma = suma + dados[i].obtenerDado();
		}
		return suma;
	}
	public static void main(String[] args) {
		Cubilete cup = new Cubilete(10);
		
		System.out.println(cup.tirar());
		
		Dado[] daditos = new Dado[1];
		daditos[0] = new Dado(1);
		
		cup.setDados(daditos);
		
		System.out.println(cup.tirar());
		
        daditos = new Dado[30];
        daditos = null;
		System.out.println(cup.tirar());
		
		
		
	}
}
