package ejerc1;

public class ejercIA {
/*🧩 Ejercicio propuesto: El recolector de residuos
Enunciado:

Un robot recolector debe ir desde su base (ubicada en una celda de la matriz) 
hasta un contenedor de basura. La casa está representada por una matriz N x M, donde:
0 representa una celda vacía.1 representa un obstáculo (el robot no puede pasar).
2 representa una celda con basura (el robot debe pasar por al menos una)
3 representa la base del robot 4 representa el contenedor de destino.
El robot se puede mover arriba, abajo, izquierda o derecha, y 
quiere encontrar el camino más corto que pase por al menos una celda 
con basura (2) antes de llegar al contenedor (4).*/
	
	Celda[][] matriz; //ya viene representada con sus valores, 0,1,2,3,4.
	Celda inicioRobot;
	Solucion caminoCorto; 
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), inicioRobot);
		caminoCorto = new Solucion(new LinkedList<>());
		backtracking(e);
		return caminoCorto;
	}
	private void backtracking(Estado e) {
		if(e.posActual().getValor()==4 && e.pasoPorBasura) {
			if(caminoCorto.lista.size() > e.lista.size()) {
				caminoCorto.lista.clear();
				caminoCorto.add(e.lista);
			}
		}
		List<Celda> hijos = generarHijosDeLaMatriz(e.posActual()); //genero los hijos mientras
		//que esten dentro de la matriz
		for(Celda c : hijos) {
			if(!e.lista.contains(c) && c.getValor!=1) {
				e.agregarALaLista(c); //agrego a la lista
				e.pasarSigCelda(c); //paso a la celda sig
				if(c.getValor()==2) {
					e.pasoPorBasura=true; //marco como true si pase por la basura
				}
				backtracking(e); //backtracking...
				e.quitarDeLaLista();//el ultimo 
			}
		}
	}
	
}
