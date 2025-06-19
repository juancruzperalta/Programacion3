package PlataformaStreaming;

import java.util.ArrayList;

import PlataformaStreaming.Condicion.CondicionAND;
import PlataformaStreaming.Condicion.buscarPorActor;
import PlataformaStreaming.Condicion.buscarPorDuracionMenor;
import PlataformaStreaming.Condicion.buscarPorGenero;

public class Main {
	public static void main(String[] args) {
		Pelicula pp = new Pelicula("Naldo","Naldo lombardi", "Juan", 2024, 100, 10);
		Plataforma plata = new Plataforma("Netflix");
		plata.addPelicula(pp);
		pp.addGeneros("Comedia");
		pp.addActores("Brad pit");
		Pelicula pp1 = new Pelicula("The walking dead","Zombies", "Charly", 2012, 10000, 16);
		plata.addPelicula(pp1);
		pp1.addGeneros("Zombie");
		pp1.addActores("Daryl dixon");
		Pelicula pp2 = new Pelicula("Los simpson","Comedia", "Matt", 2004, 300, 8);
		plata.addPelicula(pp2);
		pp2.addGeneros("Comedia");
		pp2.addActores("Homero");
		
		/*
		System.out.println("Peliculas con actor");		
		ArrayList<Pelicula> filtrar = plata.buscar(
				new buscarPorActor("Brad pit")
				);
*/
		/*
		System.out.println("Peliculas con genero o actor");
		ArrayList<Pelicula> filtrarPorGenOAct = plata.buscar(
				new CondicionAND(
						new buscarPorActor("Brad pit"),
						new buscarPorGenero("Accion")
						));
		System.out.println(filtrarPorGenOAct);
		*/
		System.out.println("Peliculas rentables");
		boolean filtrarRentable = plata.peliculaRentable(
			new CondicionAND(
				new buscarPorDuracionMenor(120),
				new buscarPorGenero("Comedia")
					)
				);
		
		System.out.println(filtrarRentable);
	}
}
