package ProcesadorTextoPlugins;

public class ContadorPalabrasPlugin implements Plugin{
	private String texto;
	private int resultado;
	
	public ContadorPalabrasPlugin(String texto) {
		this.texto = texto;
	}
	
	
	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}


	public void ejecutarPlugin(Plugin plugin) {
		this.ejecutarPlugin(this);
	}

}
