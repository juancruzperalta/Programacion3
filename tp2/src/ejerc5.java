
public class ejerc5 {
/*Ejercicio 5
 Dado un arreglo ordenado de números distintos A se desea construir un algoritmo que
 determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
 cuál se encuentra, es decir, A[i] = i.
 1.
 Construir un algoritmo recursivo que responda a dicha verificación.
 2. Mostrar la pila de ejecución para la invocación algoritmo([-3,-1, 0, 2, 4, 6, 10])*/
	public static void main(String[]args) {
		int[]a = {0,1,2,3,4,5,6,7,8,9};
		int pos=0;
		buscarIgualPos(a,pos);
	}
	public static void buscarIgualPos(int[]a, int pos) {
		if(pos == a.length)return;
		if(pos < a.length-1) {
			if(pos==a[pos]) {
				System.out.println("iguales che");
			}else {				
			buscarIgualPos(a,pos+1);
			}
		}
	}
}
