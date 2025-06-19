package SistemaDeEncuestas;

public class Encuesta {
	Empleado[] encs;
	Respuesta[] resp;
	int cantEncuestasLlenas;
	int cantRespuestasLlenas;
	
	public Encuesta() {
		encs = new Empleado[10];
		resp = new Respuesta[10];
		cantEncuestasLlenas = 0;
		cantRespuestasLlenas=0;
	}
	
	public void addRespuesta(Respuesta re) {
		if(re != null && cantRespuestasLlenas < resp.length) {
			resp[cantRespuestasLlenas] = re;
			cantRespuestasLlenas++;
		}
	}	
	public Empleado getEncs() {
		for(int i=0; i<cantEncuestasLlenas; i++) {
		}
		return null;
	}

	public Respuesta[] getResp() {
		return resp;
	}

	public void addEncuestasE(Empleado ec) {
		if(ec != null && cantEncuestasLlenas < encs.length) {
			encs[cantEncuestasLlenas] = ec;
			cantEncuestasLlenas++;
		}
	}

}
