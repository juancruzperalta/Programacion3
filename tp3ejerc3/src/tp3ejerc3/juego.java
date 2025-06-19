package tp3ejerc3;

import java.util.ArrayList;

public class juego {
	private ArrayList<personaje> pers;

	public juego() {
		super();
		pers = new ArrayList<personaje>();
	}
	public void addPersonaje(personaje p) {
		pers.add(p);
	}
	public int getDatosEnfrentamiento(personaje p) {
			return p.getFuerza();
	}
	public int getEmpate(personaje p) {
		return p.getVelocidad();
	}
	
}
//Se desea modelar un juego el cual se compone de héroes y villanos. 
//El mecanismo de juego se basa en enfrentar un personaje con otro y decidir cuál de
//ellos es el ganador. Para decidir quién es el ganador se utiliza el valor de una de las
//características, por ejemplo fuerza, velocidad. En caso de empate se decide por el valor
//de otra característica dada.