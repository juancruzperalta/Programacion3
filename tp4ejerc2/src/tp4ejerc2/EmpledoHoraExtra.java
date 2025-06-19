package tp4ejerc2;

public class EmpledoHoraExtra extends empleado {
		private double horaExtraTrabajada;
		
	public EmpledoHoraExtra(String nombre, String apellido, int sueldoFijo, int horasTrabajadas, double gananciaHora, int horaExtraTrabajada) {
		super(nombre, apellido, sueldoFijo, horasTrabajadas, gananciaHora);
		this.horaExtraTrabajada = horaExtraTrabajada;
	}

	public double getHoraExtraTrabajada() {
		return horaExtraTrabajada;
	}

	public void setHoraExtraTrabajada(int horaExtraTrabajada) {
		this.horaExtraTrabajada = horaExtraTrabajada;
	}
	public double sueldoHoraExtra() {
		return this.getHoraExtraTrabajada()+this.getSueldoFijo();
	}
	
}
//Los empleados
//por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
//Finalmente, 