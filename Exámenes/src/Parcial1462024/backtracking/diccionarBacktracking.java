package Parcial1462024.backtracking;

import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
//ESTA CLASE SE LA PEDI A LA IA, YA QUE EL EJERCICIO DECIA QUE ESTABA "HECHA"
public class diccionarBacktracking {
    // Conjunto de palabras válidas
    private Set<String> palabrasValidas = new HashSet<>();

    // Constructor que carga palabras válidas
    public diccionarBacktracking() {
        palabrasValidas.add("MANO");
        palabrasValidas.add("MONA");
        palabrasValidas.add("REMO");
        palabrasValidas.add("MORA");
        palabrasValidas.add("RAMO");
        palabrasValidas.add("ROEN");
        palabrasValidas.add("TOMA");
        palabrasValidas.add("ROTA");
        palabrasValidas.add("ARTE");
        palabrasValidas.add("RRRR");
        // Agrega más si quieres
    }

    // Convierte la lista de letras en String y verifica si es válida
    public boolean esPalabraValida(List<String> letras) {
        StringBuilder palabra = new StringBuilder();
        for (String letra : letras) {
            palabra.append(letra);
        }
        return palabrasValidas.contains(palabra.toString());
    }
}
