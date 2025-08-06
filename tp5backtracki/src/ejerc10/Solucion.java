package ejerc10;

import java.util.List;

public class Solucion {
    List<List<Integer>> lista;

    public Solucion(List<List<Integer>> lista) {
        this.lista = lista;
    }

    public void mostrarSoluciones() {
        if (lista.isEmpty()) {
            System.out.println("No hay subconjuntos que cumplan la condición.");
        } else {
            System.out.println("Subconjuntos de tamaño N cuya suma es cero:");
            for (List<Integer> l : lista) {
                System.out.println(l);
            }
        }
    }
}
