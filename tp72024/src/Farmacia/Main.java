package Farmacia;

import java.util.ArrayList;

import Farmacia.Condicion.CondicionAND;
import Farmacia.Condicion.CondicionNOT;
import Farmacia.Condicion.buscarPorLaboratorio;
import Farmacia.Condicion.buscarPorNombre;
import Farmacia.Condicion.buscarPorPrecio;

public class Main {

	public static void main(String[] args) {
		Farmacia laPrida = new Farmacia("LaPrida");
		Medicamento mm = new Medicamento("Aspirina", "Bayer", 2000);
		Medicamento mm2 = new Medicamento("Tafirol", "Bayer", 4000);
		Medicamento mm3 = new Medicamento("Paracetamol", "Bayer", 2000);
		Medicamento mm4 = new Medicamento("Aspirina", "Lenovo", 1000);
		Medicamento mm5 = new Medicamento("Tafirol", "Lenovo", 10000);
		
		laPrida.addMedicamento(mm);
		laPrida.addMedicamento(mm2);
		laPrida.addMedicamento(mm3);
		laPrida.addMedicamento(mm4);
		laPrida.addMedicamento(mm5);
		
		ArrayList<Medicamento> filtrarPorLab = laPrida.buscarMed(
				new buscarPorLaboratorio("Bayer"));
		System.out.println("Medicamentos son de laboratorio" + "\n" + filtrarPorLab);

		System.out.println("-----------------------------------------------------");

		ArrayList<Medicamento> filtrarPorPrecio = laPrida.buscarMed(
				new buscarPorPrecio(2000));

		System.out.println("Medicamentos son del precio menor" + "\n" + filtrarPorPrecio);


		System.out.println("-----------------------------------------------------");
		ArrayList<Medicamento> filtrarPorPrecioMayor = laPrida.buscarMed(
				new CondicionNOT(
						new buscarPorPrecio(2000)));
		System.out.println("Medicamentos son del precio mayor" + "\n" + filtrarPorPrecioMayor);
		System.out.println("-----------------------------------------------------");
		ArrayList<Medicamento> filtrarPorLabYNombre = laPrida.buscarMed(
				new CondicionAND(
						new buscarPorLaboratorio("Bayer"),
						new buscarPorNombre("Aspirina")
						));
		System.out.println("Medicamentos son de bayer y aspirina" + "\n" + filtrarPorLabYNombre);
	}

}
