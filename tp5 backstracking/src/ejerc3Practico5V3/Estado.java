package ejerc3Practico5V3;
import java.util.LinkedList;
import java.util.List;
public class Estado {
	List<Integer> ListaVisitados = new LinkedList<>();
	int resultadoRestaSecuencial;
	int valorActual;
	public Estado(List<Integer> listaVisitados, int resultadoRestaSecuencial, int valorActual) {
		super();
		ListaVisitados = listaVisitados;
		this.resultadoRestaSecuencial = resultadoRestaSecuencial;
		this.valorActual = valorActual;
	}
	public List<Integer> getListaVisitados() {
		return ListaVisitados;
	}
	public void setListaVisitados(List<Integer> listaVisitados) {
		ListaVisitados = listaVisitados;
	}
	public int getResultadoRestaSecuencial() {
		return resultadoRestaSecuencial;
	}
	public void setResultadoRestaSecuencial(int resultadoRestaSecuencial) {
		this.resultadoRestaSecuencial = resultadoRestaSecuencial;
	}
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public boolean esVisitado(int hijo) {
		return this.ListaVisitados.contains(hijo);
	}
	public void pasarAlSiguienteHijo(int hijo) {
		this.valorActual=hijo;
	}
	public void restarSecuencialHijo(int hijo) {
		this.resultadoRestaSecuencial= this.resultadoRestaSecuencial-hijo;
	}
	public void agregarVisitadoHijo(int hijo) {
		this.ListaVisitados.add(hijo);
	}
	public void sumarElRestado(int hijo) {
		this.resultadoRestaSecuencial= this.resultadoRestaSecuencial+hijo;
	}
	public void quitarEnLaVisita() {
		this.ListaVisitados.remove(this.ListaVisitados.size()-1);
	}
	
}
