package ejerc4IA;
/* Ejercicio 4 - Selección de intervalos de publicidad
 Una empresa de publicidad tiene una pantalla LED donde puede mostrar anuncios. Se le presentan n
 pedidos, cada uno con una hora de inicio y de fin. Solo puede mostrar un anuncio a la vez.
  Objetivo:seleccionar la máxima cantidad de anuncios posibles, sin superposición de horarios.*/

public class ejerc4 {
	
	/*
	 * Lo que voy a tratar de hacer: ordenar por la que "termina" antes que todas, luego tomar esa
	 * usarla, y quitarla. Pasar a la siguiente y así sucesivamente...
	 */
	
	List<Pedido> pedidos;
	Solucion mostrarAnuncio;
	
	public Solucion greedy() {
		Collections.sort(pedidos); //ordeno por los que terminen antes...
		int tiempoFin =0;
		while(!pedidos.isEmpty()) {
			Pedido primero = seleccionar()//tomo el primero, es decir, pedidos.get(0);
			pedidos.remove(primero); //quito el primero...
			if(primero.getTiempoInicio() >= tiempoFin) { //si el inicio es mayor a cuando termino el 
				//anterior
				mostrarAnuncio.lista.add(primero); //lo agrego para mostrarlo primero
				tiempoFin = primero.getTiempoFin(); //cambio al nuevo tiempo fin...
			}
		}
		if(mostrarAnuncio!=null) {
			return mostrarAnuncio;
		}
		return null;
	}
}
