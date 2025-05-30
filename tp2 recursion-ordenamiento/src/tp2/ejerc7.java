package tp2;

public class ejerc7 {
	public static void main(String[]args) {
		int[]arr = {3,5,6,1,2,4,3};
		  imprimirArr(arr);
		  mergeSort(arr, 0, arr.length-1);
		  System.out.println();
		  System.out.println("Arr ordenado");
		  imprimirArr(arr);
	  }
	/*Ambos en el peor caso son n(n Log n)
	 * y en el mejor caso son n log n
	 */
	  public static void imprimirArr(int[]arr) {
		  for(int i=0; i<arr.length; i++) {
			  System.out.print(arr[i] + " , ");
		  }
	  }
	  /*Si el inicio es menor al fin, saco la mitad de todo el arr.
	   * luego voy haciendo un mergeSort(ordenando), la mitad, luego la otra mitad
	   * hasta 1, pero necesito otro arr para ir ordenando ahi y que me lo devuelva ordenado
	   */
	 public static void mergeSort(int[] arr, int inicio, int fin) {
	        if (inicio < fin) {
	            int medio = (inicio + fin) / 2;
	            
	            mergeSort(arr, inicio, medio);
	            mergeSort(arr, medio + 1, fin);
	            
	            merge(arr, inicio, medio, fin);
	        }
	    }
	 	/*vamos de izq a derecha y sacando la mitad
	 	 * y haciendo un arr para poder ir ordenando
	 	 * luego comparamos cual de los dos primero es mayor o menor y vamos ordenandolo en uno
	 	 * 
	 	 */
	    public static void merge(int[] arr, int inicio, int medio, int fin) {
	        int n1 = medio - inicio + 1;
	        int n2 = fin - medio;

	        int[] izquierda = new int[n1];
	        int[] derecha = new int[n2];
	        for (int i = 0; i < n1; i++) izquierda[i] = arr[inicio + i];
	        for (int j = 0; j < n2; j++) derecha[j] = arr[medio + 1 + j];

	        int i = 0, j = 0, k = inicio;
	        
	        while (i < n1 && j < n2) {
	            if (izquierda[i] <= derecha[j]) {
	                arr[k] = izquierda[i];
	                i++;
	            } else {
	                arr[k] = derecha[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) arr[k++] = izquierda[i++];
	        while (j < n2) arr[k++] = derecha[j++];
	    }
}
