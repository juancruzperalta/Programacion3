package Farmacia.Condicion;

import Farmacia.Medicamento;

public class buscarPorLaboratorio extends Condicion {
	private String labQueBusco;
	
	public buscarPorLaboratorio(String labQueBusco) {
		this.labQueBusco = labQueBusco;
	}
	@Override
	public boolean filtrar(Medicamento mm) {
		return mm.getLabProduce().contains(labQueBusco);
	}

}
