import java.util.List;
import java.util.LinkedList;
public class Estado {
	
	int valorActual;
	int sumaActual;
	List<Integer> valoresVisitados = new LinkedList<>();

	public Estado(int valorActual, int sumaActual, List<Integer> valoresVisitados) {
		super();
		this.valorActual = valorActual;
		this.sumaActual = sumaActual;
		this.valoresVisitados = valoresVisitados;
	}
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public boolean noHayValores() {
		return this.valoresVisitados.isEmpty();
	}
	public int obtenerSumaActual() {
		return this.sumaActual;
	}
	public void moverAlSiguienteValor(Integer hijo) {
		 this.valorActual = hijo;
	}
	public void sumarValorSiguiente(int valorActual2) {
		sumaActual = valorActual2+valorActual;
	}
	public void agregarAVisitados(Integer hijo) {
		this.valoresVisitados.add(hijo);
	}
	public void removerAnterior(int hijoAnterior) {
		this.valorActual = hijoAnterior;
		
	}
	public void removerValorActual(int valorActual2) {
		sumaActual = sumaActual-valorActual2;
	}
	public void removerVisitado() {
		this.valoresVisitados.remove(valoresVisitados.size()-1);
	}
	
	
}
