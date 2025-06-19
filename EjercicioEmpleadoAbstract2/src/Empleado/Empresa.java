package Empleado;
import java.util.ArrayList;

public class Empresa {
	protected ArrayList<Empleado> empleados;
	
	public Empresa() {
		empleados = new ArrayList<Empleado>();
	}
	
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public String listadoEmpleado(){
		String aux="";
		for(int i=0; i<empleados.size();i++) {
			aux = empleados.get(i).toString();
		}
		return aux;
	}
	
	public double totalSueldo() {
		double sueldo = 0;
		
		for(int i=0; i<empleados.size();i++) {
			sueldo += empleados.get(i).getSueldo();
		}
		return sueldo;
	}
	
}
//Empleados
//Empleado->nombre,nrolegajo
//empleado c/fijo -> sueldo fijo
//empleado c/ventasPorcentaje -> ventas + porcentaje
//empleado xHoras -> horasTrabajadas + pagoPorHoras
//Total que paga empresa
//Listado de los empleados
