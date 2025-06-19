
public class PresupuestoEspecial extends PresupuestoBasico {
	private String especialidades;
	public PresupuestoEspecial(String nombre, int dias, int empleados, String especialidades) {
		super(nombre, dias, empleados);
		this.especialidades =especialidades;
	}
	public String getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}
	
	

}
