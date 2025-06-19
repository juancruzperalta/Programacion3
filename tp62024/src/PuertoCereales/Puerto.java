package PuertoCereales;

import java.util.ArrayList;

public class Puerto {
	private ColaEspera barcos;
	private ColaEspera camiones;
	private String nombrePuerto;
	public Puerto(String nombrePuerto) {
		barcos = new ColaEspera();
		camiones = new ColaEspera();
		this.nombrePuerto = nombrePuerto;
	}
	public String getNombrePuerto() {
		return nombrePuerto;
	}
	public void setNombrePuerto(String nombrePuerto) {
		this.nombrePuerto = nombrePuerto;
	}
	public void addBarcos(Barco bb) {
		
	}
	
	
}
//Puerto
//Barcos->Capacidad nombre
//ColaEspera(ordena)->Por capacidad y ordena por fecha carga
//Camiones->Fecha carga, nombre, toneladas que lleva

/*Un puerto debe coordinar las actividades de carga de los barcos con cereal traído por 
camiones desde el campo. Sólo se puede cargar un barco a la vez. Los barcos que esperan ser 
cargados se ubican en una cola de espera que los ordena teniendo en cuenta su capacidad (los 
barcos con mayor capacidad serán atendidos en primer lugar). Sólo se puede descargar un 
camión a la vez. Los camiones que esperan ser descargados se ubican en una cola de espera 
que los ordena teniendo en cuenta la fecha en que fueron cargados (los camiones que fueron 
cargados primero serán atendidos en primer lugar).
*/