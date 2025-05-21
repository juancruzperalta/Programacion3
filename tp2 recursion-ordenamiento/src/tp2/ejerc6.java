package tp2;

public class ejerc6 {
  public static void main(String[]args) {
	  int[] arr = {1,2,3,2,1};
	  imprimirArr(arr);
	  ordenarPorSeleccion(arr);
	  ordenarPorBurbujeo(arr);
	  System.out.println();
	  System.out.println("Arr ordenado");
	  imprimirArr(arr);
  }
  //La complejidad de ambos es N°2. 
  public static void imprimirArr(int[]arr) {
	  for(int i=0; i<arr.length; i++) {
		  System.out.print(arr[i] + " , ");
	  }
  }
  /*Prácticamente ponemos como N el máximo, luego recorremos hasta el máximo menos 1
   * guardamos una variable, luego recorremos nuevamente desde el i+1 hasta que lleguemos al final
   * para comparar unomás adelante. Si es menor, actualizamos la variable. 
   * Luego hacemos la comparación y en una variable temporal guardamos uno y intercambiamos.
   * El menor va al primer lugar, y así actualizando. 
   */
  public static void ordenarPorSeleccion(int[]arr) {
	       int n = arr.length; 
	       for (int i = 0; i < n - 1; i++) { 
	              int minIdx = i; 
	              for (int j = i + 1; j < n; j++) { 
	                     if (arr[j] < arr[minIdx]) { 
	                          minIdx = j; 
	                     } 
	               } 
	               int temp = 
	               arr[i]; arr[i] = 
	               arr[minIdx]; arr[minIdx] = temp; 
	       }
  }
  /*
   * Este es similar al de selccion, recorremos ambos fors, y luego vamos intercambiando cada dos
   * es decir, comprobamos si el siguien te mayor, y vamos intercambiandolo hasta lo ultimo
   */
  public static void ordenarPorBurbujeo(int[] arr) {
      int n = arr.length;
      
      for (int i = 0; i < n - 1; i++) {  
          for (int j = 0; j < n - 1 - i; j++) {  
              if (arr[j] > arr[j + 1]) {  
        
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
      }
  }
}
