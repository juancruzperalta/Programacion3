

public class ejerc2 {
/* Ejercicio 2
 Implemente un algoritmo recursivo para buscar un elemento en un arreglo ordenado
 ascendentemente.*/
	public static void main(String[]args) {		
	int[] arr = {1,2,3,4,5,6,7,8,9,10,11,15,20};
	System.out.println(busquedaBinaria(arr, 7,0,arr.length-1));
	}
	
	public static int busquedaBinaria(int[]arr,int value, int inicio, int fin) {
		if(fin<inicio)return -1;
		int medio = fin-inicio/2;
		if(value > arr[medio]) {
			return busquedaBinaria(arr, value, medio+1, fin);
		}else if(value < arr[medio]){
			return busquedaBinaria(arr, value, inicio, medio-1);
		}else {
			return medio;
		}
	}
}
