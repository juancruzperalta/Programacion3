package EjercicioEmpleado;

import java.util.ArrayList;

public class Empresa {
	protected String nombre;
	protected ArrayList<Empleado> empleados;
	public Empresa(String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<Empleado>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addEmpleadoNuevo(Empleado eNuevo) {
		if(!empleados.contains(eNuevo)) {
			
		empleados.add(eNuevo);
		}
	}
	

	
	public double getTotal() {
		double aux=0;
		for(int i=0; i<empleados.size(); i++) {
			aux += empleados.get(i).getSueldo();
		}
		return aux;
	}
	
	public String empleadosLista() {
		String salida ="";
		for(int i=0; i<empleados.size();i++) {
			salida += empleados.get(i).toString() + "\n";
		}
		return salida;
	}
	
	public static void main(String[]args) {
		Empresa ee = new Empresa("Empresa Jaime");
		Empleado e1 = new EmpleadoSueldoFijo("Josefa", 1212, 2000);
		Empleado e2 = new EmpleadoPorVenta("Jaime", 311, 200, 10);
		Empleado e3 = new EmpleadoPorHoras("Paz", 10, 1000, 200);
		
		ee.addEmpleadoNuevo(e1);
		ee.addEmpleadoNuevo(e2);
		ee.addEmpleadoNuevo(e3);
		
		System.out.println(ee.empleadosLista());
	}
}
