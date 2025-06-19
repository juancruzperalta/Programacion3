package tp4ejerc1;
import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
        ArrayList<sensor> sensores = new ArrayList<>();
        sensor sensor1 = new sensor("Garage");
        sensor sensor2 = new sensor("Pieza");
        sensor sensor3 = new sensor("Baño");
        sensor sensor4 = new sensor("Living");
        sensor sensor5 = new sensor("Comedor");

        sensor2.setDetectado(true);
        sensor3.setDetectado(false);

        sensores.add(sensor1);
        sensores.add(sensor2);
        sensores.add(sensor3);
        sensores.add(sensor4);
        sensores.add(sensor5);

        alarma Alarma = new alarma(sensores);

        if (Alarma.comprobarAlarma()) {
        	Alarma.hacemosSonar();;
        }
	}

}
