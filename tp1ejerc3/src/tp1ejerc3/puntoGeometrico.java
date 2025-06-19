package tp1ejerc3;

public class puntoGeometrico {
	private int x;
	private int y;
	
	public puntoGeometrico() {
		x=0;
		y=0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public void incrementarValor() {
		for(int i=0; i<10; i++) {
			x++;
			y++;
		}
	}
	public void distanciaEuclídea() {
		int distancia=0;
		int x2=0;
		int y2=0;
		distancia=(x-x2)*(x-x2)+(y-y2)*(y-y2);
		Math.sqrt(distancia);
	}
}
