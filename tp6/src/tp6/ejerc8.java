package tp6;

import java.util.Collections;
import java.util.List;

public class ejerc8 {
/*
Ejercicio 8
 Coloreo de un grafo. Dado un grafo se desea colorear cada uno de sus vértices utilizando la menor
 cantidad posible de colores totales, sabiendo que dos vértices adyacentes no podrán utilizar el
 mismo color*/
	
	Grafo grafoDirigido;
	List<String> colores;
	Hashtable<Integer, String> solucion;
	public List<String> greedy(int verticeId){
		Collections.sort(grafoDirigido.listado); //ordeno los vertices de menor a mayor..v1,v2,v3...
		Iterator<Integer> adya = grafoDirigido.listado.iterator();
		while(adya.hasNext()) {
			int prox = adya.next();
			int colorId=0;
			while(colorId < colores.size() && !puedoPintar(colores[colorId],grafoDirigido, prox,solucion)) {
				colorId++;
			}
			
			return greedy(verticeId);
		}
	}
}
