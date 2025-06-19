
public class Temporada {
	Episodio[] episodios;
	int contador;
	
	
	public Temporada() {
		episodios = new Episodio[1000];
		contador =0;
	}
	
	public int obtenerTotalEpisodios() {
		return contador;
	}

	public void addEpisodio(Episodio eps) {
		if(eps != null &&
				this.contador < episodios.length) {
			episodios[contador] = eps;
			contador++;
		}
	}
	
	public int obtenerTotalEpisodiosVistos() {
		int suma=0;
		for(int i=0; i<contador;i++) {
			if(episodios[i].isSeVio() == true) {
				suma++;
			}
		}
		return suma;
	}
	
	public boolean seVioCompleta() {
		return contador == episodios.length;
	}
	//Si contador intera 1000veces y el eps.length tiene 1000, va a ser completa.
	
	public double calificacionesDadas() {
		double promedio=0;
		for(int i=0; i<contador;i++) {
			if(episodios[i].isSeVio()) {
				promedio += episodios[i].getCalificacion();
			}
		}
		return promedio/this.obtenerTotalEpisodios();
	}
	
}
