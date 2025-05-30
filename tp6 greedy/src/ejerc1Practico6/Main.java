package ejerc1Practico6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	List<Integer> monedas = new ArrayList<>(List.of(100, 25, 10, 5, 1));

    	ejerc1Practico6 cambio = new ejerc1Practico6(monedas, 289);
    	cambio.greedy();
    	cambio.imprimirResultado();
    }
}