package Parcial1462024.Greedy;

import java.util.List;
import java.util.LinkedList;

public class mainGreedy {
	public static void main(String[]args) {
		
		TareaGreedy T1 = new TareaGreedy(1,10,2,"T1");
		TareaGreedy T2 = new TareaGreedy(1,20,1,"T2");
		TareaGreedy T3 = new TareaGreedy(1,8,2,"T3");
		List<TareaGreedy> ListaTarea = new LinkedList<>();
		ListaTarea.add(T1);
		ListaTarea.add(T2);
		ListaTarea.add(T3);
		procesadorGreedy proc = new procesadorGreedy(ListaTarea);
		proc.greedy();
		proc.imprimirTareas();
	}
}
