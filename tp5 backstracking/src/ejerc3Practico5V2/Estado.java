package ejerc3Practico5V2;
import java.util.List;
import java.util.LinkedList;
public class Estado {
	List<Integer> ListaVisitados = new LinkedList<>();
	int valorActual;
	int sumaDeLosValores;
	public Estado(List<Integer> listaVisitados, int valorActual, int sumaDeLosValores) {
		super();
		ListaVisitados = listaVisitados;
		this.valorActual = valorActual;
		this.sumaDeLosValores = sumaDeLosValores;
	}
	public List<Integer> getListaVisitados() {
		return ListaVisitados;
	}
	public void setListaVisitados(List<Integer> listaVisitados) {
		ListaVisitados = listaVisitados;
	}
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public int getSumaDeLosValores() {
		return sumaDeLosValores;
	}
	public void setSumaDeLosValores(int sumaDeLosValores) {
		this.sumaDeLosValores = sumaDeLosValores;
	}
	public boolean yaVisite(int hijoProximo) {
		return this.ListaVisitados.contains(hijoProximo);
	}
	public void visitarElSiguiente(int hijoProximo) {
		this.valorActual = hijoProximo;
	}
	public void multiplicarValor(int hijoAnterior, int hijoProximo) {
		this.sumaDeLosValores+= hijoAnterior*hijoProximo;
	}
	public void marcarVisitado(int hijoProximo) {
		this.ListaVisitados.add(hijoProximo);
	}
	public void volverAlAnterior(int hijoAnterior) {
		this.valorActual = hijoAnterior;
	}
	public void desMultiplicarValor(int hijoAnterior, int hijoProximo) {
		this.sumaDeLosValores-= hijoAnterior*hijoProximo;
	}
	public void desmarcarVisitado(int hijoProximo) {
		this.ListaVisitados.remove(this.ListaVisitados.size()-1);
	}
	
	
}
