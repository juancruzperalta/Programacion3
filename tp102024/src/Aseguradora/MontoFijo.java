package Aseguradora;

public class MontoFijo extends CalcularMonto {
	private int montoFijo;
	
	public MontoFijo(int m) {
		this.montoFijo =m;
	}
	@Override
	public int CalcularMonto(Seguro ss) {
		return montoFijo;
	}

}
