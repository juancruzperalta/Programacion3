package CompaniaEnvios;

import java.util.ArrayList;

public class ComboPostal extends Elemento{
	private ArrayList<Elemento> elem;

	public ComboPostal(String destinatario, String remitente, String direccion, int numTracking) {
		super(destinatario, remitente, direccion, numTracking);
		elem = new ArrayList<>();
	}
	
	public void addEnvioComboPostal(Elemento el) {
		if(el.getDireccion().equals(this.getDireccion())) {
			//¿intento comprobar que sean igua ldestinatario?
			//"Todos los envíos incluidos en un combo postal deben tener la misma 
			//ciudad de destino."
			elem.add(el);
			el.setNumTracking(this.getNumTracking());
			//cuando un elemento se agrega a un combo
			//se le cambia el tracking del elemento poniendo el del combo
		}
	}
	
	public String envioComboPostal() {
		String aux = "";
		for(Elemento el: elem) {
			aux += el.toString();
		}
		return aux;
	}

	@Override
	public double getPeso() {
		double tamanio=0;
		for(Elemento el: elem) {
			tamanio+=el.getPeso();
		}
		return tamanio;
	}
	
	
}
