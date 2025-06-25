package ejerc3;

public class sumaSubconjunto {
	List<Integer> conjuntoNumero;
	int M = 10; //numero dado para la suma del subconjunto de igual a ese
	Solucion listaCombinacion; //lista de listas con los posibles numeros combinaciones
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), int suma) //llevo la lista de elem act y la suma
		listaCombinacion = new Solucion(new linkedlist<>())
		backtracking(e);
		return listaCombinacion;
	}
	private void backtracking(Estado e) {
		if(e.sumaElementos()==M) {
			listaCombinacion.addAll(e.listaAct());
		}else {
			for(Integer val : conjuntoNumero) {
				if(!e.listaAct.contains(val)) {
					e.agregarValueNuevo(val);//agrego a la lista el valor
					e.sumarValorNuevo(val); //sumo a la suma del estado el vlaor
					if(!poda(e)) //si ya la suma qeu tengo en el estado es mayor a M ya corto y no sigo
						backtracking(e);
					e.quitarValueUltimo();//quito y resto el numero.
					e.restarValor(val);
				}
			}
		}
	}
}
