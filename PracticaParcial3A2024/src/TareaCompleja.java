import java.util.ArrayList;

public class TareaCompleja extends Compuesto{

	
	public TareaCompleja(String nn) {
		super(nn);
	}

	@Override
	public int empleadosAfectados() {
		int suma=0;
		for(Presupuesto cc: elem) {
			suma += cc.empleadosAfectados();
		}
		return suma;
	}

	@Override
	public int tiempoEstimado() {
		int suma=0;
		for(Presupuesto cc: elem) {
			suma += cc.tiempoEstimado();
		}
		return suma;
	}

	@Override
	public ArrayList<String> materiales() {
		ArrayList<String> aux= new ArrayList<>();
		for(Presupuesto cc: elem) {
			for(String au: aux) {
				if(!cc.materiales().contains(au)) {
					
				aux = cc.materiales();
				}
			}
		}
		return aux;
	}

}
