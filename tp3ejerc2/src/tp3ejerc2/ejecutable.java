package tp3ejerc2;

public class ejecutable {
	public static void main(String[] args) {
		fabrica f1 = new fabrica(0.80);
		productos p1 = new productos("sillas",21,23,"caoba","cedro");
		productos p2 = new productos("mesas",2,421,"caca","caca");
		productos p3 = new productos("bancos",22,12,"casa","sda");
		f1.addProducto(p1);
		f1.addProducto(p2);
		f1.addProducto(p3);
		
		
		System.out.println(p3.getColor());
		System.out.println("el costo total de...." + f1.getCoste(p3));
		System.out.println("el costo es"+ f1.getCoste(p2));

	}	

}
