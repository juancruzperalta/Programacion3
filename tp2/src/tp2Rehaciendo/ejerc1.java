package tp2Rehaciendo;

public class ejerc1 {
/* Ejercicio 1
 Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado y
 responda:
 1.
 ¿Qué complejidad O tiene? (La complejidad en el peor caso)
 2. ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 3. ¿Quécambiaría si la estructura fuera una lista en lugar de un arreglo*/
	public static void main (String[]arr) {
		
	int[]arr1 = {1,2,3,4,5,6,7,8,9}; //{1,2,3,4,5,6,7,8,9}
	System.out.println(estaOrdenado(arr1,0));
	}

	private static boolean estaOrdenado(int[] arr1, int pos) {
		if(pos==arr1.length-1) return true;
		if(arr1[pos] < arr1[pos+1]) {
			return estaOrdenado(arr1, pos+1);
		}
		return false;
	}
	
	
}
