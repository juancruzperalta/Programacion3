package centro_computos;

public class Computadora extends Dispositivo implements ObjetoComparable{
    private double velocidad;
    private String nombre;

    private Proceso procesoEnEjecucion;
    
    
    public Computadora(String nombre, double velocidad) {
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.procesoEnEjecucion = null;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void ejecutarProceso(Proceso proceso){
        System.out.println("Ejecutando "+proceso+" en "+this);
        this.procesoEnEjecucion = proceso;
    }

    public boolean estaLibre(){
        return this.procesoEnEjecucion != null;
    }

    @Override
    public String toString() {
        return this.getNombre()+" (mem="+this.getVelocidad()+")";
    }

    @Override
    public boolean esMenor(ObjetoComparable otro) {
        return this.getVelocidad() < ((Computadora)otro).getVelocidad();
    }
}
