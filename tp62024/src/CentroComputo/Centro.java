package CentroComputo;

public class Centro {
	protected ListaOrdenada computadoras;
	protected ListaOrdenada procesos;
	
	public Centro() {
		computadoras = new ListaOrdenada();
		procesos = new ListaOrdenada();
	}
	
	public void addComputadoras(Computadora c1) {
		if(procesos.EstaVacia()) {
			computadoras.addProducto(c1);
		}else {
			Procesos pro = (Procesos) procesos.siguienteProd();
	}
	}
	public void addProcesos(Procesos p1) {
			if(computadoras.EstaVacia()) {
				procesos.addProducto(p1);
		}else {
			Computadora compu = (Computadora) computadoras.siguienteProd();
		}
	}
}
