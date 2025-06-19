package Procesador;

import java.util.ArrayList;


public class Computadora {

	public static void main(String[] args) {
		
		
		Procesador p1 = new Procesador();
		Procesador cata = p1;
		Procesador tom = p1;
		
		
		
		p1.addTarea(new Tarea(23,2,45));
		p1.addTarea(new Tarea(123,50,30));
		p1.addTarea(new Tarea(3,10,0123));
		p1.addTarea(new Tarea(20,12,405));
		p1.addTarea(new Tarea(45,1,0));
		p1.addTarea(new Tarea(23,150,5));


		//CAMBIAR LA FORMA DE ORDENAMIENTO DE P1

	    
	    
	
	}
	


}
