package tp2;

public class ejerc7quicksort {
	public static void main(String[]args) {
		int[]arr = {3,5,6,1,2,4,3};
		  imprimirArr(arr);
		  quickSort(arr, 0, arr.length-1);
		  System.out.println();
		  System.out.println("Arr ordenado");
		  imprimirArr(arr);
	  } 
	  public static void imprimirArr(int[]arr) {
		  for(int i=0; i<arr.length; i++) {
			  System.out.print(arr[i] + " , ");
		  }
	  }
	  /*
	   * tenemos un pivote, desde una particion vvamos hasta el final
	   * luego tenemos otro pivote que vamos desde la otra mitad.
	   * Entonces hacemos como el mergeshort excepto que no precisamos otro arr.
	   * ya que ordenamos desde el pivote hasta un lado, entonces nos queda el pivote de un lado lo 
	   * más grande, y luego del otro lado lo más pequeño. Y así vamos ordenandolo.
	   */
	  public static void quickSort(int[] arr, int inicio, int fin) {
	        if (inicio < fin) {
	            int pivote = particion(arr, inicio, fin);

	            quickSort(arr, inicio, pivote - 1);
	            quickSort(arr, pivote + 1, fin);
	        }
	    }

	    public static int particion(int[] arr, int inicio, int fin) {
	        int pivote = arr[fin]; 
	        int i = inicio - 1;

	        for (int j = inicio; j < fin; j++) {
	            if (arr[j] < pivote) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        int temp = arr[i + 1];
	        arr[i + 1] = arr[fin];
	        arr[fin] = temp;

	        return i + 1;
	    }
	}
