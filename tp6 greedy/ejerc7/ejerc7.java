package ejerc7;

public class ejerc7 {
/*Ejercicio 7
 Armando CDs. Dado un conjunto de archivos de canciones, donde cada uno tiene la información de
 nombre, género, duración del tema, y tamaño en kilobytes, se desea grabar un disco CD (que tiene
 una capacidad máxima de M kilobytes) de modo tal de:
 ● Variante A: Maximizar la capacidad ocupada del disco CD.
 ● Variante B: Maximizar la cantidad de canciones que se pueden grabar en el CD.
 Para ambas variantes se quiere, además, que el CD no contenga más de 3 canciones de un mismo
 género.*/
	
	List<Cancion> canciones;
	Disco CD;
	//Maximizar la ccapacidad ocupada del disco CD (poner primero las canciones de ordenadas
	//por la de mayor tamaño priemras...-> Maximizar la cantidad de canciones que se puedan grabar
	//poner primero las canciones de menor tamaño...
	//siempre verificar que no se repiten 3 veces el mismo genero.
	Solucion DiscoLleno;
	public Solucion greedyA() {
		Collections.sort(canciones);//ordenar para el A...(explicado arriba)
		int tamañoLlevado=0;
		while(!canciones.isEmpty() && tamañoLlevado < CD.tamañoMaximo()) {
			Cancion primera = seleccionar()//la primera, canciones.get(0);
			canciones.remove(primera);
			if(!CD.tenesYaConGeneroRepetido(primera.getGenero())) {//Es un metodo con un contador y un for,
				//donde recorre las canciones y pregunta si el genero de la primera no está
				//más de 2 veces puesto...
				if(primera.getTamañoCancion()+tamañoLlevado < CD.tamañoMaximo()) {
					DiscoLleno.lista.add(primera);
					tamañoLlevado+=primera.getTamañoCancion();
				}
			}
		}
		if(DiscoLleno!=null) {
			return DiscoLleno;
		}
		return null;
	}
	public Solucion greedyB() {
		Collections.sort(canciones); //ordenar para el b (de menor a mayor)
		int tamaño=0;
		while(!canciones.isEmpty()) {
			Cancion primera = canciones.get(0);
			canciones.remove(primera);
			if(!CD.tenesYaConGeneroRepetido(primera.getGenero())) {//Es un metodo con un contador y un for,
				//donde recorre las canciones y pregunta si el genero de la primera no está
				//más de 2 veces puesto...
				if(primera.getTamaño()+tamaño <= CD.tamañoMaximo()) {
					DiscoLleno.lista.add(primera);
					tamaño+=primera.getTamaño();
				}
			}
		}
		if(discolleno!=null) {
			return discolleno;
		}
		return null;
	}
}
