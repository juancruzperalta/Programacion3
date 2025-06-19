package Vivero;

import java.util.ArrayList;

import Vivero.Condiciones.CondicionAND;
import Vivero.Condiciones.CondicionNOT;
import Vivero.Condiciones.filtrarPorClasificacion;
import Vivero.Condiciones.filtrarPorNombre;
import Vivero.Condiciones.filtrarPorPalabraVulgar;
import Vivero.Condiciones.filtrarPorRequerimientoAGUA;
import Vivero.Condiciones.filtrarPorRequerimientoSOL;

public class Main {

	public static void main(String[] args) {
		Planta pp = new Planta("Epipremnum aureum", "Epipremnum", "Aracaea", "Monocotyledoneae", 3, 4);
		Planta pp2 = new Planta("Rosa ", "Planta2", "Aracaea", "Roja", 5, 4);
		Planta pp3 = new Planta("Cactus", "Epipremnum", "Desierto", "Sin agua", 8, 1);
		Planta pp4 = new Planta("Jazmin", "Crassula", "Aracaea", "Monocotyledoneae", 3, 7);
		Planta pp5 = new Planta("Zafiro", "Epipremnum", "Aracaea", "Monocotyledoneae", 1, 1);

		pp.addNombresVulgares("potus");
		pp3.addNombresVulgares("potus");
		pp.addNombresVulgares("pothos");
		pp.addNombresVulgares("potos");
		Vivero vv = new Vivero();
		vv.addPlanta(pp5);
		vv.addPlanta(pp4);
		vv.addPlanta(pp3);
		vv.addPlanta(pp2);
		vv.addPlanta(pp);
		
		/*
		System.out.println("Plantas que incluyan su nombre");
		ArrayList<Planta> filtrarPorNombre = vv.buscarPlanta(
				new filtrarPorNombre("Epipremnum")
				);
		System.out.println(filtrarPorNombre);
		-------------------------------------------------------------------------
		System.out.println("Plantas por nombre Vulgar");
		ArrayList<Planta> filtrarPorNombre = vv.buscarPlanta(
				new filtrarPorPalabraVulgar("potus")
				);
		System.out.println(filtrarPorNombre);
		-------------------------------------------------------------------------
		System.out.println("Plantas por Clasificacion");
		ArrayList<Planta> filtrarPorNombre = vv.buscarPlanta(
				new filtrarPorClasificacion("Crassula")
				);
		System.out.println(filtrarPorNombre);
		-------------------------------------------------------------------------
		System.out.println("Plantas por Requerimiento SOL");
		ArrayList<Planta> filtrarPorNombre = vv.buscarPlanta(
				new CondicionAND(
						new CondicionNOT(
						new filtrarPorRequerimientoSOL(2)),
						new filtrarPorRequerimientoAGUA(2)
						)
				); //Esta es la de, que sea superior a un numero de sol, y inferior a un numero de agua
		System.out.println(filtrarPorNombre);
		 */
	}

}
