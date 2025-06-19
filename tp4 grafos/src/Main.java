import java.util.*;

public class Main {

	public static void main(String[] args) {

		// Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
		GrafoDirigido<Float> grafito = new GrafoDirigido<>();
		
		// Agrego los vertices 1 y 2
		grafito.agregarVertice(1);
		grafito.agregarVertice(2);
		grafito.agregarVertice(3);
		grafito.agregarVertice(4);
		grafito.agregarVertice(5);
		// Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
		grafito.agregarArco(1, 2, 3F);
		grafito.agregarArco(2, 1, 3F);
		grafito.agregarArco(1, 3, 5F);
		grafito.agregarArco(3, 4, 1F);
		grafito.agregarArco(4, 5, 3F);
		grafito.agregarArco(5, 2, 1F);
		//System.out.println(grafito.caminoCiclico());
		System.out.println(grafito.esPartedelCiclo(2));
		/*🔹 Ejercicio 9
Escriba un algoritmo que detecte fuentes y sumideros en un grafo dirigido:

Fuente: vértice con grado de entrada 0.

Sumidero: vértice con grado de salida 0.

🔹 Ejercicio 10
Dado un grafo dirigido y un vértice v, determine si v es parte de algún ciclo del grafo.

🔹 Ejercicio 11
Implemente un algoritmo que, dado un grafo dirigido acíclico (DAG), devuelva una ordenación topológica de sus vértices.

🔹 Ejercicio 12
Dado un grafo dirigido, determine si todos los vértices son alcanzables desde un único vértice origen.

🔹 Ejercicio 13
Implemente un algoritmo que devuelva el camino más corto (menor cantidad de arcos) entre dos vértices en un grafo sin pesos.
(Sugerencia: BFS)

🔹 Ejercicio 14
Escriba una función que determine si eliminando un vértice v de un grafo dirigido, se desconecta algún par de vértices que antes estaban conectados.

🔹 Ejercicio 15
Dado un grafo dirigido, devuelva la cantidad de componentes fuertemente conexas (SCCs).
(Si querés más desafío, hacelo usando Kosaraju o Tarjan, pero también podés resolverlo con DFS + transpuesta)*/
	}

}
