package SistemaArchivo;

public class SistemaArchivo {
	protected Directorio dire;
	
	public SistemaArchivo() {
		this.dire = new Directorio("//",0);
	}
	public void agregar(Elemento d) {
		this.dire.addElemento(d);
	}
	
	
	
}
