
public class CondicionDosDocentes extends Condicion {
	private int limite;
	
	
	public CondicionDosDocentes(int limite) {
		super();
		this.limite = limite;
	}


	@Override
	public boolean cumple(CursoGenerico curso) {
		return curso.getDocentes().size()<limite;
	}

}
