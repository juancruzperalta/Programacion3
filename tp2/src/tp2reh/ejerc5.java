package tp2reh;

public class ejerc5 {
/* Dado un arreglo ordenado de números distintos A se desea construir un algoritmo que
 determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
 cuál se encuentra, es decir, A[i] = i.
 1.
 Construir un algoritmo recursivo que responda a dicha verificación*/
	public static void main(String[]args) {
		int []arr = {1,2,4,6,8,9,10,12};
		int i=0;
		System.out.println(encuentraValorPos(arr, i));
	}
	public static boolean encuentraValorPos(int[]arr, int i) {
		if(i < arr.length) {
			if(arr[i]==i) {
				return true;
			}
			return encuentraValorPos(arr, i+1);
		}
		return false;
	}
}
