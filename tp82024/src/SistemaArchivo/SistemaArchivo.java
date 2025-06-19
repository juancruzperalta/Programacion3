package SistemaArchivo;

public class SistemaArchivo {
	public static void main(String[]args) {
		
		Directorio tudai = new Directorio("Tudai", 2021);
		Directorio anio1 = new Directorio("Tudai", 2022);
		Directorio anio2 = new Directorio("Tudai", 2023);
		Archivo parcialito = new Archivo("parcialito", 2022, 2023);
		Archivo parcial = new Archivo("parcial", 2022, 2023);

		anio1.addElemento(parcialito);
		anio2.addElemento(parcial);
		tudai.addElemento(anio1);
		tudai.addElemento(anio2);
		
		
		Comprimido comp = new Comprimido("Comprimido", 2022, 20);
		
		comp.addElemento(new Archivo("Playa", 2022, 2022));
		comp.addElemento( new Archivo("Plaza", 2022, 2022));
		tudai.addElemento(comp);
		
		
		System.out.println(tudai);
    }
}
