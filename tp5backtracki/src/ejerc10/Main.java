package ejerc10;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	List<Integer> conjunto = new LinkedList<>();
    	conjunto.add(-7);
    	conjunto.add(-3);
    	conjunto.add(-2);
    	conjunto.add(-1);
    	conjunto.add(5);
    	conjunto.add(8);
        int N = 3;

        ejerc10 ejercicio = new ejerc10(conjunto, N);
        Solucion resultado = ejercicio.backtracking();

        resultado.mostrarSoluciones();
    }
}
