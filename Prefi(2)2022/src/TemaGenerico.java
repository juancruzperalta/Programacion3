import java.util.ArrayList;

public abstract class TemaGenerico {
	public abstract String ejeTematico();
	public abstract ArrayList<String> palabrasClave();
	public abstract int cantTemas(Condicion cond);
	
	public abstract TemaGenerico copiar(Condicion cond);
}
