package gastoPublico;

public class Ejecutable {
	public static void main(String[]args) {
		Ciudad cc = new Ciudad(1000,200,"Tresa");
		Contribuyente contri = new Contribuyente("Josa", 3213, 1000, 200);
		ContribuyenteComerciante contriComer = new ContribuyenteComerciante("Jas", 231, 1000, 1, 3000, 2);
		ContribuyenteProgramador contriProg = new ContribuyenteProgramador("Jos", 3211, 100000, 1, 100000, 100);
		cc.addContribuyente(contri);
		contri.addContribuyenteComerciante(contriComer);
		contri.addContribuyenteProgramador(contriProg);
		
		
		System.out.println(contri.getRecaudadoContribuyente());
		System.out.println(contriComer.getRecaudadoContribuyente());
		System.out.println(contriProg.getRecaudadoContribuyente());
//		Provincia pp = new Provincia("Tres Arroyos");
//		Pais pa = new Pais("Argentina");
//		pp.addCiudad(cc);
//		pa.addProvincia(pp);

		System.out.println("Ciudad\t" + cc.getNombreCiudad());
		System.out.println("Gasto mantenimiento\t" + cc.getGastosMantenimiento());
//		System.out.println("Ciudades en Deficit\t" + pp.cantidadCiudadesEnDeficit());
//		System.out.println("Gasto Publico Total Ciudad\t" + pa.gastoPublicoCiudad(pp, cc));
//		System.out.println("Provincias con la mitad en Deficit\t" + pa.deficitFiscalProvincias(pp));
	}
}
