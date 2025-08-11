package tp2r;

public class ejerc2 {
	public static void main(String[]args) {
	int valorBinario=26;
	int[] arr = new int[5];
	buscarBinaria(0,valorBinario, arr);
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]);
	}
	}

	private static void buscarBinaria(int valor,int valorBinario, int[] arr) {
		if(valor < arr.length) {	
		if(valorBinario%2==0) {
			arr[valor] = 0;
		}else {
			arr[valor]=1;
		}
		buscarBinaria(valor+1, valorBinario/2, arr);
		}
	}
}
