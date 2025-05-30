package tp2Repracticado;

public class ejercicio3 {
	public static void main(String[]args) {
		System.out.println(notacionBinaria(26));
	}

	private static int notacionBinaria(int i) {
		int camino=0;
		if(i >0) {
			notacionBinaria(i/2);
			if(i%2!=0) {
				camino+=1;
			}else {
				camino+=0;
			}
			System.out.println(camino);
		}
		return camino;
	}
}
