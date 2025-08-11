package tp2r;

public class ejerc5 {
/*Ejercicio 5
 Dado un arreglo ordenado de números distintos A se desea construir un algoritmo que
 determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
 cuál se encuentra, es decir, A[i] = i.
 1.
 Construir un algoritmo recursivo que responda a dicha verificación.
 2. Mostrar la pila de ejecución para la invocación algoritmo([-3,-1, 0, 2, 4, 6, 10]*/
	public static void main(String[]args) {
		int[]arr = {-3,-1, 0, 2, 4, 6, 10};
		int pos=0;
		System.out.println(contieneValorIgualPos(arr, pos));
	}
	public static boolean contieneValorIgualPos(int[]arr, int pos) {
		if(pos < arr.length) {
			if(pos == arr[pos]) {
				return true;
			}
			return contieneValorIgualPos(arr, pos+1);
		}
		return false;
	}
}
