package centro_computos;
public class Proceso implements ObjetoComparable{
    private String id;
    private double requerimientoMemoria;

    public Proceso(String id, double requerimientoMemoria) {
        this.id = id;
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public String getId() {
        return id;
    }

    public double getRequerimientoMemoria() {
        return requerimientoMemoria;
    }

    @Override
    public String toString() {
        return this.getId()+" (mem="+this.getRequerimientoMemoria()+")";
    }

    @Override
    public boolean esMenor(ObjetoComparable otro) {
        return this.getRequerimientoMemoria() < ((Proceso)otro).getRequerimientoMemoria();
    }
}
