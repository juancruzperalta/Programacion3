package SitioWebNoticias;

public class Main {

	public static void main(String[] args) {
		Categoria general = new Categoria("General", "Juan");
		Categoria Espectaculos = new Categoria("Espetaculos", "Juan");
		Categoria link = new Categoria("Link","Yo");
		general.addCategoria(Espectaculos);
		Espectaculos.addCategoria(link);
		
		Noticia nn = new Noticia("Noticia", "1", "J", "Juan", link);
		
		System.out.println(general.listado());
	}

}
