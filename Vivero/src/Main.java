import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Planta pp = new Planta("Epipremnum aureum", "Epipremnum", 3, 4);
		Planta pp2 = new Planta("Rosa ", "Planta2", 5, 4);
		Planta pp3 = new Planta("Cactus", "Epipremnum",  8, 1);
		Planta pp4 = new Planta("Jazmin", "Crassula",3, 7);
		Planta pp5 = new Planta("Zafiro", "Epipremnum", 1, 1);

		pp.addNombreVulgar("potus");
		pp3.addNombreVulgar("potus");
		pp.addNombreVulgar("pothos");
		pp.addNombreVulgar("potos");
		Vivero vv = new Vivero("Josesito");
		vv.addPlanta(pp5);
		vv.addPlanta(pp4);
		vv.addPlanta(pp3);
		vv.addPlanta(pp2);
		vv.addPlanta(pp);
		
		/*
		System.out.println("Plantas que incluyan su nombre");
		ArrayList<Planta> filtrarPorNombre = vv.buscar(
				new CondicionPalabra("Epipremnum")
				);
		System.out.println(filtrarPorNombre);
		-------------------------------------------------------------------------
		System.out.println("Plantas por nombre Vulgar");
		ArrayList<Planta> filtrarPorNombre = vv.buscar(
				new CondicionNombreVulgar("potus")
				);
		System.out.println(filtrarPorNombre);
		-------------------------------------------------------------------------
		System.out.println("Plantas por Clasificacion");
		ArrayList<Planta> filtrarPorNombre = vv.buscar(
				new CondicionClasificacion("Crassula")
				);
		System.out.println(filtrarPorNombre);
		-------------------------------------------------------------------------
		 */
		System.out.println("Plantas por Requerimiento SOL");
		ArrayList<Planta> filtrarPorNombre = vv.buscar(
				new CondicionAND(
						new CondicionNOT(
						new CondicionReqSol(2)),
						new CondicionReqAgua(2)
						)
				); //Esta es la de, que sea superior a un numero de sol, y inferior a un numero de agua
		System.out.println(filtrarPorNombre);
		/*
		 */
	}

}
