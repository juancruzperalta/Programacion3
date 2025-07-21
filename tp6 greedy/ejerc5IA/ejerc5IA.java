package ejerc5IA;

public class ejerc5IA {
/* Ejercicio 5 - Cobertura de intervalos
 Dado un segmento [0, L], y un conjunto de n intervalos [ai, bi], 
 encontrar el subconjunto mínimo de intervalos que cubra completamente [0, L].*/
	List<Integer> segmento;
	List<List<Integer>> intervalos;
	
	Solucion subconjuntoEncontrado;
	
	public Solucion greedy() {
		Collections.sort(intervalos); // Y los ordenos del que termine primero antes,
		//Es decir que el ultimo valor del intervalo sea menor al primero del siguiente...
		int ultimo=0;
		int primeroSeg=0;
		int ultimoIntervalo=0;
		int posSeg = 0;
		while(!intervalos.isEmpty() && posSeg <= segmento.size()) {
			ultimo = segmento.get(segmento.size-1);
			List<Integer> primero  =seleccionar()//el primer intervalo
			intervalos.remove(primero);
			while(primero.get(0) <= ultimo && primero.get(0) >= primeroSeg) { //el primer intervalo, el primer valor
				//sea menor al ultimo del segmento...[ej: ultimo=10, primero = 0]
				subconjuntoEncontrado.add(primero);
				ultimoIntervalo = primero.get(primero.size()-1);
				primeroSeg = ultimoIntervalo; // rl primero del segmento, ahora va a ser como el ultimo
				//que puse del intervalo...[de 0, a 5,p or ejemplo]
			}
		}
		if(subconjuntoEncontrado!=null) {
			return subconjuntoEncontrado;
		}
		return null;
	}
	
}
