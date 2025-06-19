package centro_computos;

public class Barco implements ObjetoComparable{
    private double capacidad;

    public Barco(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public boolean esMenor(ObjetoComparable otro) {
        return this.getCapacidad() < ((Barco) otro).getCapacidad();
    }
}
