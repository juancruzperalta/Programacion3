
public class ejerc3 {
/*Ejercicio 3
 Implemente un algoritmo recursivo que convierta un número en notación decimal a su
 equivalente en notación binaria.
 Recordatorio, por ejemplo convertir el 26 a binario:*/
	public static void main(String[]args) {
		int numero=26;
		buscarNumeroDecimal(numero);
	}
private static void buscarNumeroDecimal(int n) {
    if (n > 1) {
    	buscarNumeroDecimal(n / 2);  // llamada recursiva con la división
    }
    System.out.print(n % 2); // imprime el bit (resto)
}
}
