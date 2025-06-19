package GastoPublico;

public class Ciudad {
	double imp1,imp2,imp3,imp4,imp5;
	int gastosMantenimiento;
	int habitantes;
	String nombreCiudad;

	public Ciudad() {
		this.imp1 = 25;
		this.imp2 = 30;
		this.imp3 = 10;
		this.imp4 = 15;
		this.imp5 = 5;
		this.habitantes = 0;
		this.gastosMantenimiento = 0;
		this.nombreCiudad = "Default";
	}
	public Ciudad(int habitantes, int gastosMantenimiento, String nombreCiudad) {
		this.habitantes = habitantes;
		this.gastosMantenimiento = gastosMantenimiento;
		this.nombreCiudad = nombreCiudad;
	}
	public Ciudad(double imp1, double imp2, double imp3, 
			double imp4, double imp5, int gastosMantenimiento,
			int habitantes, String nombreCiudad) {
		this.imp1 = imp1;
		this.imp2 = imp2;
		this.imp3 = imp3;
		this.imp4 = imp4;
		this.imp5 = imp5;
		this.gastosMantenimiento = gastosMantenimiento;
		this.habitantes = habitantes;
		this.nombreCiudad = nombreCiudad;
	}
	public double getImp1() {
		return imp1;
	}
	public void setImp1(double imp1) {
		this.imp1 = imp1;
	}
	public double getImp2() {
		return imp2;
	}
	public void setImp2(double imp2) {
		this.imp2 = imp2;
	}
	public double getImp3() {
		return imp3;
	}
	public void setImp3(double imp3) {
		this.imp3 = imp3;
	}
	public double getImp4() {
		return imp4;
	}
	public void setImp4(double imp4) {
		this.imp4 = imp4;
	}
	public double getImp5() {
		return imp5;
	}
	public void setImp5(double imp5) {
		this.imp5 = imp5;
	}
	public int getGastosMantenimiento() {
		return gastosMantenimiento;
	}
	public void setGastosMantenimiento(int gastosMantenimiento) {
		this.gastosMantenimiento = gastosMantenimiento;
	}
	public double getMontoRecaudadoCiudad() {
		return this.getImp1()+this.getImp2()+this.getImp3()+this.getImp4()+this.getImp5();
	}
	//Lo que hago aquí es sumo todo lo recaudado de los impuestos, 
	//y lo hago un metodo unico asi no tengo que repetir cada vez llamarlos a todos.
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	
	
}
