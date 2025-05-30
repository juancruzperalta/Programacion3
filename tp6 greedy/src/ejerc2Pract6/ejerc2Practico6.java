package ejerc2Pract6;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
public class ejerc2Practico6 {
	List<Objeto> objetos;
	Mochila mejorSolucion;
	public ejerc2Practico6(List<Objeto> objetos, int pesoMaximo) {
		super();
		this.objetos = objetos;
		mejorSolucion = new Mochila(new LinkedList<>(), pesoMaximo);
	}
	
	public Mochila greedy() {
		//Ordenar los objetos;
		Collections.sort(objetos, Collections.reverseOrder());
		int peso=0;
		while(!objetos.isEmpty() && peso < mejorSolucion.pesoMaximoMochila) {
			Objeto valor = seleccionarMejorValor(objetos);
			objetos.remove(valor);
			if(peso+valor.getPeso() < mejorSolucion.pesoMaximoMochila) {
				mejorSolucion.objetosDentro.add(valor);
				peso += valor.getPeso();
			}else {
				int espacioLibre = mejorSolucion.pesoMaximoMochila-peso;
				double objFraccion = espacioLibre / valor.getPeso();
				valor.setPeso(espacioLibre);
				valor.setValor(objFraccion*valor.getValor());
						mejorSolucion.objetosDentro.add(valor);
				peso=mejorSolucion.pesoMaximoMochila;
			}
		}
		if(mejorSolucion != null) {
			return mejorSolucion;
		}
		return null;
	}

	private Objeto seleccionarMejorValor(List<Objeto> objetos) {
		Objeto objMejor = objetos.get(0);
		double relacionMejor = objMejor.getValor() / objMejor.getPeso();
		for(Objeto obj: objetos) {
			double relacionAlt = obj.getValor() / obj.getPeso();
			if(relacionMejor < relacionAlt) {
				objMejor = obj;
				relacionMejor = relacionAlt;
			}
		}
		return objMejor;
	}
	
	
	public void imprimirObjeto() {
		for(int i=0; i<mejorSolucion.objetosDentro.size(); i++) {
			System.out.println(mejorSolucion.objetosDentro.get(i));
		}
	}
}
