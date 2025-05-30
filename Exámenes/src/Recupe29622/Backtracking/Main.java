package Recupe29622.Backtracking;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de tablero Sudoku con una celda vacía (0)
        int[][] tablero = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int filaMAX = 9;
        int colMAX = 9;

        Backtracking bt = new Backtracking(tablero, filaMAX, colMAX);
        bt.backTracking();
        bt.imprimirSolucion();
    }
}
