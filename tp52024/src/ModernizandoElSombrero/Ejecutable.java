package ModernizandoElSombrero;

public class Ejecutable {
	public static void main(String[]args) {
		
		Casa cc = new Casa(10, "Casa");
		CasaEnemiga ce = new CasaEnemiga(10, "Casa Enemiga");
		Familia fa = new Familia("Gerardo");
		Alumno al = new Alumno("Juan");
		Alumno al1 = new Alumno("Jose");
		Alumno al2 = new Alumno("Braian");
		al.addFamiliares(fa);
		al.addCualidades("Hola");
		al1.addCualidades("Chau");
		al2.addCualidades("Hola");
		cc.addCualidadesRequeridas("Hola");
		cc.addCasaEnemiga(ce);
		cc.addAlumnoCasa(al);
		cc.addAlumnoCasa(al2);
		cc.addAlumnoCasa(al1);
		
		System.out.println(cc.cantAlumnos());
	}
}
