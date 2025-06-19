package CompaniaEnvios;

public class Main {

	public static void main(String[] args) {
		Paquete pp = new Paquete("Juan Cruz", "Juan Cruz", "Larrea", 200, false, 1);
		ComboPostal cp = new ComboPostal("Juan Cruz", "Juan Cruz", "Larrea", 2);
		
		cp.addEnvioComboPostal(pp);
		
		System.out.println(cp.envioComboPostal());
		System.out.println(cp.getPeso());
	}

}
