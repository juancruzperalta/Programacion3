package tp3ejerc1;

import java.util.ArrayList;

public class consultora {
	private ArrayList<encuesta> encs;
	private String pregunta;
	private int encuestasEmpleado;
	public consultora(String pregunta, int encuestasEmpleado) {
		super();
		this.pregunta = pregunta;
		this.encuestasEmpleado = encuestasEmpleado;
		encs = new ArrayList<encuesta>();
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public int getEncuestasEmpleado() {
		return encuestasEmpleado;
	}
	public void setEncuestasEmpleado(int encuestasEmpleado) {
		this.encuestasEmpleado = encuestasEmpleado;
	}
	
}
//	
//	Una empresa consultora desea desarrollar un sistema el cual le permita informatizar su
//	mecanismo de encuestas. La compañía se encarga de realizar encuestas para empresas
//	de terceros o para el gobierno.La compañía guarda
//	todas las encuestas realizadas.  con lo cual la empresa desea conocer el número de encuestas que realizó
//	cada empleado.
