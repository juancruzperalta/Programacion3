package ejerc2;

public class Objeto  implements Comparable<Objeto>{
	double peso;
	double valor;
	public Objeto(double fraccion, double valorFracc) {
		super();
		this.peso = fraccion;
		this.valor = valorFracc;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
    public double relacion() {
        return (double) valor / peso;
    }
    public int compareTo(Objeto otro) {
        // Orden descendente por valor/peso
        return Double.compare(otro.relacion(), this.relacion());
    }
	@Override
	public String toString() {
		return "Objeto [peso=" + peso + ", valor=" + valor + "]";
	}
    
    
}
