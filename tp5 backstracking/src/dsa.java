
public class dsa {
	List<Integer> conjunto;
	int N;
	Solucion sol;
	
	public solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(),0);
		sol = new Solucion(new LinkedLis<>());
		backtracking(e);
		return sol;
	}
	public void backtracking(Estado e) {
		if(e.cantNums()==N) { //cant numeros es el tamaño del arr actual.
			if(e.sumaact()==0) {
				sol.listaConj.addAll(new LinkedList<>(e.listaAct));
			}
		}else {
			for(Integer num: conjunto) {
				if(!e.listaAct.contains(num)) {
					e.avanzarSuma(num); //sumo a la sumaAct el valor del numero
					e.agregarVisitado(num); //agrego al listado de visitados
					backtracking(e); 
					e.restarValue(num); //resto el valor numero al sumaAct.
					e.quitarVisita(); //quito la visita
				}
			}
		}
	}
}
