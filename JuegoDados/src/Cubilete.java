
public class Cubilete {
	Dado[] dados;
	
	public Cubilete(int cantDados, int caras) {
		dados = new Dado[cantDados];
		for(int i=0; i<dados.length;i++) {
			dados[i] = new Dado(caras);
		}
	}

	public int tirar() {
		int suma=0;
		for(int i=0; i<dados.length;i++) {
			suma=dados[i].tirarDados();
		}
		return suma;
	}
	public int ultimaTirada() {
		int ultValor=0;
		for (int i=0; i<dados.length;i++) {
			ultValor= dados[i].getUltValor();
		}
		return ultValor;
	}

	public Dado[] getDados() {
		return dados;
	}

	public void setDados(Dado[] dados) {
		this.dados = dados;
	}
	
}
