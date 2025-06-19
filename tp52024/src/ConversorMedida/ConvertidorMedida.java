package ConversorMedida;

public class ConvertidorMedida {

	public static double centimetroAPulgada = 2.54;
	public static double libraAKilogramo = 0.453592;
	public static double galonALitro = 3.7854;
	
	public static double centimetrosAPulgada(double centi) {
		return centi/centimetroAPulgada;
	}
	public static double pulgadaACentimetros(double pulg) {
		return pulg*centimetroAPulgada;
	}
	public static double libraAKilogramo(double libra) {
		return libra/libraAKilogramo;
	}
	public static double kilogramoALibra(double kilo) {
		return kilo*libraAKilogramo;
	}
	public static double galonALitro(double galon) {
		return galon*galonALitro;
	}
	public static double litroAGalon(double litro) {
		return litro/galonALitro;
	}
	
    public static void main(String[] args) {
    	System.out.println(ConvertidorMedida.centimetrosAPulgada(100));
    	System.out.println(ConvertidorMedida.pulgadaACentimetros(1));
    	System.out.println(ConvertidorMedida.galonALitro(10));
    	System.out.println(ConvertidorMedida.litroAGalon(354));
    	System.out.println(ConvertidorMedida.libraAKilogramo(12));
    	System.out.println(ConvertidorMedida.kilogramoALibra(5));
    }
}
