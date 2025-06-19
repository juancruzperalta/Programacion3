package CandyCrush;

import java.util.ArrayList;

import CandyCrush.Condiciones.filtrarPorDestruccion;
import CandyCrush.Condiciones.filtrarPorEspacio;
import CandyCrush.Condiciones.filtrarPorFortaleza;

public class Main {
	public static void main(String[] args) {
		Ficha ff = new Ficha("Chocolate",1,1,0);
		Ficha ff2 = new Ficha("Piedra",6,1,0);
		Ficha ff3 = new Ficha("Caramelo a Rayas",1,1,10);
		Ficha ff4 = new Ficha("Torta",8,4,4);
		Tablero tt = new Tablero(1000, 100);
		
		tt.addFichas(ff);
		tt.addFichas(ff2);
		tt.addFichas(ff3);
		tt.addFichas(ff4);

		System.out.println("Fichas por destruccion");
		ArrayList<Ficha> Ficha = tt.buscarFicha(
				new filtrarPorDestruccion(2)
				);
				
		System.out.println(Ficha);
		
		System.out.println("Fichas por Espacio");
		ArrayList<Ficha> Ficha2 = tt.buscarFicha(
				new filtrarPorEspacio(5)
				);
				
		System.out.println(Ficha2);
		
		System.out.println("Fichas por Fortaleza");
		ArrayList<Ficha> Ficha3 = tt.buscarFicha(
				new filtrarPorFortaleza(3)
				);
				
		System.out.println(Ficha3);
	}
}
