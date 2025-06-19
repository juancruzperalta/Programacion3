package AlarmaSensorial;

public class Timbre{

	String timbre;

	public String getTimbre() {
		return timbre;
	}

	public void setTimbre(String timbre) {
		this.timbre = timbre;
	}
	
	public String hacerSonar(String string) {
		return "PIPIPIPIPI "+ string;
	}
}	
