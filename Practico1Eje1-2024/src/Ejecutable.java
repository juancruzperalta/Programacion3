import java.time.LocalDate;

public class Ejecutable {
	public static void main(String[]args) {
		Persona pp = new Persona(45398154);
		System.out.println("dni"+pp.getDni());
		Persona pp2 = new Persona(45398154,"Juan","Peralta");
		System.out.println("dni"+pp2.getDni()+ "nombre" + pp2.getNombre() + pp2.getApellido());
		Persona pp3 = new Persona(45398154,"Juan","Peralta",LocalDate.of(2003,9,30));
		System.out.println("dni"+pp3.getDni()+ "nombre" + pp3.getNombre() + pp3.getApellido() + pp3.getFecha_nac());
		Persona pp4 = new Persona("Juan","Peralta",20,LocalDate.of(2003, 9, 30),45398154,"Masculino",85,1.95);
		System.out.println("dni"+pp4.getDni()+ "nombre" + pp4.getNombre()
							+ pp4.getApellido() + pp4.getFecha_nac() + pp4.getEdad() + pp4.getPeso() + pp4.getSexo() + pp4.getAltura());
		
		System.out.println("Es mayor  de edad \t" + pp4.esMayorDeEdad());
		System.out.println("Indice masa corporal \t" + pp4.masaCorporal());
		System.out.println("¿Esta en forma? \t" + pp4.estaEnForma());
		System.out.println("¿Cumple años? \t" + pp4.estaCumpliendo());		
		System.out.println("¿Es mayor de edad? \t" + pp4.esMayorDeEdad());		
		System.out.println("¿Puede votar? \t" + pp4.puedeVotar());		
		System.out.println("¿Es coherente? \t" + pp4.esCoherente());		
	
	}
}
