package ejerc2IA;

import java.util.*;

public class ejerc2IA {
/*Ejercicio 5 – Selección de Proyectos con Tiempo Límite
Se tiene un conjunto de proyectos, cada uno con:una duración 𝑑𝑖 di ,un beneficio 𝑏𝑖 b i,y
 una fecha límite 𝑡𝑖 t i​ .Un proyecto solo se puede realizar si comienza y 
 termina antes de su fecha límite. Calcular la máxima ganancia total seleccionando 
 y ordenando proyectos.*/
	List<Proyecto> proyectos; //duracion di, y un beneficio bi fecha limite ti...
	List<Proyecto> solucion = new LinkedList<>(); //lista de los proyectos que serían la ganancia total...
	
	public ejerc2IA(List<Proyecto> proy) {
		proyectos = proy;
	}
	//Un proyecto solo se ahce si comienza y termina antes de su fecha limite.... calcular la ganancia total
	
	//En greedy ordenaría los proyectos de mayor beneficio primero...a menor
	
	public List<Proyecto> greedy(){
		Collections.sort(proyectos);
		int tiempoQueVoy=0;
		while(!proyectos.isEmpty()) {
			Proyecto primera = proyectos.get(0);
			proyectos.remove(0);
			if(tiempoQueVoy+primera.getDuracion() <= primera.getFechaLimite()) {
				solucion.add(primera);
				tiempoQueVoy+=primera.getDuracion();
			}
		}
		if(solucion!=null) {
			return solucion;
		}return null;
	}
	public void imprimir() {
		for(int i=0; i<this.solucion.size(); i++) {
			System.out.println(i + " " + this.solucion.get(i));
		}
	}
	public static void main(String[]args) {
		List<Proyecto> proy = new LinkedList<>();
		Proyecto p1= new Proyecto(7, 1, 10);
		Proyecto p2= new  Proyecto(4, 2, 7);
		Proyecto p3= new Proyecto(9, 3, 4);
		Proyecto p4= new  Proyecto(6, 4, 15);
		Proyecto p5= new  Proyecto(2, 5, 6);
		proy.add(p1);
		proy.add(p2);
		proy.add(p3);
		proy.add(p4);
		proy.add(p5);
		
		ejerc2IA eje = new ejerc2IA(proy);
		eje.greedy();
		eje.imprimir();
	}
}
