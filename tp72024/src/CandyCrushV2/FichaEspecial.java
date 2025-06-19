package CandyCrushV2;

public class FichaEspecial extends Ficha {
	
	public FichaEspecial(String nombreFicha, int fortaleza, int espacioOcupado, int poderDestrucción) {
		super(nombreFicha, fortaleza, espacioOcupado, poderDestrucción);
	}
	
	public int getPoderDestruccion() {
		return this.getFortaleza()/this.getEspacioOcupado();
	}

}
