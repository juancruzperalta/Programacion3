package GastoPublico;

public class Pais {
	Provincia[] prov;
	int contadorProv;
	String nombrePais;
	int mitadDeficit;

	public Pais(String nombrePais) {
		prov = new Provincia[10];
		contadorProv=0;
		this.nombrePais = nombrePais;
		this.mitadDeficit = 2;
	}
	public Pais(int mitadDeficit) {
		this.mitadDeficit = mitadDeficit;
	}

	public void addProvincia(Provincia pv) {
		if(pv != null && contadorProv < prov.length) {
				prov[contadorProv] = pv;
				contadorProv++;
		}
	}
	public double gastoPublicoCiudad(Provincia prov, Ciudad cds) {
		double gastos=0;
		double recaudado=0;
		double total=0;
		for(int i=0; i<prov.getCantidadCiudades(); i++) {
			if(cds.getHabitantes() > 1) {		
			gastos = cds.getGastosMantenimiento();
			recaudado = cds.getMontoRecaudadoCiudad();
			total = recaudado-gastos;				
			}
		}
		return total;
	}
	public double gastosMantenimientoCiudad(Ciudad cds) {
		return cds.getGastosMantenimiento();
	}
	public String deficitFiscalProvincias(Provincia pv) {
		if(pv.cantidadCiudadesEnDeficit() >= prov.length/mitadDeficit) {
			return pv.getNombre();
		}
		return null;
	}
	
}