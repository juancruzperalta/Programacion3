import java.util.*;
public class tp2 {
	public static void main(String[]args) {
		int[] arreglo = {10, 20, 30, 40, 50};
		System.out.println(tenesOrden(arreglo, 0));
		System.out.println(binario(26,0));
		   List<Integer> secuencia = fibonnaci(20, 0, 1);
		    System.out.println(secuencia);
	}
	/*Ejercicio 1
	 * En el peor caso va a tener complejidad O(n) ya que irá hasta el ultimo elemento
	 * En una lista tendria que recorrer todos los elementos
	 * Recursivo tiene un problema que ocupa más memoria que hacerlo con un bucle.
	public static boolean tenesOrden(int[]arr, int pos) {
			if(pos == arr.length-1) return true;
			if(arr[pos] < arr[pos+1]) {
				System.out.println(pos);
				return tenesOrden(arr, pos + 1);
			}
		return false;
	}
	 */
	public static boolean tenesOrden(int[]arr, int pos) {
		boolean valor;
		if(pos==arr.length-1) {
			return true;
		}else {
			valor = tenesOrden(arr, pos+1);
			if(arr[pos] > arr[pos+1]) {
				valor=false;
			}
		}
		return valor;
	}
	public static List<Integer> binario(int valor, int resto){
		List<Integer> lista = new LinkedList<>();
		if(valor > 0) {
			resto = valor/2;
			lista = binario(resto, 0);
			if(valor%2==0) {
				lista.add(0);
			}else {
				lista.add(1);
			}
		}
		return lista;
	}
	
	public static List<Integer> fibonnaci(int valorMax, int v1, int v2){
		List<Integer> lista = new LinkedList<>();
		if(v1 < valorMax) {
			lista.add(v1);
			lista.addAll(fibonnaci(valorMax, v2,v1+v2));
		}
		return lista;
	}
}

