package SistemaDeEncuestas;

public class Ejecutable {
	public static void main(String[]args) {
		Empleado ee = new Empleado("Juan", "Enceusta");
		Respuesta rr = new Respuesta("Josefa", 45398154);
		Encuesta ec = new Encuesta();
		ec.addEncuestasE(ee);
		ec.addRespuesta(rr);
		
		System.out.println(ec.getEncs());
	}
}
