import java.util.ArrayList;

public abstract class Elemento {
	public abstract ArrayList<String> palabrasClave();
	public abstract String ejeTematico();
	public abstract Elemento copiar(Condicion cond);
	public abstract int buscar(Condicion cond);
}
