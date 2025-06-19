import java.util.ArrayList;

public class Libreria {
	private ArrayList<ProductoGenerico> prods;
	private Condicion cond;
	public Libreria(Condicion cond) {
		prods = new ArrayList<>();
		this.cond =cond;
	}
	
	
	public void setCond(Condicion cond) {
		this.cond = cond;
	}


	public void addProducto(ProductoGenerico pp) {
		prods.add(pp);
	}
	
	public boolean sePublicita(ProductoGenerico pp) {
		if(cond.cumple(pp)) {
			return true;
		}else {
			return false;
		}
	}
}
