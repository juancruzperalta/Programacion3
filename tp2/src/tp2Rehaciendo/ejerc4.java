package tp2Rehaciendo;

import java.util.List;
import java.util.LinkedList;

public class ejerc4 {
	/* Implemente un algoritmo recursivo que presente los primeros N términos de la secuencia de
 	Fibonacci.
 	Por ej. los 6 primeros términos son: 0 1 1 2 3 5*/
	public static void main(String[]args) {
		List<Integer> lista = new LinkedList<>();
		System.out.println(fibonacci(lista,50,0,1));
	}
	public static List<Integer> fibonacci(List<Integer> lista,int val, int valor1, int valor2) {
		if(valor1 < val) {
			lista.add(valor1);
			lista=fibonacci(lista, val, valor2, valor1+valor2);
		}
		return lista;
	}
}
//0,1,1,2,3,5,8,13,21,