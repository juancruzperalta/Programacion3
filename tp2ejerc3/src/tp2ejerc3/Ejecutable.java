package tp2ejerc3;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ciudad cd1 = new ciudad(120000,"juan",120,134);
		ciudad cd2 = new ciudad(120000,"juan",1330,134);

		provincia p1 = new provincia("Provincia1");
		impuestos imp1 = new impuestos(23);
		impuestos imp2 = new impuestos(3);

		p1.addCiudad(cd1);
		p1.addCiudad(cd2);
		Pais pais = new Pais();
		pais.addProvincia(p1);
		cd1.addImpuestos(imp1);
		cd2.addImpuestos(imp2);
		System.out.println("habitantes" + "-"+cd1.getHabitantes());
		System.out.println("montoRecaudado" + "-"+cd1.getMontoRecaudado());
		System.out.println("gastos"+ "-"+cd1.getGastosCiudad());
		System.out.println("valorImpuesto" +"-"+imp1.getValorImpuesto());
		
		System.out.println("hay deficit"+"-"+cd1.deficit());
		System.out.println(p1.mitadDeficit(cd1));
	}

}	

