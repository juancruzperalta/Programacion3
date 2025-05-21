package ejerc3Practico5V3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ejerc3Practico5V3 {
	/*🧠 Enunciado:
Dado un conjunto de números enteros positivos,
 encontrar todas las combinaciones posibles (sin repetir elementos) 
 cuya resta secuencial de izquierda a derecha sea igual al valor objetivo.

conjunto = [10, 2, 3, 1]
valorObjetivo = 5*/
	List<Integer> conjuntos = new LinkedList<>();
	int valorObjetivo;
	Solucion mejorSolucion;
	public ejerc3Practico5V3(List<Integer> conjuntos, int valorObjetivo, Solucion mejorSolucion) {
		super();
		this.conjuntos = conjuntos;
		this.valorObjetivo = valorObjetivo;
		this.mejorSolucion = mejorSolucion;
	}
	public void backTracking() {
		mejorSolucion = new Solucion(new LinkedList<>());
		Estado estadoActual = new Estado(new LinkedList<>(), 0, 0);
		backTracking(estadoActual);
	}
	public void backTracking(Estado e) {
		if(e.getResultadoRestaSecuencial() == this.valorObjetivo) {
				mejorSolucion.ListaSolucion.add(new LinkedList<>(e.ListaVisitados));
		}else {
			Iterator<Integer> it = this.conjuntos.iterator();
			while(it.hasNext()) {
				int hijo= it.next();
				if(!e.esVisitado(hijo)) {
					e.pasarAlSiguienteHijo(hijo);
					e.restarSecuencialHijo(hijo);
					e.agregarVisitadoHijo(hijo);
					if(!poda(e))
						backTracking(e);
					e.sumarElRestado(hijo);
					e.quitarEnLaVisita();
				}
			}
		}
	}
	public boolean poda(Estado e) {
	    if(e.getResultadoRestaSecuencial() > this.valorObjetivo) {
	    	return false; 
	    }
	    return true;
	}
	public void imprimirSolucion() {
		for(int i=0; i<mejorSolucion.ListaSolucion.size();i++) {
			System.out.println(mejorSolucion.ListaSolucion.get(i));
		}
	}
}
