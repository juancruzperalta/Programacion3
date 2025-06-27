package ejerc4;

public class subConjuntos {
/* Ejercicio 4
 Partición de conjunto. Dado un conjunto de n enteros se desea encontrar,
  si existe, una partición en dos subconjuntos disjuntos,
   tal que la suma de sus elementos sea la misma*/
	//El arbol es, por la cant de subconjuntos, A o B en este caso, pongo 6 en A, o pongo 6 en B
	//y así sucesivamente {}A {}B --> {6} A {} B --> {6,2}A {} B --->.....{6,2}A {5,3}B
	List<Integer> conjuntoNumeros;//lista que me la dan ej: {6,2,5,3}
	Solucion solucion; //una lista de conjuntos, 2 en este caso.
	
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), new LinkedList<>(), 0,0)//voy a tener las listas necesarias
			//en este caso 2, y también voy a tener una suma para saber cuánto voy llevando en cada una
		solucion = new Solucion(new LinkedList<>()); //tiene las listas respuesta (2 acá)
		backtracking(e);
		return solucion;
	}
	private void backtracking(Estado e) {
		if(conjuntoNumeros.isEmpty()) {
			if(e.sumaNumerosA()==e.sumaNumerosB()) {
				solucion.lista.addAll(e.listaA);
				solucion.lista.addAll(e.listaB);
			}
		}else {
			int numeroPrimero = this.conjuntoNumeros.get(0); //tomo el primer numero del conjunto/lista
			this.conjuntoNumeros.remove(0); 
			for(List c : e.getListas()) { //y por cada conjunto que hay en el estado, voy poniendo
				if(!c.contains(numeroPrimero){//el numero que corresponde en cada conjunto para ver
				c.add(numeroPrimero);//si es solucion
				backtracking(e);
				c.remove(numeroPrimero);
				}
			}
			conjuntoNumeros.add(numeroPrimero,0);
		}
	}
	
}
