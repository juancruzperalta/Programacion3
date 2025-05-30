package tp2;

public class ejerc5 {
	public static void main(String[]args) {
		int[]arr = {-3,-1, 0, 2, 4, 6, 10};
		int pos=0;
		System.out.println(verificarPos(arr, pos));
	}
	//En este caso el arr[pos] si ya es mayor a la posición, nunca va a llegar en el caso de un 
	//arreglo ordenado y sin repetidos.
	//arr[pos] = 3 y pos es en 2, nunca va a llegar por que pos suma 1 más.
	public static boolean verificarPos(int[]arr, int pos) {
		if(pos > arr.length-1) return false;
		if(arr[pos] > pos) return false;
		if(pos < arr.length-1) {
			if(arr[pos] == pos) {
				return true;
			}
			System.out.println(arr[pos] + " | " + pos);
			return verificarPos(arr, pos+1);
		}
		return false;
	}
}
