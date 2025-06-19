import java.util.ArrayList;
import java.util.Comparator;

public class PaqueteConVencimiento extends ElementoPaquete {
	private ElementoPaquete eleQueApunta;
	private int vencimiento;
	private double descuento;
	public PaqueteConVencimiento(int codigoIdentificado, ElementoPaquete eleQueApunta, int ven, double des) {
		super(codigoIdentificado);
		this.eleQueApunta =eleQueApunta;
		this.descuento = des;
		this.vencimiento = ven;
		// TODO Auto-generated constructor stub
	}

	public ElementoPaquete getEleQueApunta() {
		return eleQueApunta;
	}

	public void setEleQueApunta(ElementoPaquete eleQueApunta) {
		this.eleQueApunta = eleQueApunta;
	}

	@Override
	public int getValor() {
		int suma=0;
		if(this.antiguedad() < vencimiento) {
			suma = this.getValor();
		}else {
			suma = (int) (suma*descuento);
		}
		return suma;
	}

	@Override
	public int antiguedad() {
		return eleQueApunta.antiguedad();
	}

	@Override
	public ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(this.antiguedad() < vencimiento) {
			aux.addAll(eleQueApunta.buscar(cond,orden));
		}
		return aux;
	}

}
