package ejercIA2;

public class combinacionPalabras {
/*Ejercicio 5
Combinaciones de palabras con longitud exacta
Dado un conjunto de palabras (strings) de distintas longitudes y un número entero L, 
encontrar todas las combinaciones de palabras cuya longitud total (sumando caracteres)
 sea exactamente igual a L.

Idea: este problema se puede resolver con backtracking probando distintas combinaciones
 de palabras, acumulando su longitud y descartando las que excedan L.

*/
	List<List<String>> palabras;
	Solucion listadoCombinaciones; //lista de palabras de combinaciones
	int L;
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), 0); //llevo una lista de palabras usadas, y ademas
		//una cantidad de letras..
		listadoCombinaciones = new Solucion(new LinkedList<>());
		backtracking(e);
		return listadoCombinaciones;
	}
	private void backtracking(Estado e) {
		if(e.cantPalabras == this.L) {
			listadoCombinaciones.add(e.listadoActual);
		}else {
			for(String palabra: palabras) {
				e.agregarPalabra(palabra);
				e.sumarCantPalabra(palabra.length);
				backtracking(e);
				e.quitarPalabra()//la ultima;
				e.restarPalabra(palabra.length);
			}
		}
		
	}
}
