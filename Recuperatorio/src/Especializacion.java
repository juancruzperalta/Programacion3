import java.util.ArrayList;

public class Especializacion extends OfertaAcademica {
	private double descuento;
	private static double maximoDescuento = 0.5;
	private ArrayList<OfertaAcademica> oferta;
	private Condicion cond;
	public Especializacion(String nombre, double descuento, Condicion cond) {
		super(nombre);
		this.descuento = descuento;
		oferta = new ArrayList<>();
		this.cond = cond;
	}

	public Condicion getCond() {
		return cond;
	}

	public void setCond(Condicion cond) {
		this.cond = cond;
	}

	public double getPrecioDeterminado() {
		int suma = this.getPrecio();
		if(this.getPrecio() > this.maximoDescuento) {
			descuento = this.maximoDescuento;
		}
		return suma*descuento;
	}
	
	@Override
	public int getPrecio() {
		int suma=0;
		for(OfertaAcademica of: oferta) {
			suma += of.getPrecio();
		}
		return suma;
	}
	
	public int cantidadCursos() {
		int suma=0;
		for(OfertaAcademica of: oferta) {
			suma += of.cantidadCursos();
		}
		return suma;
	}

	@Override
	public ArrayList<String> getDocentes() {
		ArrayList<String> aux = new ArrayList<>();
		for(OfertaAcademica of: oferta) {
			for(String au: aux) {
				if(!of.getDocentes().contains(au)) {
					aux.addAll(of.getDocentes());
				}
			}
		}
		return aux;
	}

	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> aux = new ArrayList<>();
		for(OfertaAcademica of: oferta) {
			for(String au: aux) {
				if(!of.palabrasClave().contains(au)) {
					aux.addAll(of.palabrasClave());
				}
			}
		}
		return aux;
	}

	@Override
	public int horasCatedra() {
		int suma=0;
		for(OfertaAcademica of: oferta) {
			suma+=of.horasCatedra();
		}
		return suma;
	}
	
	public int cursoMasCaro() {
		int suma=0;
		for(OfertaAcademica of: oferta) {
			int mayor = of.getPrecio();
			if(suma > mayor) {
				suma = of.getPrecio();
			}
		}
		return suma;
	}

	@Override
	public ArrayList<Curso> buscar(Condicion cond) {
		ArrayList<Curso> hijos = new ArrayList<>();
		for(OfertaAcademica of: oferta) {
			hijos.addAll(of.buscar(cond));
		}
		return hijos;
	}

	@Override
	public int cantDocentes() {
		int suma=0;
		for(OfertaAcademica hijo: oferta) {
			suma += hijo.cantDocentes();
		}
		return suma;
	}

}
