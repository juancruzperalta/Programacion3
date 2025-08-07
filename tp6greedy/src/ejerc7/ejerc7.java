package ejerc7;
import java.util.*;
public class ejerc7 {
/* Ejercicio 7
 Armando CDs. Dado un conjunto de archivos de canciones, donde cada uno tiene la información de
 nombre, género, duración del tema, y tamaño en kilobytes, se desea grabar un disco CD (que tiene
 una capacidad máxima de M kilobytes) de modo tal de:
 ● Variante A: Maximizar la capacidad ocupada del disco CD.
 ● Variante B: Maximizar la cantidad de canciones que se pueden grabar en el CD.
 Para ambas variantes se quiere, además, que el CD no contenga más de 3 canciones de un mismo
 género.*/
	
	List<Cancion> canciones; //nombre, genero, duracion del tema, tamaño...
	List<Cancion> cancionesB;
	int CD = 82; //disco con tamaño en kb..
	List<Cancion> varianteA = new LinkedList<>(); //maximzar la capacidad ocupada
	List<Cancion> varianteB = new LinkedList<>(); //maximizar la cantidad de canciones...
	
	public ejerc7(List<Cancion> canciones2,List<Cancion> canciones) {
		this.canciones=canciones2;
		this.cancionesB=canciones;
	}

	//Variante A: Ordenar canciones de peso mayor primera...
	//Variante B: Ordenar de peso menor a peso mayor...
	public List<Cancion> greedyA() {
		Collections.sort(canciones, Collections.reverseOrder());
		int capacidad = CD;
		while(!canciones.isEmpty() && capacidad >= 0) {
			Cancion primera = canciones.get(0); //la primera...
			canciones.remove(0);
			if(!revisarSiTieneTresGenero(primera.getGenero()) && capacidad-primera.getTamaño() >= 0) {
				capacidad-=primera.getTamaño();
				varianteA.add(primera);
			}
		}
		if(varianteA != null) {
			return varianteA;
		}
		return null;
	}
	public List<Cancion> greedyB(){
		Collections.sort(cancionesB);
		int capacidad = CD;
		while(!cancionesB.isEmpty() && capacidad >= 0) {
			Cancion primera = cancionesB.get(0);
			cancionesB.remove(primera);
			if(!revisarSiTieneTresGeneroB(primera.getGenero()) && capacidad-primera.getTamaño() >= 0) {
				capacidad-=primera.getTamaño();
				varianteB.add(primera);
			}
		}
		if(varianteB!=null) {
			return varianteB;
		}
		return null;
	}
	private boolean revisarSiTieneTresGenero(String genero) {
		int cuenta=0;
	    for(int i=0; i<varianteA.size(); i++) {
	    	if(genero.equals(varianteA.get(i).getGenero())) {
	    		cuenta++;
	    	}
	    }
	    return cuenta >= 3;
	}
	private boolean revisarSiTieneTresGeneroB(String genero) {
		int cuenta=0;
	    for(int i=0; i<varianteB.size(); i++) {
	    	if(genero.equals(varianteB.get(i).getGenero())) {
	    		cuenta++;
	    	}
	    }
	    return cuenta >= 3;
	}
	public void imprimirCancion() {
		for(int i=0; i<varianteA.size(); i++) {
			
			System.out.println(i + "- " + varianteA.get(i));
		}
	}
	public void imprimirCancionB() {
		for(int i=0; i<varianteB.size(); i++) {
			
			System.out.println(i + "- " + varianteB.get(i));
		}
	}
	public static void main(String[]args) {
		List<Cancion> canciones = new LinkedList<>();
		Cancion c1 = new Cancion("Uno", "Rock", 3, 5);
		Cancion c2 = new Cancion("Dos", "Rock", 6, 12);
		Cancion c3 = new Cancion("Tres", "Pop", 4, 6);
		Cancion c4 = new Cancion("Cuatro", "Pop", 2, 3);
		Cancion c5 = new Cancion("Cinco", "Trap", 8, 15);
		Cancion c6 = new Cancion("Seis", "Rock", 3, 5);
		Cancion c7 = new Cancion("Siete", "Rock", 6, 12);
		Cancion c8 = new Cancion("Ocho", "Rock", 4, 6);
		Cancion c9 = new Cancion("Nuevo", "Rock", 2, 3);
		Cancion c10 = new Cancion("Diez", "Romantico", 8, 15);
		canciones.add(c1);
		canciones.add(c2);
		canciones.add(c3);
		canciones.add(c4);
		canciones.add(c5);
		canciones.add(c6);
		canciones.add(c7);
		canciones.add(c8);
		canciones.add(c9);
		canciones.add(c10);
		
		ejerc7 eje = new ejerc7(canciones,canciones);
		eje.greedyA();
		eje.imprimirCancion();
		System.out.println("-----------------------");
		eje.greedyB();
		eje.imprimirCancionB();
	}
}
