package ejerc1;

public class ejerc7DadoIA {
/*Ejercicio 7 - Rutas seguras del mensajero
Un mensajero debe entregar un mensaje en una ciudad representada como una matriz de n x n 
intersecciones. Algunas intersecciones están vigiladas por guardias 
(marcadas con un true en una matriz de booleanos), por lo que no puede pasar por ellas.
 El mensajero puede moverse sólo hacia el norte, este o sur (nunca hacia el oeste), 
 y no puede pasar dos veces por la misma intersección.
El mensajero comienza su recorrido en la intersección de la esquina superior izquierda (0,0) 
y debe llegar a la esquina inferior derecha (n-1,n-1), evitando a los guardias.
Se pide: Diseñar un algoritmo que encuentre todos los caminos válidos que puede tomar el 
mensajero para llegar a destino evitando los guardias y sin repetir intersecciones. 
Mostrar el total de caminos encontrados.
Restricciones:
Puede moverse solo si la casilla no tiene un guardia (false) y no ha sido visitada antes.
Los movimientos permitidos son: norte (↑), este (→), y sur (↓).
El recorrido comienza en (0,0) y finaliza en (n-1,n-1).*/
	Calle[][]ciudad; //una calle tiene booleanos para saber si hay guardia o no
	//entonces, si hay un guardi la ciudad lo va a tener marcado como true
	Calle inicial; //la cuál arranco(0,0);
	Calle salida; //el fin (n-1,n-1);
	Solucion caminosValidos; //lista de listas de los caminos que puede ir el mensajero
	
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), inicial)//una lista de camino qeu voy haciendo
				//y una posicion inicial,
		caminosValidos = new Solucion(new LinkedList<>());
		backtracking(e);
		return caminosValidos;
	}
	private void backtracking(Estado e) {
		if(!noHayMovimientos(e.posActual())){//posActual veo si puedo seguir avanzando
			if(e.posActual().equals(salida) && e.caminoActual().size() < caminosValidos.lista().size()) {
			  caminosValidos.lista.add(new LinkedList<>(e.caminoActual()));	
			}
		}
		List<Calle> callesSiguiente = generarSiguienteCalles(e.posActual())//desde la posicion de la casilla
				//veo si puedo ir a la siguiente qeu no sea el border o me salga de él.
		for(Calle ca : callesSiguiente) {
			if(puedoIrDesde(e.posActual(), ca) && ca.getGuardia()==false) {//veo si puedo ir por  der, abajo o arriba
				//y también veo si ese guardia está falso (es decir, el booleano de la calle es falso)				
				if(!e.caminoActual().contains(ca)) {
					//si no la visité
					Calle casillaAtras = e.posActual();
					e.irALaSiguienteCalle(ca); //de la pos actual voy a la nueva calle
					e.agregarLaVisita(ca);
					backtracking(e);
					e.volverAtras(casillaAtras);
					e.quitarVisita(ca);
				}
			}
		}
	}
}
