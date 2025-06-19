package CandyCrushV2;

import java.util.ArrayList;

import CandyCrushV2.Condiciones.CondicionAND;
import CandyCrushV2.Condiciones.CondicionDestruccion;
import CandyCrushV2.Condiciones.CondicionFortalezaMayor;
import CandyCrushV2.Condiciones.CondicionNOT;

public class Main {

	public static void main(String[] args) {
		Tablero tt = new Tablero(300);
		
		Ficha ff = new Ficha("Caramelo", 1, 2, 3);
		Ficha ff2= new Ficha("Albondiga", 3, 5, 3);
		Ficha ff3 = new Ficha("Philips", 1, 0, 3);
		Ficha ff4 = new Ficha("Kohinoor", 3, 2, 0);
		FichaEspecial ff5 = new FichaEspecial("Mora", 10, 20, 30);
		FichaEspecial ff6 = new FichaEspecial("Teo", 5, 10, 15);

		FichaEspecial fe = new FichaEspecial("Especial", 10, 20, 30);
		
		tt.addFicha(ff);
		tt.addFicha(ff2);
		tt.addFicha(ff3);
		tt.addFicha(ff4);
		tt.addFicha(ff5);
		tt.addFicha(ff6);
		tt.addFicha(fe);
		
		ArrayList<Ficha> busquedaFiltro = tt.buscar(
				new CondicionNOT(
						new CondicionAND(
								new CondicionDestruccion(2),
								new CondicionFortalezaMayor(2)
								)));
		
		System.out.println(busquedaFiltro);

	}

}
