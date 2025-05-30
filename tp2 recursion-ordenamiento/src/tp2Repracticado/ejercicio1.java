package tp2Repracticado;

public class ejercicio1 {
	
	public static void main(String[]args) {
		
	int[] arr = {1,2,4,5,6,7};
	System.out.println(estaOrdenado(arr,0));
	}
	
	public static boolean estaOrdenado(int[]arr, int valor) {
		boolean orden=true;
		if(valor < arr.length-1) {
		 	if(arr[valor] < arr[valor+1]) {
		 		orden=estaOrdenado(arr, valor+1);
		 	}else {
		 		orden=false;
		 	}
		}
		return orden;
	}
}

