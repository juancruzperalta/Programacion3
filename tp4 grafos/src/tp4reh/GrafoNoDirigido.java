package tp4reh;

public class GrafoNoDirigido<T> extends GrafoDirigido<T> {

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta, int peso) {
		super.agregarArco(verticeId1, verticeId2, etiqueta, peso);
		super.agregarArco(verticeId2, verticeId1, etiqueta, peso);
	}
	
	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		super.borrarArco(verticeId1, verticeId2);
		super.borrarArco(verticeId2, verticeId1);
	}

	@Override
	public int cantidadArcos() {
		return super.cantidadArcos() / 2;
	}

}
