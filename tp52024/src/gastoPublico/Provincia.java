package gastoPublico;

public class Provincia {
		Ciudad[] ciudades;
		int contadorCiudad;
		String nombre;

		public Provincia(String nombre) {
			ciudades = new Ciudad[10];
			contadorCiudad = 0;
			this.nombre = nombre;
		}
		public void addCiudad(Ciudad cds) {
			if(cds != null && contadorCiudad 
				< ciudades.length) {
					ciudades[contadorCiudad] = cds;
					contadorCiudad++;
			}
		}
		
		public boolean estaEnDeficit() {
			for(int i=0; i<ciudades.length; i++) {
				if(ciudades[i].getGastosMantenimiento() >
				ciudades[i].getMontoRecaudadoCiudad()) {
					return true;
				}
			}
			return false;
		}
		public int getCantidadCiudades() {
			return contadorCiudad;
		}
		public int cantidadCiudadesEnDeficit() {
			int cantidad=0;
			for(int i=0; i<contadorCiudad;i++) {
				if(ciudades[i].getGastosMantenimiento() >
				ciudades[i].getMontoRecaudadoCiudad()) {
					cantidad++;
				}
			}
			return cantidad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

}
