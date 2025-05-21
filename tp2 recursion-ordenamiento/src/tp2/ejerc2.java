package tp2;

public class ejerc2 {
	public static void main(String[]args) {
		int[] arreglo = {10, 20, 30, 40, 50};

		System.out.println("pos: "+  buscarElemento(arreglo, 10,0));
		//arreglo, valor, posición a buscar. 
	}
	/*Ejercicio 2
	 * En el peor caso tendria que ser O(n) ya que vamos hasta el ultimo elemento
	 * Lo hago así, entonces si ya valor es mayor al ultimo elemento se corte
	 * Ejemplo: Paso 80 y el ultimo elemento (que como esta ordenado debería ser el mayor)
	 * sea 40 corte. 
	 */
	public static int buscarElemento(int[]arr, int valor, int pos) {
		if(pos > arr.length-1) return -1;
		if(valor > arr[arr.length-1]) return -1;
		if(arr[pos]==valor) {
			return pos;
		}else {
			return buscarElemento(arr, valor, pos+1);
		}
	
	}
}
