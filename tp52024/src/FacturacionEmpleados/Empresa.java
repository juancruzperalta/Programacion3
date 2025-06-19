package FacturacionEmpleados;

import java.util.ArrayList;

public class Empresa {
	ArrayList<Empleado> empleados;
	String nombreEmpresa;
	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		empleados = new ArrayList<>();
	}
	
	public void addEmpleados(Empleado e) {
		empleados.add(e);
	}

	
	public double gastoTotal() {
		double suma=0;
		for(int i=0; i<empleados.size(); i++) {
			suma+= empleados.get(i).getSueldoMensual();
		}
		return suma;
	}
	
	public static void main(String[]args) {
		Empresa ee = new Empresa("Franquicia");
		Empleado ep = new Empleado("Jose", "Albert", 2000);
		EmpleadoVendedor ev= new EmpleadoVendedor("Albert", "Yosefe", 3000, 100,10);
		EmpleadoBono eb = new EmpleadoBono("Jasa", "asas", 13213, 200, 20);
		ee.addEmpleados(ep);
		ee.addEmpleados(ev);
		ee.addEmpleados(eb);
		
		System.out.println(ep.toString());
		System.out.println(ev.toString());
		System.out.println(eb.toString());
		System.out.println("Gasto total\t"+ee.gastoTotal());
	}
	
}
