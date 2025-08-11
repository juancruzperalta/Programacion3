package tp2r;

public class ejerc3 {
/* Implemente un algoritmo recursivo que presente los primeros N términos de la secuencia de
 Fibonacci.
 Por ej. los 6 primeros términos son: 0 1 1 2 3 5*/
	public static void main(String[]args) {
		int maximo = 1220;
		int[]arr = new int[16];
		buscarFibonnaci(maximo, arr,0,1,0);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}

private static void buscarFibonnaci(int maximo, int[] arr, int i, int j, int valor) {
	if(valor < arr.length) {		
		if(j < maximo) {
			arr[valor]=i;
			buscarFibonnaci(maximo, arr, j, i+j, valor+1);
		}
	}
}
	
}
