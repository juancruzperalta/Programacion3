package Agroquimicos;

public class Main {
	public static void main(String[] args) {
		Cultivo cc = new Cultivo("Maiz");
		Enfermedad ee = new Enfermedad("Covid");
		ee.addEstadoPatologico("Covid");
		cc.addEnfermedad(ee);
		ProductoQuimico pq = new ProductoQuimico("Vacuna faizer");
		pq.addEstadoQuePuedoTratar("Covid");
		ProductoQuimico pq2 = new ProductoQuimico("Vacuna das");
		pq2.addEstadoQuePuedoTratar("Covid");
		ProductoQuimico pq3 = new ProductoQuimico("Vacuna sza");
		pq3.addEstadoQuePuedoTratar("Covid");
		
		System.out.println(pq.puedoTratarEsteEstado(ee));
		System.out.println(cc.meSirveProducto(pq));
		
	}
}
/*
● Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
● Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los
pueden tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
determinados cultivos.*/
