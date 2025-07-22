package tp2reh;

public class ejerc1 {
// Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado y
	public static void main(String[]args) {
		
	int arr[] = {1,2,3,4,5,6,7,8,12};
	System.out.println(estáOrdenado(arr,0));
	}
	public static boolean estáOrdenado(int[]arr, int i) {
		boolean orden=false;
		if(i<arr.length-1) {			
			if(arr[i] < arr[i+1]) {
				orden= estáOrdenado(arr, i+1);
			}
		}
		if(i==arr.length-1) {
			orden = true;
		}
		return orden;
	}
}
