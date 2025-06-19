package SistemaAlquiler;

import java.util.ArrayList;

public abstract class Item {

	protected ArrayList<Pelicula> peliculas;
	protected ArrayList<Vehiculo> vehiculos;
	
	public Item() {
		peliculas = new ArrayList<Pelicula>();
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void addPelicula(Pelicula peli) {
		if(this.podemosUsarte()) {//si la podemos usar por que tenga mas de 1
			peliculas.add(peli);
		}
	}
	
	public void addVehiculo(Vehiculo vehi) {
		if(this.podemosUsarte()) {
			vehiculos.add(vehi);
		}
	}
	
	public abstract boolean podemosUsarte();
}
