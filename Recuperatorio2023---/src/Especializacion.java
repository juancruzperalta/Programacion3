import java.util.ArrayList;

public class Especializacion extends CursoGenerico {
	private ArrayList<CursoGenerico> cursos;
	private double descuento;
	private static double maximoDescuento=0.5;
	private Condicion cond;
	
	

	public Especializacion(String nombre, double descuento, Condicion cond) {
		super(nombre);
		this.descuento = descuento;
		this.cond = cond;
		cursos = new ArrayList<>();
	}
	
	public void addElemento(CursoGenerico curso) {
		if(cond.cumple(curso)) {
			cursos.add(curso);
		}
	}
	public int totalPrecioCursos() {
		int suma=0;
		for(CursoGenerico cc: cursos) {
			suma += cc.getPrecio();
		}
		return suma;
	}
	
	@Override
	public int getPrecio() {
		int suma = 0;
		int descuento = (int) (this.descuento*this.cantCursos());
		if(descuento >= Especializacion.maximoDescuento) {
			descuento = (int) Especializacion.maximoDescuento;
		}
		return suma = suma*descuento;
	}

	@Override
	public ArrayList<String> getDocentes() {
		ArrayList<String> res = new ArrayList<>();
		for(CursoGenerico cc: cursos) {
			ArrayList<String> aux = cc.getDocentes();
			for(String au: aux) {
				if(!res.contains(au)) {
					res.addAll(aux);
				}
			}
		}
		return res;
	}

	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> res = new ArrayList<>();
		for(CursoGenerico cc: cursos) {
			ArrayList<String> aux = cc.palabrasClave();
			for(String au: aux) {
				if(!res.contains(au)) {
					res.addAll(aux);
				}
			}
		}
		return res;
	}

	@Override
	public int getCantHoras() {
		int suma=0;
		for(CursoGenerico cc: cursos) {
			suma += cc.getCantHoras();
		}
		return suma;
	}

	@Override
	public int cantCursos() {
		int suma=0;
		for(CursoGenerico cc: cursos) {
			suma += cc.cantCursos();
		}
		return suma;
	}

	@Override
	public Curso cursoMasCaro() {
		Curso cursoCaro = null;
		int valor=0;
		for(CursoGenerico cc: cursos) {
			Curso cursoMasCarito = cc.cursoMasCaro();
			int valorCaro= cursoMasCarito.getPrecio();
			if(valorCaro > valor) {
				valor = valorCaro;
				cursoCaro = cursoMasCarito;
			}
		
		}
		return cursoCaro;
	}
	
	public ArrayList<Curso> buscar(Condicion cond){
		ArrayList<Curso> aux =new ArrayList<>();
		for(CursoGenerico cc: cursos) {
			aux.addAll(cc.buscar(cond));
		}
		return aux;
	}

}
