package ElementosGeometricos;

public class Rectangulo2 {
		/* a1---------------|
		 * |				|
		 * |				|
		 * |				|
		 * |----------------|
		 */
	PuntoGeometrico a1;
	double base;
	double altura;
	
	
	public Rectangulo2(PuntoGeometrico a1, double base, double altura) {
		this.a1 = a1;
		this.base = base;
		this.altura = altura;
	}
	public PuntoGeometrico getA1() {
		return a1;
	}
	public void setA1(PuntoGeometrico a1) {
		this.a1 = a1;
	}
	
	public void DesplazarRect(int valor) {
		a1.desplazar(valor);
	}
	public void DesplazarAmbos(int valorX, int valorY) {
		a1.desplazarAmbos(valorX, valorY);
	}
	
	public double areaRect() {
		return this.baseRect()*this.alturaRect();
	}
	public double baseRect() {
		return this.base;
	}
	public double alturaRect() {
		return this.altura;
	}
	
	public int compararRectangulos(Rectangulo otroRect) {
		if(this.areaRect() > otroRect.areaRect()) {
			return 1;
		}else {
			if(otroRect.areaRect() > this.areaRect()) {
				return -1;
			}
			return 0;
		}
	}
	
	public boolean esCuadrado() {
		return (base == altura);
	}
	
	public double largoLadoSuperior() {
		if(this.baseRect() < this.alturaRect()){
			return this.alturaRect();
		}
		return this.baseRect();
	}

	public boolean estaAcostado() {
		return (this.baseRect() > this.alturaRect());
	}
	public boolean estaParado() {
		return (this.alturaRect() > this.baseRect());
	}
}
