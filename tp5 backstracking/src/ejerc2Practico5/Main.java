package ejerc2Practico5;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[]args) {
		Casilla[][] laberinto = new Casilla[4][4];
		// Fila 0
		laberinto[0][0] = new Casilla(1, false, true, true, false, 0, 0);  // derecha, abajo
		laberinto[0][1] = new Casilla(2, false, true, false, true, 0, 1);  // derecha, izquierda
		laberinto[0][2] = new Casilla(3, false, true, true, true, 0, 2);   // derecha, abajo, izquierda
		laberinto[0][3] = new Casilla(4, false, false, true, true, 0, 3);  // abajo, izquierda

		// Fila 1
		laberinto[1][0] = new Casilla(5, true, false, true, false, 1, 0);  // arriba, abajo
		laberinto[1][1] = new Casilla(1, false, false, true, false, 1, 1); // abajo
		laberinto[1][2] = new Casilla(2, true, true, false, false, 1, 2);  // arriba, derecha
		laberinto[1][3] = new Casilla(3, true, false, true, true, 1, 3);   // arriba, abajo, izquierda

		// Fila 2
		laberinto[2][0] = new Casilla(3, true, false, false, false, 2, 0); // arriba
		laberinto[2][1] = new Casilla(4, true, true, false, false, 2, 1);  // arriba, derecha
		laberinto[2][2] = new Casilla(5, false, true, true, true, 2, 2);   // derecha, abajo, izquierda
		laberinto[2][3] = new Casilla(2, true, false, true, true, 2, 3);   // arriba, abajo, izquierda

		// Fila 3
		laberinto[3][0] = new Casilla(1, false, true, false, false, 3, 0); // derecha
		laberinto[3][1] = new Casilla(2, false, false, false, true, 3, 1); // izquierda
		laberinto[3][2] = new Casilla(3, true, true, false, false, 3, 2);  // arriba, derecha
		laberinto[3][3] = new Casilla(1, true, false, false, true, 3, 3);  // arriba, izquierda (OBJETIVO)

		Casilla inicio = laberinto[0][0];
		Casilla objetivo = laberinto[3][3];
		ejerc2Practico5 valor = new ejerc2Practico5(4, 4, objetivo, laberinto, inicio);
		
		valor.backTracking();
		valor.imprimirEstado();
	}
}//Se lo pedi a la IA para uqe me cree un laberinto completo
