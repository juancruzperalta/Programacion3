import java.util.ArrayList;

public class TareaAvanzada extends Compuesto {
		public TareaAvanzada(String nn) {
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
				int tiempo = cc.tiempoEstimado();
				if(suma>tiempo) {					
				suma = cc.tiempoEstimado();
				}
			}
			return suma;
		}

		@Override
		public ArrayList<String> materiales() {
			ArrayList<String> aux= new ArrayList<>();
			for(Presupuesto cc: elem) {
				aux = cc.materiales();
			}
			return aux;
		}

}
