package tp2;

public class ejerc3 {
	 public static void main (String[]args) {
		 int numero = 26;
		 System.out.println();
		 convertirEnBinario(numero);
	 }
	 public static int convertirEnBinario(int numero) {
		 int resto=0;
		 if(numero > 0) {
			 if(numero%2!=0) {
				 resto+=1;
			 }
			 convertirEnBinario(numero/2);
			 System.out.print(resto);
		 }
		return numero;
		 
	 }
}
