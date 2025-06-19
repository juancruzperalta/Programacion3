package tp3ejerc1;

import java.util.ArrayList;

public class encuesta {
	private ArrayList<respuesta> resp;
	public encuesta(String pregunta) {
		resp = new ArrayList<respuesta>();
	}
	public void addPreguntas(respuesta p) {
		resp.add(p);
	}
	public void getRespuestas() {
		
	}
	
}
//}Una encuesta se compone de un conjunto de preguntas,
//una persona encuestada y el empleado que realizo la encuesta., Para evitar falsificación de datos, en la encuesta figura el número de
//documento de la persona. Una misma persona no puede llenar dos veces la misma
//encuesta, pero si una encuesta diferente.
