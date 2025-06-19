package FabricaMuebles;

public class Ejecutable {
	public static void main(String[]args) {
		Fabrica fa = new Fabrica();
		Producto po = new Producto(10,300,"Roble","Rojizo",10,"Silla");
		fa.addProducto(po);
		Producto p3 = new Producto(10,600,"Lamina","Verde",35,"Silla");
		fa.addProducto(p3);
		System.out.println(po.getTipoProducto());
		System.out.println(po.getTipoMadera());
		System.out.println(po.getColor());
		System.out.println(po.getVenta());
		System.out.println("------------------------");
		System.out.println(p3.getTipoProducto());
		System.out.println(p3.getTipoMadera());
		System.out.println(p3.getColor());
		System.out.println(p3.getVenta());

		System.out.println("cuantos productos disponibles hay?\t" + fa.productosStock());
	}
}
