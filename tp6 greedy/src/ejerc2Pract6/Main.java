package ejerc2Pract6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Objeto> objetos = new ArrayList<>();
        objetos.add(new Objeto(3, 100));
        objetos.add(new Objeto(5, 50));
        objetos.add(new Objeto(4, 70));
        objetos.add(new Objeto(2, 200)); // se fracciona si hace falta

        ejerc2Practico6 eje = new ejerc2Practico6(objetos, 10);
        eje.greedy();
        System.out.println("Objetos en la mochila:");
        eje.imprimirObjeto();

    }
}