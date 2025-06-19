package tp2rehaciendo;

public class ejerc2 {
/* Ejercicio 2
 Implemente un algoritmo recursivo para buscar un elemento en un arreglo ordenado
 ascendentemente*/
	public static void main(String[]args) {
		
	int[]arr = {1,2,3,4,5,6,7,8,9};
	int valorABuscar = 9;
	
	System.out.println(buscarElemento(arr, valorABuscar,0));
	}
	public static boolean buscarElemento(int[]arr, int valor, int pos) {
		if(valor == arr[pos]) {
			return true;
		}
		if(pos==arr.length-1)return false;
		if(pos < arr.length) {
			return buscarElemento(arr, valor, pos+1);
		}
		return false;
	}
}
