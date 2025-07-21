package ejerc1;
/* Ejercicio 1
 Se tiene un conjunto de salas comunicadas entre sí a través de puertas que se abren solamente en
 un sentido. Una de las salas se denomina entrada y la otra salida. Construir un algoritmo que
 permita ir desde la entrada a la salida atravesando la máxima cantidad de salas. Idea: podría
 representar el problema mediante un grafo dirigido, donde cada nodo es una habitación, y cada
 puerta es un arco dirigido hacia otra habitación.*/
public class eje1 {
 /*
  * El arbol sería un vertice inicial que es el donde arranca
  *  con un arco apuntando hacía otro, y así sucesivamente
  * es decir, con una única lado de salida. Otro vertice final salida que es quien es la salida
  */
	Hashtable<Integer, List<Arco<T>>> salas;
	Solucion mejorSolucion; //lista de nodos que pueden ir de una puerta hasta otra
	int inicialActual, salida;
	
	public eje1(Hashtable<Integer, List<Arco<T>>> salas, Solucion mejorSolucion, int inicialActual, int salida) {
		super();
		this.salas = salas;
		this.mejorSolucion = mejorSolucion;
		this.inicialActual = inicialActual;
		this.salida = salida;
	}

	public Solucion backtracking() {
		Estado e =new Estado(new LinkedList<>(), 0);//salas por las que pase...y el vertice inicial actual
		mejorSolucion = new Solucion(new LinkedList<>()); //listas por el camino que pase
		backtracking(e);
		return mejorSolucion;
	}
	private void backtracking(e) {
		if(e.salaAct()==salida) {
			mejorSolucion.lista.clear();
			mejorSolucion.lista.addAll(e.salasPasadas());
		}
		List<Arco<T>> listado = salas.get(e.salaAct());
		for(Arco<T> arc: listado) {
			int prox = arc.getProxVertice();
			int anterior = e.salaAct();
			e.visitarProxSala(prox);
			e.agregarVisitada(prox);
			backtracking(e);
			e.volverSalaAnterior(anterior);
			e.quitarVisitada(); //la ultima
		}
	}
}
