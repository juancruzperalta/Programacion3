package ElementosGeometricos;

public class Rectangulo {
		/* a1---------------a2
		 * |				|
		 * |				|
		 * |				|
		 * a3---------------a4
		 */
	PuntoGeometrico a1;
	PuntoGeometrico a2;
	PuntoGeometrico a3;
	PuntoGeometrico a4;
	
	
	public Rectangulo(PuntoGeometrico a1, PuntoGeometrico a2, PuntoGeometrico a3, PuntoGeometrico a4) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}
	public PuntoGeometrico getA1() {
		return a1;
	}
	public void setA1(PuntoGeometrico a1) {
		this.a1 = a1;
	}
	public PuntoGeometrico getA2() {
		return a2;
	}
	public void setA2(PuntoGeometrico a2) {
		this.a2 = a2;
	}
	public PuntoGeometrico getA3() {
		return a3;
	}
	public void setA3(PuntoGeometrico a3) {
		this.a3 = a3;
	}
	public PuntoGeometrico getA4() {
		return a4;
	}
	public void setA4(PuntoGeometrico a4) {
		this.a4 = a4;
	}
	
	public void DesplazarRect(int valor) {
		a1.desplazar(valor);
		a2.desplazar(valor);
		a3.desplazar(valor);
		a4.desplazar(valor);
	}
	public void DesplazarAmbos(int valorX, int valorY) {
		a1.desplazarAmbos(valorX, valorY);
		a2.desplazarAmbos(valorX, valorY);
		a3.desplazarAmbos(valorX, valorY);
		a4.desplazarAmbos(valorX, valorY);
	}
	
	public double areaRect() {
		return this.baseRect()*this.alturaRect();
	}
	public double baseRect() {
		return a1.distanciaEuclidea(a2);
	}
	public double alturaRect() {
		return a1.distanciaEuclidea(a3);
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
	
	/* a1---------------a2  suponiendo que es mas chico
	 * |				|	a1----a2				
	 * |				|	-	  -		
	 * |				|	-	  -	
	 * a3---------------a4  -     -
	 * 						a3----a4	no me quedo lindo jaja		
	 */
	public boolean esCuadrado() {
		if(a1.distanciaEuclidea(a2) == a2.distanciaEuclidea(a4) && 
		  a1.distanciaEuclidea(a3) == a3.distanciaEuclidea(a4)) {
			return true;
		}
		return false;
	}
	
	public double largoLadoSuperior() {
		if(this.baseRect() < this.alturaRect()){
			return this.alturaRect();
		}
		return this.baseRect();
	}

	/*
	 * Si la base es menor a la altura, queire decir
	 * que luego si devuelvo la altura me está diciendo
	 * que la altura es lo más largo
	 * y si devuelvo la altura es menor que la base
	 * queire decir que lo más largo es la base 
	 */
	public boolean estaAcostado() {
		return (this.baseRect() > this.alturaRect());
	}
	public boolean estaParado() {
		return (this.alturaRect() > this.baseRect());
	}
}
