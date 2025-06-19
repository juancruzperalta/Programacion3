package tp2rehaciendo;

public class ejerc3 {
/* Ejercicio 3
 Implemente un algoritmo recursivo que convierta un número en notación decimal a su
 equivalente en notación binaria.
 Recordatorio, por ejemplo convertir el 26 a binario*/
	public static void main(String[]args) {
		int numeroAConvertir=26;
		convertirABinario(numeroAConvertir);
		
	}
	public static void convertirABinario(int numero) {
		int resto=0;
		if(numero > 0) {
			numero=numero/2;
			convertirABinario(numero);
			if(numero/2==0) {
				resto+=1;
			}else {
				resto+=0;
			}
			System.out.println(resto);
		}
		}
}
	
