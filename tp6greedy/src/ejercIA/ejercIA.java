package ejercIA;
import java.util.*;
public class ejercIA {
/* Ejercicio 4 – Cobertura de Intervalos
Dado un conjunto de intervalos 
[𝑎𝑖,𝑏𝑖)[a i ,b i​ ) y un intervalo objetivo [𝐴,𝐵)[A,B), determinar el mínimo número de
 intervalos del conjunto que cubren completamente el intervalo 
[𝐴,𝐵)[A,B).Greedy: seleccionar siempre el intervalo que comience antes de
 A y cubra la mayor parte posible hacia la derecha.
}*/
	//A=int
	//B=int
	List<Intervalo> intervalos;
	Intervalo objetivo;
	List<Intervalo> solucionObjetiva = new LinkedList<>(); //La lista de los intervalos que cubren el intervalo
	public ejercIA(List<Intervalo> listado, Intervalo inte) {
		intervalos = listado;
		objetivo = inte;
	}
	public List<Intervalo> greedy(){
		Collections.sort(intervalos); //ordeno los intervalos de menor (A) a mayor...(por A)
		int primerValor=objetivo.getA();
		int ultimoValor = objetivo.getB();
		int cobertura=objetivo.getB()-objetivo.getA();
		int porCubrir=0;
		while(!intervalos.isEmpty()) {
			Intervalo primer = intervalos.get(0);
			intervalos.remove(0);
			if(primer.getA() >= primerValor-1 && primer.getB() <= ultimoValor+1 && porCubrir < cobertura) {				
				porCubrir+=primer.getB()-primer.getA();
				solucionObjetiva.add(primer);
			}
			
		}
		if(solucionObjetiva != null) {
			return solucionObjetiva;
		}
		return null;
	}
	public void imprimir() {
		for(int i=0; i<solucionObjetiva.size(); i++) {
			System.out.println(solucionObjetiva.get(i));
		}
	}
	public static void main(String[]args) {
		List<Intervalo> listado = new LinkedList<>();
		Intervalo i1 = new Intervalo(2, 5);
		Intervalo i2 = new Intervalo(5, 7);
		Intervalo i3 = new Intervalo(7, 11);
		Intervalo i4 = new Intervalo(1, 4);
		Intervalo i5 = new Intervalo(3, 4);
		Intervalo i6 = new Intervalo(5, 6);
		Intervalo i7 = new Intervalo(23, 24);
		Intervalo i8= new Intervalo(10, 11);
		Intervalo i9 = new Intervalo(13, 12);
		Intervalo i10 = new Intervalo(8, 10);
		listado.add(i1);
		listado.add(i2);
		listado.add(i3);
		listado.add(i4);
		listado.add(i5);
		listado.add(i6);
		listado.add(i7);
		listado.add(i8);
		listado.add(i9);
		listado.add(i10);
		Intervalo objetivo = new Intervalo(3,10);
		ejercIA eje = new ejercIA(listado, objetivo);
		eje.greedy();
		eje.imprimir();
	}
}
