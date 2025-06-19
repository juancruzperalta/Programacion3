package electrodomestico;

public class Ejecutable {
	public static void main(String[]args) {
		
		Electrodomestico ec2 = new Electrodomestico(25);
		System.out.println("Consume ahora" + ec2.getConsumoE());
		
		Electrodomestico ec3 = new Electrodomestico(500, "Azul", 85,35);
		System.out.println("Precio base" + ec3.getPrecioBase() + "\nColor" + ec3.getColor()
							+ "\npeso" + ec3.getPeso() + "\nconsumo" + ec3.getConsumoE());		

	}
}
