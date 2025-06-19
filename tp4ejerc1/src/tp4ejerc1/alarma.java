package tp4ejerc1;

import java.util.ArrayList;

public class alarma {
    ArrayList<sensor> sensores = new ArrayList<sensor>();
    Timbre timbre = new Timbre();
	public alarma() {
		super();
	}
	public void addSensor(sensor s) {
		sensores.add(s);
	}

    public alarma(ArrayList sensores) {
        this.sensores = sensores;
    }

	public boolean comprobarAlarma() {
		for(int i=0; i<sensores.size(); i++) {
			if(sensores.get(i).isDetectado()) {
				return true;
			}
		}
		return false;
	}
	public String zona() {
		for(int i=0; i<sensores.size(); i++) {
			if(sensores.get(i).isDetectado()) {
				return sensores.get(i).getZona();
			}
		}
		return "nulo";
	}
	public void hacemosSonar() {
		if(comprobarAlarma()==true) {
			this.timbre.hacersonar(zona());
		}
	}
	
}



//1 - Alarma
//Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
//alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
//se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
//la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
//sonora.
//Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
//encienda una luz cuando alguno de los indicadores está activado.



//Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
//método encender()