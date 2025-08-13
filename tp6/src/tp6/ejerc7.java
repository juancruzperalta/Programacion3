package tp6;

import java.util.Collections;

public class ejerc7 {
/* Ejercicio 7
 Armando CDs. Dado un conjunto de archivos de canciones, donde cada uno tiene la información de
 nombre, género, duración del tema, y tamaño en kilobytes, se desea grabar un disco CD (que tiene
 una capacidad máxima de M kilobytes) de modo tal de:
 ● Variante A: Maximizar la capacidad ocupada del disco CD.
 ● Variante B: Maximizar la cantidad de canciones que se pueden grabar en el CD.
 Para ambas variantes se quiere, además, que el CD no contenga más de 3 canciones de un mismo
 género.*/
	
	List<Archivo> canciones; //nombre, genero, duracion, tamaño
	Disco CD; //capacidad M...
	List<Archivo> solucion;
	//A---> Ordenar las canciones por peso de mayor a menor...
	//B---> Ordenar por las canciones de peso de menor a mayor...
	
	//No mas de 3 cancones de un mismo género...
	
	public List<Archivo> greedyA(){
		Collections.sort(canciones); //Ordeno por la variante A dicho arriba
		int tamañoDisponible = CD.pesoMaximo();
		while(!canciones.isEmpty() && tamañoDisponible >0) {
			Archivo primera = canciones.get(0);
			if(primera.getTamaño() <= tamañoDisponible) {
				if(!tieneTresGenerosIguales(primera.getGenero(), solucion)) {//Un for que recorre
					//la solucion, si la primera.getGenero tiene genero igual al resto...
				tamañoDisponible-=primera.getTamaño();
				solucion.add(primera);
				}
			}
			canciones.remove(0);
		}
		if(solucion != null) {
			return solucion;
		}
		return null;
	}
	public List<Archivo> greedyB(){
		Collections.sort(canciones);
		//ordeno por el b
		int espacioUsado=0;
		while(!canciones.isEmpty()) {
			Archivo cancion = canciones.get(0);
			if(!tieneTresGenerosIguales(primera.getGenero(), solucion)) {
				
			if(cancion.getPeso()+espacioUsado <= CD.pesoMaximo()) {
				solucion.add(cancion);
				espacioUsado+=cancion.getPeso();
			}
			}
			canciones.remove(0);
		}
		if(solucion != null) {
			return solucion;
		}
		return null;
	}
}
