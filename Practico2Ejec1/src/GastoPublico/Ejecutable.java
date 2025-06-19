package GastoPublico;

public class Ejecutable {
	public static void main(String[]args) {
		Ciudad cc = new Ciudad(1,2,3,1,5,50,4,"Reta");
		Ciudad c1 = new Ciudad(1,2,3,1,5,50,4,"Claromeco");
		Ciudad c2 = new Ciudad(1,2,3,1,5,50,4,"Orense");
		Ciudad c3 = new Ciudad(1,2,3,1,5,50,4,"Copetonas");
		Ciudad c4 = new Ciudad(1,2,3,1,5,50,4,"Oriente");
		Provincia pp = new Provincia("Tres Arroyos");
		Pais pa = new Pais("Argentina");
		pp.addCiudad(cc);
		pp.addCiudad(c1);
		pp.addCiudad(c2);
		pp.addCiudad(c3);
		pp.addCiudad(c4);
		//Pais
		pa.addProvincia(pp);
		
		System.out.println("Ciudad\t" + cc.getNombreCiudad());
		System.out.println("Gasto mantenimiento\t" + cc.getGastosMantenimiento());
		System.out.println("Recaudacion\t" + cc.getMontoRecaudadoCiudad());
		System.out.println("Ciudades en Deficit\t" + pp.cantidadCiudadesEnDeficit());
		System.out.println("Gasto Publico Total Ciudad\t" + pa.gastoPublicoCiudad(pp, cc));
		System.out.println("Provincias con la mitad en Deficit\t" + pa.deficitFiscalProvincias(pp));
	}
}
