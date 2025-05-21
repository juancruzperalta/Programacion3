package tp2;

public class ejerc1 {
	public static void main(String[]args) {
		int[] arreglo = {10, 20, 30, 40, 50};
		System.out.println(tenesOrden(arreglo, 0));
	}
	/*Ejercicio 1
	 * En el peor caso va a tener complejidad O(n) ya que irá hasta el ultimo elemento
	 * En una lista tendria que recorrer todos los elementos
	 * Recursivo tiene un problema que ocupa más memoria que hacerlo con un bucle.
	 */
	public static boolean tenesOrden(int[]arr, int pos) {
			if(pos == arr.length-1) return true;
			if(arr[pos] < arr[pos+1]) {
				System.out.println(pos);
				return tenesOrden(arr, pos + 1);
			}
		return false;
	}

}

