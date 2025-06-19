package centro_computos;
import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ObjetoComparable> elementos;

    public ColaEspera() {
        elementos = new ArrayList<>();
    }

    public void add(ObjetoComparable elemento){
        //lo agrega ordenado
        int i=0;
        while (i<elementos.size() && elemento.esMenor(elementos.get(i)))
            i++;
        if (i<elementos.size())
            elementos.add(i, elemento);
        else
            elementos.add(elemento);
    }

    public Object get(){
        return elementos.remove(0);
    }

    public boolean estaVacia(){
        return elementos.isEmpty();
    }
    @Override
    public String toString() {
        return elementos.toString();
    }
}
