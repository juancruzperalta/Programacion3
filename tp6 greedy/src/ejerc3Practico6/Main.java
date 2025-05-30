package ejerc3Practico6;

import java.util.List;
import java.util.LinkedList;

public class Main {
	    public static void main(String[] args) {
	        List<Actividad> actividades = new LinkedList<>();
	        actividades.add(new Actividad(1, 4, "A"));
	        actividades.add(new Actividad(3, 5, "B"));
	        actividades.add(new Actividad(0, 6, "C"));
	        actividades.add(new Actividad(5, 7, "D"));
	        actividades.add(new Actividad(8, 9, "E"));
	        actividades.add(new Actividad(5, 9, "F"));


	        ejerc3Practico6 eje = new ejerc3Practico6(actividades);
	        eje.greedy();
	        eje.imprimirActividad();
	    }
	}
