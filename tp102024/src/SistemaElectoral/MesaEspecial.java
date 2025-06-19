package SistemaElectoral;

public class MesaEspecial extends Mesa {
	private String barrio;
	public MesaEspecial(String establecimiento, String barrio) {
		super(establecimiento, barrio);
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	

}
