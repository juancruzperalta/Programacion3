import java.util.ArrayList;

public class Planta {
	private String nombreCientifico;
	private ArrayList<String> nombresVulgar;
	private String clasificacion;
	private int reqSol;
	private int reqAgua;
	public Planta(String nombreCientifico, String clasificacion, int reqSol, int reqAgua) {
		super();
		this.nombreCientifico = nombreCientifico;
		this.clasificacion = clasificacion;
		this.reqSol = reqSol;
		this.reqAgua = reqAgua;
		nombresVulgar = new ArrayList<>();
	}
	public ArrayList<String> getNombreVulgar(){
		ArrayList<String> copia= new ArrayList<>(nombresVulgar);
		return copia;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public int getReqSol() {
		return reqSol;
	}
	public void setReqSol(int reqSol) {
		this.reqSol = reqSol;
	}
	public int getReqAgua() {
		return reqAgua;
	}
	public void setReqAgua(int reqAgua) {
		this.reqAgua = reqAgua;
	}
	
	public void addNombreVulgar(String nombreVulg) {
		this.nombresVulgar.add(nombreVulg);
	}
	public boolean tenesEsteNombre(String nombreVulgar) {
		return this.nombresVulgar.contains(nombreVulgar);
	}
	
	
	public String toString() {
		return "<" + "Nombre:" + " " + this.getNombreCientifico() +"\n" + "Clasificacion:" + " " + this.getClasificacion() +"\n" +
				"Requerimiento Sol:" + " " + this.getReqSol() +"\n" + "Requerimiento Agua:" + " " 
				+ this.getReqAgua() +"\n" + "Nombre Vulgares:" + " " + this.getNombreVulgar() +">"+"\n";
	}
	
	
}	
