package CentroComputo;

public abstract class ColaEspera {
	public abstract boolean sosMayor(ColaEspera t1);
}

//Si no hay computadoras, los procesos esperan en una cola de espera
//que la cola ordena por sus requerimientos de memoria
//Computadoras disponibles(ordena una cola), que prioriza una computadora mas rapida