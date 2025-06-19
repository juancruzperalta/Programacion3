
public class CondicionHoras extends Condicion {
	private int horas;
	
	
	public CondicionHoras(int horas) {
		super();
		this.horas = horas;
	}


	@Override
	public boolean cumple(CursoGenerico curso) {
		return curso.getCantHoras()<horas;
	}

}
