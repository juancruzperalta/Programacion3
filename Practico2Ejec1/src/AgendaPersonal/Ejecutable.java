package AgendaPersonal;

public class Ejecutable {
	public static void main (String[]args) {
		
		Agenda aa = new Agenda();
		Reunion rr = new Reunion(10, "Brazil", "Yo hablo");
		Persona pp = new Persona(600680, "juanc7peralta@gmail", "Juan");
		rr.addPersona(pp);
		aa.addReunion(rr);
		
		System.out.println(aa.obtenerTema());
		System.out.println("CantidadPersonas:" + aa.cantidadPersonas() +"\t"+ 
							"cantidadReuniones:"+ aa.cantidadDeReuniones());
		System.out.println(aa.lugarReunion());
		System.out.println(aa.DuracionReunion());

	}
}
