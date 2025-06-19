import java.util.ArrayList;

public class Empresa {
	ArrayList<Empleado> empleados;

	public Empresa() {
		empleados = new ArrayList<Empleado>();
	}
	
	
	public void addEmpleado(Empleado ee) {
		if(!empleados.contains(ee)) {
			empleados.add(ee);
		}
	}
	
	public void removeEmpleado(Empleado ee) {
		if(empleados.contains(ee)) {
			empleados.remove(ee);
		}
	}
	
	public String listadoEmpleado() {
		String aux="";
		
		for(int i=0; i<empleados.size();i++) {
			aux += empleados.get(i).toString() + "\n";
		}
		return aux;
	}
	
	public double gastoTotal() {
		double gasto=0;
		
		for(int i=0; i<empleados.size();i++) {
			gasto += empleados.get(i).getSueldo();
		}
		return gasto;
	}
}
