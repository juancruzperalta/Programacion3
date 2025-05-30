package tp2Repracticado;

public class ejercicio5 {
	public static void main(String[]args) {
		int[]A= {-3,-1,0,2,4,6,10};
		System.out.println(esElementoValorPosicion(A,0));
	}//A[4] = 4

	private static boolean esElementoValorPosicion(int[] a, int pos) {
		boolean valorIgual=false;
		if(pos < a.length) {
			if(pos == a[pos]) {
				System.out.println(pos + " POS | ARR[POS] " + a[pos]);
				valorIgual=true;
			}else {
				valorIgual=esElementoValorPosicion(a, pos+1);
			}
		}
		return valorIgual;
	}
}
