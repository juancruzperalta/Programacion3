package ejercIA5;

public class RobotconObjetoYCargador {
/*Enunciado:
Un robot se encuentra en una celda inicial dentro de una matriz que representa una casa.
En esa casa hay:

0: celda libre 1: obstáculo 2: objeto que el robot debe recoger 3: base de carga (único objetivo final)
Condiciones:
El robot comienza en una celda vacía.

Solo puede moverse en las 4 direcciones (arriba, abajo, izquierda, derecha).

No puede atravesar celdas con 1.

Debe recoger el objeto antes de ir a la base de carga.

No puede visitar una misma celda más de una vez por camino.

Objetivo:
Encontrar el camino más corto desde la posición inicial del
 robot hasta la base de carga pasando obligatoriamente por la celda que contiene el objeto*/
	
	Celda[][]matriz;
	Celda posInicial; //Del robot..
	Solucion caminoMasCorto;
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), false, posInicial)//camino actual, boolean llave...
		caminoMasCorto = new Solucion(new LinkedList<>());
		backtracking(e);
		return caminoMasCorto;
	}
	private void backtracking(Estado e) {
		if(e.celdaActual().getValor()==3) {
			if(e.caminoActual().size() < caminoMasCorto.camino.size()) {
				caminoMasCorto.camino.clear();
				caminoMasCorto.camino.add(new LinkedList<>(e.caminoActual));
			}
		}else {
			List<Celda> celdas = generarHijos(e.celdaActual())//genero los hijos de la celda...
					//solamente verifica que no se vaya por bordes externos...
				for(Celda c: celdas) {
					if(c.getValor()!=1 && !e.caminoActual().contains(c)) {	
					if(c.getValor()==2) {
						e.objetoRecogido = true;
					}					
					e.agregarAVisitado(c); //agrego a la lista del camino
					e.avanzarCelda(c); //avanzo la celda actual a la siguiente
					backtracking(e);
					e.quitarVisitado(c);
					if(e.objetoRecogido=true) {
						e.objetoRecogido=false;
					}
					}
				}
		}
	}
}
