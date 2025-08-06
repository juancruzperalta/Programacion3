package ejerc10;

import java.util.LinkedList;
import java.util.List;

public class Estado {
    List<Integer> subconjuntoA;
    int suma;
    int N;

    public Estado(List<Integer> subconjuntoA, int suma, int N) {
        this.subconjuntoA = subconjuntoA;
        this.suma = suma;
        this.N = N;
    }

    public void sumarValorLista(int valor) {
        suma += valor;
    }

    public void restarValorLista(int valor) {
        suma -= valor;
    }

    public int sumaSubconjuntoA() {
        return suma;
    }

	public void agregarALista(int numero) {
		this.subconjuntoA.add(numero);
	}

	public void quitarLista() {
		this.subconjuntoA.remove(this.subconjuntoA.size()-1);
	}
}
