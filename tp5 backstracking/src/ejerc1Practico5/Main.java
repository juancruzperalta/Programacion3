package ejerc1Practico5;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Hashtable<Integer, List<Integer>> habitaciones = new Hashtable<>();

		List<Integer> lista1 = new LinkedList<>();
		lista1.add(2);
		lista1.add(3);
		habitaciones.put(1, lista1);
		List<Integer> lista2 = new LinkedList<>();
		lista2.add(4);
		habitaciones.put(2, lista2);
		List<Integer> lista3 = new LinkedList<>();
		lista3.add(6);
		habitaciones.put(3, lista3);
		List<Integer> lista4 = new LinkedList<>();
		lista4.add(5);
		habitaciones.put(4, lista4);
		List<Integer> lista5 = new LinkedList<>();
		habitaciones.put(5, lista5);
		List<Integer> lista6 = new LinkedList<>();
		lista6.add(7);
		habitaciones.put(6, lista6);
		List<Integer> lista7 = new LinkedList<>();
		lista7.add(4);
		habitaciones.put(7, lista7);
		List<Integer> visitadas = new LinkedList<>();
		visitadas.add(1);
		ejerc1Practico5 juego = new ejerc1Practico5(habitaciones, 1, 5);
		juego.backTracking();
		juego.imprimirMetodo();
	}
}//Esto fue pedido a chatgpt el main para hacerlo más rápido
