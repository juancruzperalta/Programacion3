package centro_computos;

public class CentroComputadoras {
    private ColaEspera computadorasDisponibles;
    private ColaEspera procesosAEjecutar;

    public CentroComputadoras() {
        this.computadorasDisponibles = new ColaEspera();
        this.procesosAEjecutar = new ColaEspera();
    }

    public Computadora ejecutarProceso(Proceso proceso){
        if (computadorasDisponibles.estaVacia()){
            procesosAEjecutar.add(proceso);
            return null;
        } else {
            Computadora libre = (Computadora) computadorasDisponibles.get();
            libre.ejecutarProceso(proceso);
            return libre;
        }
    }

    public Computadora agregarComputadora(Computadora computadora){
        if (procesosAEjecutar.estaVacia()){
            //insertar ordenada por velocidad
            computadorasDisponibles.add(computadora);
            return null;
        }
        else {
            Proceso siguiente = (Proceso) procesosAEjecutar.get();
            computadora.ejecutarProceso(siguiente);
            return computadora;
        }
    }

    private void imprimirProcesosEsperando() {
        System.out.println("Cola de procesos: "+procesosAEjecutar);
    }
    private void imprimirCompusEsperando() {
        System.out.println("Cola de computadoras: "+computadorasDisponibles);
    }

    public static void main(String[] args) {
        Proceso pro1 = new Proceso("Proc1", 50.0);
        Proceso pro2 = new Proceso("Proc2", 150.0);
        Proceso pro3 = new Proceso("Proc3", 5.0);
        Proceso pro4 = new Proceso("Proc4", 500.0);

        CentroComputadoras centro = new CentroComputadoras();
        centro.ejecutarProceso(pro1);
        centro.ejecutarProceso(pro2);
        centro.ejecutarProceso(pro3);
        centro.ejecutarProceso(pro4);

        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();

        Computadora c1 = new Computadora("Compu1", 900);
        Computadora c2 = new Computadora("Compu2", 200);
        Computadora c3 = new Computadora("Compu3", 500);
        Computadora c4 = new Computadora("Compu4", 100);
        Computadora c5 = new Computadora("Compu5", 1000);
        Computadora c6 = new Computadora("Compu6", 1900);
        Computadora c7 = new Computadora("Compu7", 800);

        centro.agregarComputadora(c1);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();
        centro.agregarComputadora(c2);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();
        centro.agregarComputadora(c3);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();
        centro.agregarComputadora(c4);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();
        centro.agregarComputadora(c5);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();
        centro.agregarComputadora(c6);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();;
        centro.agregarComputadora(c7);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();

        System.out.println("Llega el proceso 2");
        centro.ejecutarProceso(pro2);
        centro.imprimirProcesosEsperando();
        centro.imprimirCompusEsperando();
    }


}
