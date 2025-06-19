package AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
	Timbre timbre = new Timbre();;
	ArrayList<Sensor> sensores = new ArrayList<Sensor>();
	
	public Alarma() {
		
	}
	public Alarma(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
	
	public boolean señalSonora() {
		for(int i=0; i<sensores.size(); i++) {
			if(sensores.get(i).isHayAlguien()) {
				return true;
			}
		}
		return false;
	}
	
	public String zonaManejada() {
		for(int i=0; i<sensores.size(); i++) {
			if(sensores.get(i).isHayAlguien()) {
				return sensores.get(i).getZona();
				}
			}
		return "";
	}
	public void activarAlarma() {
		if(this.señalSonora()) {
			this.timbre.hacerSonar(this.zonaManejada());
		}
	}
	public String verLugarSonado() {
		return this.timbre.hacerSonar(this.zonaManejada());
	}
	
	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public static void main(String[]args) {
		Alarma aa = new Alarma();
		Sensor ss2 = new Sensor("Habitacion Cocina");
		

		aa.sensores.add(ss2);
		ss2.setHayAlguien(true);

		
		System.out.println(aa.señalSonora());
		System.out.println(aa.zonaManejada());
		System.out.println(aa.verLugarSonado());
		
		
	}
}
