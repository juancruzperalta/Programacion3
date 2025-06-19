
public class PresupuestoEspecial extends PresupuestoBasico {
	private String especialidades;
	public PresupuestoEspecial(String nn, int empleadosAfec, int tiempoEstim, String especialidades) {
		super(nn, empleadosAfec, tiempoEstim);
		this.especialidades = especialidades;
	}
	public String getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}



}
