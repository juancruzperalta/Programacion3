package tp4ejerc5;

import java.time.LocalDate;

public class refrigerados extends productos{
	private int codigoSuperAlimentaria;
	private double TemperaturaMant;
	
	public refrigerados(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen, int CodigoSuperAlimentaria, double TemperaturaMant) {
		super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen);
		this.codigoSuperAlimentaria = CodigoSuperAlimentaria;
		this.TemperaturaMant = TemperaturaMant;
	}
	
	public int getCodigoSuperAlimentaria() {
		return codigoSuperAlimentaria;
	}

	public void setCodigoSuperAlimentaria(int codigoSuperAlimentaria) {
		this.codigoSuperAlimentaria = codigoSuperAlimentaria;
	}

	public double getTemperaturaMant() {
		return TemperaturaMant;
	}

	public void setTemperaturaMant(double temperaturaMant) {
		TemperaturaMant = temperaturaMant;
	}

}
