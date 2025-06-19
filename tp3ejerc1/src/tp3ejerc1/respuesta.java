package tp3ejerc1;

public class respuesta {
	private String persona;
	private int dni;
	private String respuestas;
	public respuesta(String persona, int dni, String respuestas) {
		super();
		this.persona = persona;
		this.dni = dni;
		this.respuestas = respuestas;
	}
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}
}
