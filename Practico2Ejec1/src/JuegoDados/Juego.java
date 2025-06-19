package JuegoDados;

public class Juego {
	Cubilete cc;
	Jugador j1;
	Jugador j2;
	int minimo;
	int rondas;
	public Juego() {
		this(6,2);
	}
	public Juego(Jugador j1, Jugador j2, int minimo, int rondas) {
		this.j1 = j1;
		this.j2 = j2;
		this.minimo = minimo;
		this.rondas = rondas;
	}
    public Juego(int caras,int cantDados) {
    	cc = new Cubilete(caras,cantDados);
        j1 = new Jugador("Jugador 1");
    	j2 = new Jugador("Jugador 2");
    	rondas = 10;
    	minimo = 7;
    }
	
	public Jugador jugar() {
		if(j1.getPuntos() > j2.getPuntos() && j1.getPuntos() > minimo) {
			j1.acumularPuntosJugador();
		}else {
			if(j2.getPuntos() > j1.getPuntos() && j2.getPuntos() > minimo) {
				j2.acumularPuntosJugador();
			}
		}
		return null;
	}
	
	
	public Jugador getJ1() {
		return j1;
	}
	public void setJ1(Jugador j1) {
		this.j1 = j1;
	}
	public Jugador getJ2() {
		return j2;
	}
	public void setJ2(Jugador j2) {
		this.j2 = j2;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public int getRondas() {
		return rondas;
	}
	public void setRondas(int rondas) {
		this.rondas = rondas;
	}
	

	
	public static void main(String[] args) {
		Juego jj = new Juego(6,2);
		Jugador uno = jj.getJ1();
		Jugador dos = jj.getJ2();
		System.out.println(uno.getNombre() + "-" + uno.getPuntos());

		System.out.println(dos.getNombre() + "-" + dos.getPuntos());
		

		Jugador ganador = jj.jugar();
		if (ganador!=null) {
		   System.out.println("Gano " + ganador.getNombre() 
		                       + " - con:" + ganador.getPuntos());
		   
		} else {
			System.out.println("Empate");
		}
		System.out.println(uno.getNombre() + "-" + uno.getPuntos());

		System.out.println(dos.getNombre() + "-" + dos.getPuntos());
	}
}
