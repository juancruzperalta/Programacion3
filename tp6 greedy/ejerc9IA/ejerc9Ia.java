package ejerc9IA;

public class ejerc9Ia {
/*✅ Ejercicio 9 – Suma mínima de pesos en caminos
Dado un conjunto de cuerdas con distintos pesos, 
querés unirlas todas en una sola cuerda. 
Cada vez que unís dos cuerdas, el costo es la suma de sus longitudes. 
Encontrá el costo mínimo total de unir todas.

Es el clásico del algoritmo de Huffman.
Greedy: unir siempre las dos más cortas.*/
	List<Cuerda> cuerdas;
	Solucion cuerdaCompleta; //una lista de listas de cuerdas que usamos..
	
	public Solucion greedy() {
		Collections.sort(cuerdas); //ordeno las cuerdas por su longitud de menor a mayor...
		int valorAnterior;
		while(!cuerdas.isEmpty()) {
			Cuerda primera = cuerdas.get(0);//Selecciono la primera de todas, va a ser la menor
			cuerdas.remove(primera);
			valorAnterior+=primera.getLongitud();
			cuerdaCompleta.lista.add(primera);
			cuerdaCompleta.coste+=valorAnterior;
		}
		if(cuerdaCompleta!=null) {
			return cuerdaCompleta;
		}
		return null;
	}
}
