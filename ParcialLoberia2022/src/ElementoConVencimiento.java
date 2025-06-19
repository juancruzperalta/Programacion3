import java.util.ArrayList;
import java.util.Comparator;

public class ElementoConVencimiento extends ElementoAlquiler {
	private ElementoAlquiler referencia;
	private double descuento;
	private int mesesVencimiento;
	

	
	

	public ElementoConVencimiento(int codigo, ElementoAlquiler referencia, double descuento, int mesesVencimiento) {
		super(codigo);
		this.referencia = referencia;
		this.descuento = descuento;
		this.mesesVencimiento = mesesVencimiento;
	}



	public int getMesesVencimiento() {
		return mesesVencimiento;
	}



	public void setMesesVencimiento(int mesesVencimiento) {
		this.mesesVencimiento = mesesVencimiento;
	}



	public ElementoAlquiler getReferencia() {
		return referencia;
	}



	public void setReferencia(ElementoAlquiler referencia) {
		this.referencia = referencia;
	}



	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	@Override
	public int getValor() {
		int suma=0;
		if(this.getAntiguedad() < mesesVencimiento) {
			suma = referencia.getValor();
		}else {
			suma = (int) (referencia.getValor()*this.descuento);
		}
		return suma;
	}
	

	@Override
	public int getAntiguedad() {
		return referencia.getAntiguedad();
	}

	public boolean estaVigente() {
		return referencia.getAntiguedad() < mesesVencimiento;
	}


	@Override
	public ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(this.estaVigente()) {
			aux.addAll(referencia.buscar(cond, orden));
		}
		return aux;
	}

}
