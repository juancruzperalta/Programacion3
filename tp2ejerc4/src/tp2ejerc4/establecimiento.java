package tp2ejerc4;

import java.util.ArrayList;

public class establecimiento {
	ArrayList<turnos> ts;
	ArrayList<canchas> ch;

	
	
	public establecimiento() {
		super();
		ts = new ArrayList<turnos>();
		ch = new ArrayList<canchas>();
	}
	public void addTurnos(turnos t) {
		ts.add(t);
	}
	public void addCanchas(canchas c) {
		ch.add(c);
	}

	
}
//	Un establecimiento deportivo quiere un sistema que le permita organizar los turnos de
//	las canchas de fútbol y de paddle. El establecimiento posee dos canchas de fútbol 5, y 4
//	de paddle.
//El establecimiento tiene un registro de socios
