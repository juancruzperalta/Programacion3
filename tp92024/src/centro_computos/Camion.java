package centro_computos;

import java.time.LocalDate;

public class Camion implements ObjetoComparable{
    private LocalDate fechaCarga;

    public Camion(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    @Override
    public boolean esMenor(ObjetoComparable otro) {
        return this.getFechaCarga().isBefore(((Camion)otro).getFechaCarga());
    }
}
