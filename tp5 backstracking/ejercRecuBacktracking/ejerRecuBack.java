package ejercRecuBacktracking;

public class ejerRecuBack {
	
/*Del conjunto: {1,2,3,4,5,6}
 * El arbol sería dividir en 3 los conjuntos, es decir te quede: A{1,4} B{2,3} C{5,6}, el tema es que
 * la diferencia no tendría que superar a K, K=6, esto sería una solucion esos subconjuntos
 */
	List<Integer> conjunto;
	Solucion listaDeSubconjuntos; //Tres listas para la solucion
	int K = 6; //ejemplo
	
	
	public Solucion backtracking() {
		Estado e = new Estado(conjunto, new LinkedList<>(), new LinkedList<>() , new LinkedList<>(), 0);
		//tres listas, el conjunto para ir modificandolo y quitando los que ya usé y la diferencia
		listaDeSubconjuntos = new Solucion(new LinkedList<>()); //listas de listas
		backtracking(e,0)//llevo el estado, y un entero para ir por cada subconjunto de la lista de cnojunto
		return listaDeSubconjuntos;
	}
	private void backtracking(Estado e, int pos) {
		if(pos==e.conjunto.size()) {//si el ultimo elemento es el ultimo del conjunto es un est final
			int diferenciaActual = e.quedarmeConDiferenciaMayor();//me quedo con la diferencia
			//más grande de cada suma de listas, en comparación a la otras...
			//acá sería del A{1,4} y B{2,3} y C{5,6}, la suma de cada una seria 6-9-6..
			//entonces la mayor diferencia sería 6-9 = 3...
			if(diferenciaActual() <= this.K) {
				listaDeSubconjuntos.listas.add(e.listaA());
				listaDeSubconjuntos.listas.add(e.listaB());
				listaDeSubconjuntos.listas.add(e.listaC());
			}
		}else {
			for(List lista : e.getListas()){//obtengo la lista A,B, o C...
				int posAnterior = pos;
				lista.add(e.conjunto[pos]);//agrego el numero en la posicion esta...
				e.sumarValorDeDiferencia(lista, e.conjunto[pos]);//sumo el valor
				//lo que ya tenia más el nuevo...
				backtracking(e, pos+1);
				lista.remove(e.conjunto[posAnterior]);
				e.restarValorDeDiferencia(lista, e.conjunto[pos]);//resto el valor
			}
				
		}
	}
}
