package tp2Repracticado;

public class ejercicio2 {
	public static void main(String[]args) {
		
	int[] arr = {1,2,4,6,6,7,5};
	System.out.println(buscarElemento(arr,0,5));
	}

	private static boolean buscarElemento(int[] arr, int i, int valueBuscado) {
		boolean esElQuebusco=false;
		if(i < arr.length) {
			if(arr[i]==valueBuscado) {
				esElQuebusco=true;
				return esElQuebusco;
			}
			esElQuebusco = buscarElemento(arr,i+1, valueBuscado);
		}
		return esElQuebusco;
	}
}
