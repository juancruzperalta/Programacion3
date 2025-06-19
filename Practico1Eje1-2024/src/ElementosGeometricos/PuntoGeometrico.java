package ElementosGeometricos;

public class PuntoGeometrico {
	int x;
	int y;
	
	
	public PuntoGeometrico() {
		this.x=0;
		this.y=0;
	}
	public PuntoGeometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void desplazar(int valor) {
		this.x = x + valor;
		this.y = y + valor;
	}
	public void desplazarAmbos(int valorX, int valorY) {
		this.x = x+valorX;
		this.y= y+valorY;
	}
	
	public void desplazarX(int valorX) {
		this.x = x + valorX;
	}
	public void desplazarY(int valorY) {
		this.y = y+valorY;
	}
	
	public double distanciaEuclidea(PuntoGeometrico otroPunto) {
		int DisX = this.getX() - otroPunto.getX();	
		int DisY = this.getY() - otroPunto.getY();
		
		double DifXCuadrada = Math.pow(DisX,2);
		double DifYCuadrada = Math.pow(DisY,2);
		double distancia = DifXCuadrada + DifYCuadrada;
		return Math.sqrt(distancia);
	}
	
	
}
