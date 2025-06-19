
public class CondicionANd extends Condicion {
	private Condicion c1,c2;
	
	
	public CondicionANd(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(CursoGenerico curso) {
		return c1.cumple(curso) && c2.cumple(curso);
	}

}
