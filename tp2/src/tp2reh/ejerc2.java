package tp2reh;

public class ejerc2 {
/*Ejercicio 2
 Implemente un algoritmo recursivo para buscar un elemento en un arreglo ordenado
 ascendentemente.*/
	public static void main(String[]args) {
		int []arr = {1,2,3,4,5,6,7,8,9};
		int numBusca = 3;
		System.out.println(encontreNumero(arr, numBusca, 0,arr.length-1));
	}
	public static int encontreNumero(int[]arr, int numBusca, int inicio, int fin) {
		if(fin<inicio)return -1;
		int medio = fin-inicio/2;
		if(numBusca > arr[medio]) {
			return encontreNumero(arr, numBusca, medio+1, fin);
		}else if(numBusca < arr[medio]) {
			return encontreNumero(arr, numBusca, inicio, medio-1);
		}else {
			return medio;
		}
	}
}
