package practico2.ejercicio2;

public class Ejecutable {

	
	public static void main(String[] args) {
		Episodio ep1 = new Episodio("La hora mas tragica", "cuantaanana");
		Episodio ep2 = new Episodio("La hora mas tragica1", "cuantaanana");
		Episodio ep3 = new Episodio("La hora mas tragica2", "cuantaanana");
		Episodio ep4 = new Episodio("La hora mas tragica3", "cuantaanana");

		Temporada t1 = new Temporada();
		t1.addEpisodio(ep1);
		t1.addEpisodio(ep2);
		

		Temporada t2 = new Temporada();
		t2.addEpisodio(ep3);
		t2.addEpisodio(ep4);
		
		Serie serie = new Serie("criminal minds","","","");
		
		serie.addTemporada(t1);
		serie.addTemporada(t2);
		

		System.out.println("Episodios :" + serie.getCantidadEpisodios());
		System.out.println("Episodios Vistos :" + serie.getCantidadEpisodiosVistos());

	    ep1.setCalificacion(4);
	    ep3.setCalificacion(1);

		System.out.println("Episodios :" + serie.getCantidadEpisodios());
		System.out.println("Episodios Vistos :" + serie.getCantidadEpisodiosVistos());

		serie.calificarEpisodio(2, 2, 5);
		System.out.println("Episodios :" + serie.getCantidadEpisodios());
		System.out.println("Episodios Vistos :" + serie.getCantidadEpisodiosVistos());

		System.out.println(ep4.getCalificacion());
		
		System.out.println(serie.todosVistos());
		ep2.setCalificacion(2);
		System.out.println(serie.todosVistos());
		
	}
}
