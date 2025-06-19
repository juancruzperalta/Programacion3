package SistemaArchivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaArchivo.Condiciones.Condicion;
import SistemaArchivo.Condiciones.NombreContenido;

public class SistemaArchivo {
    private Directorio raiz;

    public SistemaArchivo() {
        raiz = new Directorio("\\", 2020);
    }

    public void addElemento(ElementoSA d){
        this.raiz.addElemento(d);
    }

    public ArrayList<ElementoSA> buscar(Condicion cond, Comparator<ElementoSA> comp){
        return raiz.buscar(cond, comp);
    }
    

    public static void main(String[] args) {
        Directorio tudai = new Directorio("TUDAI", 2023);
        Directorio anio1 = new Directorio("1er anio", 2023);
        Directorio anio2 = new Directorio("2do anio", 2024);
        Directorio prog2 = new Directorio("Prog 2", 2024);

        Archivo parcial = new Archivo("parcial.doc",2022 ,150);
        Archivo recu = new Archivo("recu.pdf", 2023,250);
        Archivo prefi = new Archivo("prefi.txt",2024 ,530);

        prog2.addElemento(parcial);
        prog2.addElemento(recu);
        prog2.addElemento(prefi);

        anio2.addElemento(prog2);

        tudai.addElemento(anio1);
        tudai.addElemento(anio2);
        tudai.addElemento(new Archivo("Calendario.pdf", 2022,7));

        Comprimido zip = new Comprimido("fotos.zip", 2023,5);
        zip.addElemento(new Archivo("playa.jpg",2023,100));
        zip.addElemento(new Directorio("viaje",2024));

        SistemaArchivo sistema = new SistemaArchivo();
        sistema.addElemento(tudai);

        tudai.addElemento(zip);

        Link accProg2 = new Link("Acceso", 2024,prog2);
        tudai.addElemento(accProg2);

        
        Condicion fNombre = new NombreContenido("pdf");
        System.out.println(sistema.buscar(fNombre, null));

        
    }
		
}