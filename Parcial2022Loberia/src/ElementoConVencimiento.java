import java.util.ArrayList;
import java.util.Comparator;

public class ElementoConVencimiento extends ElementoAlquiler {
	private ElementoAlquiler referencia;
	private double descuento;
	private int MesesAntiguedad;
	
	public ElementoConVencimiento(int codigo, ElementoAlquiler referencia, double descuento, int meses) {
		super(codigo);
		this.referencia = referencia;
		this.descuento= descuento;
		this.MesesAntiguedad = meses;
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


	public int getMesesAntiguedad() {
		return MesesAntiguedad;
	}


	public void setMesesAntiguedad(int mesesAntiguedad) {
		MesesAntiguedad = mesesAntiguedad;
	}


	@Override
	public int getValor() {
		int suma= referencia.getValor();;
		if(this.getAntiguedad() < MesesAntiguedad) {
			return suma;
		}else {
			return (int) (suma*descuento);
		}
	}

	@Override
	public int getAntiguedad() {
		return referencia.getAntiguedad();
	}


	@Override
	public ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden) {
		ArrayList<Elemento> aux =new ArrayList<>();
		aux.addAll(referencia.buscar(cond,orden));
		return aux;
	}

}
