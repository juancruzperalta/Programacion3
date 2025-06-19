package CentroComputo;

public class Computadora extends ColaEspera{
	protected int velocidad;
	protected String nombre;
	
	public Computadora(int velocidad, String nombre) {
		this.velocidad = velocidad;
		this.nombre = nombre;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean sosMayor(ColaEspera t1) {
		return this.getVelocidad() < ((Computadora)t1).getVelocidad();
	}
	
	
}
//Centro de computos que ejecuta procesos
//Procesos
//Computadoras disponibles
//-----------------
/*Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las 
computadoras que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben 
esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de 
memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer 
lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que 
prioriza la selección de las computadoras más rápidas*/