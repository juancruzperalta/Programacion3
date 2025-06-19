package CandyCrush;

public class FichaEspecial extends Ficha {

	public FichaEspecial(String nombre, int fortaleza, int espacioOcupa, int poderDestruccion) {
		super(nombre, fortaleza, espacioOcupa, poderDestruccion);
		// TODO Auto-generated constructor stub
	}

	public int getPoderDestruccion() {
		return super.getFortaleza()/super.getEspacioOcupa();
	}
}
