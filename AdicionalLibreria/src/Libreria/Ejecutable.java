package Libreria;

public class Ejecutable {

	public static void main(String[] args) {
		Libreria li = new Libreria("Peco's Libreria");
		Cliente c1 = new Cliente("Yosoy1", "1", 45398154, 555, 20);
		Cliente c2 = new Cliente("YoSoy2", "2", 45398154, 555, 10);
		Cliente c3 = new Cliente("Yosoy3", "3", 45398154, 555, 100);

		Producto p1 = new Producto("Libro mercadona", "Juan", 200, 10, "Un libro bonito y bello");
		p1.addGeneros("Accion");
		c1.addAutorFav("Juan");
		c1.addGeneroFav("Accion");
		c2.addAutorFav("Juan");
		c2.addGeneroFav("Accion");
		li.addCliente(c1);
		li.addCliente(c2);
		li.addCliente(c3);
		li.addProducto(p1);
		c1.addComprasProducto(p1);
		c2.addComprasProducto(p1);
		c3.addComprasProducto(p1);
		c1.meGustaAutorYGenero(p1);
		c2.meGustaEsteLibroAutor(p1);
		c2.meGustaAutorYGenero(p1);
		
		
		System.out.println(li.gustaLibro(p1));
	}

}
