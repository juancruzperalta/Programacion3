import java.util.List;
import java.util.LinkedList;
public class main {
    public static void main(String[] args) {
        List<Integer> valoresBuscar = new LinkedList<>();
        valoresBuscar.add(4);
        valoresBuscar.add(6);
        valoresBuscar.add(2);
        valoresBuscar.add(1);
        int[] solucion = {0,0,0,0};
        tp5FilminasEje1 valor = new tp5FilminasEje1(valoresBuscar, solucion, 9);
        valor.backTracking(new Estado(0, 0, new LinkedList<>()));
        
        valor.imprimirSolucion();
    }
}
