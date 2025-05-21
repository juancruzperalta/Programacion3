package tp2;

public class ejerc4 {
	public static void main(String[]args) {
		imprimirFibonacci(0, 1, 50);
	}
	//Tuve un problema al poner -1, y negativos. La recursión se me iba hasta cuándo llenaba la pila
	public static void imprimirFibonacci(int valor1, int valor2, int valorMax) {
		int v1=valor1;
		int v2=valor2;
		if(v1<valorMax) {
			System.out.print(v1 + " - ");
			v2=valor1;
			v1=valor1+valor2;
			imprimirFibonacci(v1, v2, valorMax);
		}
	}
}