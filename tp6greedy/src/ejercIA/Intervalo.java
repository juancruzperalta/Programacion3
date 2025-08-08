package ejercIA;

import java.util.Comparator;

public class Intervalo implements Comparable<Intervalo>{
	int A;
	int B;
	public Intervalo(int a, int b) {
		super();
		A = a;
		B = b;
	}
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	@Override
	public int compareTo(Intervalo o) {
		return Integer.compare(this.getA(), o.getB());

	}
	@Override
	public String toString() {
		return "Intervalo [A=" + A + ", B=" + B + "]";
	}
	
}
