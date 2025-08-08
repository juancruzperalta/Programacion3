package ejerc3IA;
import java.util.*;
public class ejerc3IA {
/* Ejercicio 6 – Formar Números con Dígitos Dados
Dado un conjunto de dígitos posibles 
{1,3,5,9}{1,3,5,9}, formar el mayor número posible de N cifras que sea divisible por un número D.
Greedy: ir eligiendo los dígitos mayores posibles, y aplicar pruning si el resto acumulado no 
permite lograr la divisibilidad al final.*/
	List<Integer> digitos = new LinkedList<>();
	int N=4;
	int D=3; 
	List<List<Integer>> digitosSolucion = new LinkedList<>();
	
	public ejerc3IA(List<Integer> digitos2) {
		this.digitos = digitos2;
	}
	public List<List<Integer>> greedy(){
		List<Integer> lista = new LinkedList<>();
		int sumaNumero=0;
		while(!digitos.isEmpty() && lista.size() < N) {
			int primero = digitos.get(0);
			digitos.remove(0);
			sumaNumero+=primero;
			if(sumaNumero%D==0) {
				lista.add(primero);
			}
		}
		digitosSolucion.add(new LinkedList<>(lista));
		if(digitosSolucion != null) {
			return digitosSolucion;
		}
		return null;
	}
	private void imprimir() {
		for(int i=0; i<digitosSolucion.size();i++) {
			System.out.println(digitosSolucion.get(i) + " tamaño " + N + " | divisible por" + D);
		}
	}
	public static void main(String[]args) {
		List<Integer> digitosa = new LinkedList<>();
		digitosa.add(1);
		digitosa.add(3);
		digitosa.add(5);
		digitosa.add(9);
		
		ejerc3IA eje = new ejerc3IA(digitosa);
		eje.greedy();
		eje.imprimir();
	}
}
