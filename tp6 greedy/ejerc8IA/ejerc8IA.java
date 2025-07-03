package ejerc8IA;

public class ejerc8IA {
/*🧩 Ejercicio: Carga de camiones
Una empresa de logística quiere cargar su camión con paquetes para hacer entregas. 
Se tiene un conjunto de paquetes, donde cada paquete tiene:
Un peso en kilogramos-Un valor (cuánto cobra la empresa por entregarlo)-Un tipo de contenido (ej: alimentos, electrodomésticos, químicos, etc.)
El camión tiene una capacidad máxima de carga de M kilogramos.
❗Restricción:
No se pueden cargar más de 2 paquetes del mismo tipo de contenido (por seguridad o por espacio específico en la bodega del camión).
🧠 Se pide:
Variante A:
Seleccionar los paquetes de forma tal que se maximice el valor total de la carga (aunque no se llene del todo el camión).
Variante B:
Seleccionar los paquetes de forma tal que se minimice el espacio desaprovechado del camión (es decir, que la suma total de pesos se acerque lo más posible a M), sin importar el valor de los paquetes.
*/
	List<Paquete> paquetes; //peso en kg, valor, tipo de contenido
	Camion cam; //carga máxima
	Solucion camionCargado; //una lista de paquetes que se metieron
	//A->se maximice el valor, entonces ordeno de valor de mayor a menor...
	//B->Ordeno de peso de mayor a menor, siempre tratando de poner el máximo peso posible
	public Solucion greedyB() {
		Collections.sort(paquetes);
		int peso=0;
		while(!paquetes.isEmpty() && peso <= cam.pesoMaximo()) {
			Paquete primero = paquetes.get(0);
			paquetes.remove(primero);
			if(!noEstaRepetidoEnLaCarga(camionCargado, primero.getContenido())) {
				//For que recorre la carga que llevo(lista de paquetes) y va mirando si el contenido
				//no este repetido 2 veces...
				if(primero.getPeso()+peso < cam.PesoMaximo()) {
					camionCargado.lista.add(primero);
					peso+=primero.getPeso();
				}
			}
		}
		if(camionCargado!=null) {
			return camionCargado;
		}
		return null;
	}
	public Solucion greedyA() {
		Collections.sort(paquetes);
		int peso=0;
		while(!paquetes.isEmpty()) {
			Paquete primero = seleccionar();//el priemero
			paquetes.remove(primero);
			if(!noEstaRepetidoEnLaCarga(camionCargado, primero.getContenido())) {
				//For que recorre la carga que llevo(lista de paquetes) y va mirando si el contenido
				//no este repetido 2 veces...
			if(primero.getPeso()+peso < cam.pesoMaximo()) {
				camionCargado.lista.add(primero);
				peso+=primero.getPeso();
			}
			}
		}
		if(camionCargado!=null) {
			return camionCargado;
		}
		return null;
	}
}
