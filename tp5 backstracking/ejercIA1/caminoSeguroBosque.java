package ejercIA1;

public class caminoSeguroBosque {
/*Ejercicio 4
Camino seguro en un bosque
Se tiene una cuadrícula que representa un bosque, 
donde algunas celdas tienen trampas (no se puede pasar) y otras son seguras.
Se desea encontrar todos los caminos posibles desde la esquina superior 
izquierda hasta la esquina inferior derecha, moviéndose 
solo hacia la derecha o hacia abajo, sin pisar trampas.
Idea: se puede representar como una matriz de booleanos donde true 
indica celda segura y false una trampa. Aplicar backtracking para ir probando
 caminos válidos, y guardar aquellos que lleguen al destino*/
	Celda[][]bosque; //crea un bosque con un tamaño (imaginemos un 4x4)
	Celda inicio, fin; //Pido una celda para que inicie y una donde termine (puede ser la 0,0 y 4,4)
	//primera y ultima
	Solucion listadoCaminos; //una lista de listas de los caminos.
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), Celda actual)//Manteog una lista actual de celdas pasadas
				//y la celdaActual
		listadoCaminos = new Solucion(new LinkedList<>());
		backtracking(e);
		return listadoCaminos;
	}
	private void backtracking(Estado e) {
		if(e.celdaActual()==this.fin) {
			listadoCaminos.add(e.caminoActual());
		}else {
			List<Celda> celdasProx = generarCeldasHijas(e.celdaActual()) //Simplemente,
					//genera la celda con los hijos que puedo ir(der o abajo)
					//controla unicamente que no se salgan de los bordes, la parte de trampa
					//la controlaro acá abajo
			for(Celda celd : celdasProx) {
				if(!esCeldaTrampa(celd)) {
					if(!e.caminoActual().contains(celd)) {
						e.agregarAlCamino(celd); //la agrego al camino
						backtracking(e);
						e.quitarDelCamino();//la ultima celda;
					}
				}
			}
		}
	}
	
}
