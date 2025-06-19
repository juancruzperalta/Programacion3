package busquedaDocumento;

import java.util.ArrayList;

import busquedaDocumento.Condiciones.busquedaPorAutorDado;
import busquedaDocumento.Condiciones.busquedaPorPalabraClave;
import busquedaDocumento.Condiciones.busquedaPorTitulo;
import busquedaDocumento.Condiciones.busquedaPorTituloOFrase;

public class Main {

	public static void main(String[] args) {
		Historiador hd = new Historiador();
		Documento dd =new Documento("Josefa", "JAJAJAJAJA");
		hd.addDocumento(dd);
		dd.addAutor("Ja");
		dd.addPalabraClave("Horizonte");
		Documento dd2 =new Documento("Pato", "Fontanet");
		hd.addDocumento(dd2);
		dd2.addAutor("Pato");
		dd2.addPalabraClave("Callejeros");
		Documento dd3 =new Documento("Baterista", "Pam pam pam");
		hd.addDocumento(dd3);
		dd3.addAutor("Ja");
		dd3.addPalabraClave("Bateria");
		Documento dd4 =new Documento("Pianista", "tintintin");
		hd.addDocumento(dd4);
		dd4.addAutor("Ja");
		dd4.addPalabraClave("pianista");
				
		ArrayList<Documento> filtrarPorTitulo = hd.buscarDocumento(
				new busquedaPorTitulo("Pianista"));
		System.out.println(filtrarPorTitulo);
		
		System.out.println("------------------------------------------------------------------------------------");
		ArrayList<Documento> filtrarContengaAlgoTitulo = hd.buscarDocumento(
				new busquedaPorTituloOFrase("Bate"));
		System.out.println(filtrarContengaAlgoTitulo);
		
		System.out.println("------------------------------------------------------------------------------------");
		ArrayList<Documento> filtrarPorPalabraClave = hd.buscarDocumento(
				new busquedaPorPalabraClave("Callejeros"));
		System.out.println(filtrarPorPalabraClave);
		
		System.out.println("------------------------------------------------------------------------------------");
		ArrayList<Documento> filtrarPorAutorDado = hd.buscarDocumento(
				new busquedaPorAutorDado("Pato"));
		System.out.println(filtrarPorAutorDado);
	}

}
