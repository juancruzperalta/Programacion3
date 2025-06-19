package tp4ejerc1;

public class Timbre {
	private boolean sonando;

	public Timbre() {
		sonando = false;
	}
	
	public boolean isSonando() {
		return sonando;
	}
	public void hacersonar(String zona) {
		System.out.println("PIPIPIPI"+ zona);
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	
}
