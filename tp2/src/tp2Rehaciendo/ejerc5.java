package tp2Rehaciendo;

public class ejerc5 {
	/*Ejercicio 5
	 Dado un arreglo ordenado de números distintos A se desea construir un algoritmo que
	 determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
	 cuál se encuentra, es decir, A[i] = i.
	 1.Construir un algoritmo recursivo que responda a dicha verificación*/
	public static void main(String[]args) {
		int[]arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		int valor = 5;
		System.out.println(contieneValorIgual(arr, valor, 0));
	}
	public static int contieneValorIgual(int[]arr, int valor, int pos) {
		if(pos == arr.length)return 0;
		if(pos < arr.length) {
			if(arr[pos]==valor) {
				return pos;
			}
			return contieneValorIgual(arr, valor, pos+1);
		}
		return -1;
	}
}
