import java.util.List;

import java.util.LinkedList;
public class tp5FilminasEje1 {
	
	List<Integer> valores = new LinkedList<>();
	int[]solucion = {0,0,0,0};
	int valorObjetivo;
	public tp5FilminasEje1(List<Integer> valoresBuscar, int[] solucion, int valorObjetivo) {
		super();
		this.valores = valoresBuscar;
		this.solucion = solucion;
		this.valorObjetivo = valorObjetivo;
	}
	
	public void backTracking(Estado est) {
		if(est.noHayValores()) {
			   if (est.obtenerSumaActual() == valorObjetivo) {
				 System.out.println("hola");
			    }
		}else {
			for(Integer hijo : valores) {				
				int hijoAnterior = est.getValorActual();
				est.moverAlSiguienteValor(hijo);
				est.sumarValorSiguiente(est.valorActual);
				est.agregarAVisitados(hijo);
				if(!poda(est))
					backTracking(est);

				est.removerAnterior(hijoAnterior);
				est.removerValorActual(est.valorActual);
				est.removerVisitado();
			}
		}
	}

	private boolean poda(Estado est) {
		List<Integer> valores = this.valores;
		for(Integer vec: valores) {
			if(vec+est.obtenerSumaActual() < this.valorObjetivo) {
				return false;
			}
		}
		return true;
	}
	public void imprimirSolucion() {
		for(int i=0; i<solucion.length; i++) {			
            System.out.print(solucion[i] + " , ");
		}
    }
}
