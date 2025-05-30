package ejerc2Pract6;

public class Objeto implements Comparable<Objeto> {
	double peso;
	double valor;

	public Objeto(double peso, double valor) {
		super();
		this.peso = peso;
		this.valor = valor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public String toString() {
		return "Valor "+ this.valor + " | " + "Peso " + this.peso;
	}
	@Override
	public int compareTo(Objeto otro) {
		// Orden descendente por valor/peso
		double thisRatio = (double) this.valor / this.peso;
		double otherRatio = (double) otro.valor / otro.peso;

		return Double.compare(otherRatio, thisRatio); // mayor primero
	}
}