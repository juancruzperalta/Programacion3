
public class ejerc4 {
/* Ejercicio 4
 Implemente un algoritmo recursivo que presente los primeros N términos de la secuencia de
 Fibonacci.
 Por ej. los 6 primeros términos son: 0 1 1 2 3 5*/
	
	public static void main(String[]args) {
		int numeroMax=5;
		numeroRecursivo(numeroMax, 0,1);
	}
	public static void numeroRecursivo(int numeroMax, int num, int num2) {
		System.out.print(num + " , ");
		if(num < numeroMax) {
			numeroRecursivo(numeroMax, num+num2, num);
		}
	}
}
