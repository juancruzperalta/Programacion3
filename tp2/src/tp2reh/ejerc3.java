package tp2reh;

public class ejerc3 {
/* Ejercicio 3
 Implemente un algoritmo recursivo que convierta un número en notación decimal a su
 equivalente en notación binaria.
 Recordatorio, por ejemplo convertir el 26 a binario = 11010*/
	public static void main(String[]args) {
		int numeroBinario = 26;
		String resto="";
		System.out.println(buscarBinario(numeroBinario, resto));
	}
	public static String buscarBinario(int num, String resto) {
		if(num > 0) {			
			if(num %2 == 0) {
				resto+="0";
			}else {
				resto+="1";
			}
			return buscarBinario(num/2, resto);
		}
		return resto;
	}
}
