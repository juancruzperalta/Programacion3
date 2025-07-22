package tp2reh;

public class ejerc4 {
/*Ejercicio 4
 Implemente un algoritmo recursivo que presente los primeros N términos de la secuencia de
 Fibonacci.
 Por ej. los 6 primeros términos son: 0 1 1 2 3 5*/
	public static void main(String[]args) {
		int numeroMax = 50;
		primerosTerminosSec(numeroMax,0,1);
	}
	public static void primerosTerminosSec(int num, int v1, int v2) {
		if(v1 < num) {
			System.out.print(v1 + " , ");
			primerosTerminosSec(num, v2, v1+v2);
		}
	}
}
