
public class Serie {
	Temporada[] temp;
	int contador;
	String titulo,descripcion,creador,genero;
	
	public Serie(String titulo, String descripcion, String creador, String genero) {
		this.temp = new Temporada[100];
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		contador=0;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void addTemporada(Temporada temps) {
		if(temps != null && contador < temp.length) {
			temp[contador] = temps;
			contador++;
		}
	}
	public int totalDeTemporadas() {
		return temp.length;
	}
	public int totalDeTemporadasVistas() {
		return contador;
	}
	public int obtenerTotalVistosSerie() {
		int suma=0;
		for(int i=0; i<contador; i++) {
			suma = suma + temp[i].obtenerTotalEpisodiosVistos();
		}
		return suma;
	}
	public double obtenerCalificacionesSerie() {
		double suma=0;
		for(int i=0; i<contador;i++) {
			suma = suma + temp[i].calificacionesDadas();
		}
		return suma/this.totalDeTemporadasVistas();
	}

	public int obtenerTotalEpisodios() {
		int suma =0;
		for(int i=0; i<contador;i++) {
			suma= suma+temp[i].obtenerTotalEpisodios();
		}
		return suma;
	}
	public boolean seVioCompletaLaSerie() {
		return contador == this.totalDeTemporadas();
	}
}
