public class SistemaArchivo {
    private Directorio raiz;

    public SistemaArchivo() {
        raiz = new Directorio("\\", 0);
    }

    public void addElemento(ElementoSA d){
        this.raiz.addElemento(d);
    }

    public static void main(String[] args) {
        Directorio tudai = new Directorio("TUDAI",2022);
        Directorio anio1 = new Directorio("1er anio",2021);
        Directorio anio2 = new Directorio("2do anio",2024);
        Directorio prog2 = new Directorio("Prog 2",2023);

        Archivo parcial = new Archivo("parcial.doc", 2022,150);
        Archivo recu = new Archivo("recu.pdf",2021, 250);
        Archivo prefi = new Archivo("prefi.txt", 2024,530);

        prog2.addElemento(parcial);
        prog2.addElemento(recu);
        prog2.addElemento(prefi);

        anio2.addElemento(prog2);

        tudai.addElemento(anio1);
        tudai.addElemento(anio2);
        tudai.addElemento(new Archivo("Calendario.pdf", 2024,7));

        Comprimido zip = new Comprimido("fotos.zip", 2024,5);
        zip.addElemento(new Archivo("playa.jpg",2021,100));
        zip.addElemento(new Directorio("viaje",2020));

        SistemaArchivo sistema = new SistemaArchivo();
        sistema.addElemento(tudai);

        tudai.addElemento(zip);

        Links accProg2 = new Links("Link",200,prog2);
        tudai.addElemento(accProg2);

        System.out.println(tudai.cantElementos());

        System.out.println(tudai.getTamanio());
    }
}

