package Avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

	int codigoOrgaSupAlimentaria;

	int tempMantenimiento;
	
	public ProductoRefrigerado(LocalDate fechaVenc, int numeroLote, int codigoOrgaSupAlimentaria, LocalDate fechaEnvasado,
			int tempMantenimiento, String granjaOrigen) {
		super(fechaVenc, numeroLote, fechaEnvasado, granjaOrigen);
		this.codigoOrgaSupAlimentaria = codigoOrgaSupAlimentaria;
		this.fechaEnvasado = fechaEnvasado;
		this.tempMantenimiento = tempMantenimiento;
		this.granjaOrigen = granjaOrigen;
	}

	public int getCodigoOrgaSupAlimentaria() {
		return codigoOrgaSupAlimentaria;
	}

	public void setCodigoOrgaSupAlimentaria(int codigoOrgaSupAlimentaria) {
		this.codigoOrgaSupAlimentaria = codigoOrgaSupAlimentaria;
	}


	public int getTempMantenimiento() {
		return tempMantenimiento;
	}

	public void setTempMantenimiento(int tempMantenimiento) {
		this.tempMantenimiento = tempMantenimiento;
	}


	

}
