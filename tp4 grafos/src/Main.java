
public class Main {

	public static void main(String[] args) {

		// Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
		GrafoDirigido<Float> grafito = new GrafoDirigido<>();
		
		// Agrego los vertices 1 y 2
		grafito.agregarVertice(1);
		grafito.agregarVertice(2);

		// Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
		grafito.agregarArco(1, 2, 3F);
		
		// Obtengo el arco entre 1 y 2, y le pido la etiqueta
		Float etiqueta = grafito.obtenerArco(1, 2).getEtiqueta();
		System.out.println(etiqueta); // Deber�a imprimir 3
		/*Iterator<Arco<Float>> it = grafito.obtenerArcos();
		while (it.hasNext()) {
		    Arco<Float> arco = it.next();
		    System.out.println("Arco de " + arco.getVerticeOrigen() + " a " + arco.getVerticeDestino() + ", etiqueta: " + arco.getEtiqueta());
		}*/

	}

}
