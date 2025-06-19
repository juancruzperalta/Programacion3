package Futbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Futbol5.Condiciones.Condicion;

public class Club {
	private ArrayList<Socio> socios;
	private ArrayList<Integer> canchaID;
	private String nombreClub;
	
	public Club(String nombreClub) {
		this.canchaID = new ArrayList<>();
		this.nombreClub = nombreClub;
		socios = new ArrayList<>();
	}
	
	public void addSocio(Socio ss) {
		this.socios.add(ss);
	}

	public void addCancha(int cancha) {
		this.canchaID.add(cancha);
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}
	
	
	public ArrayList<Socio> busqueda(Condicion cond, Comparator<Socio> comp){
		ArrayList<Socio> aux = new ArrayList<>();
		for(Socio s: socios) {
			if(cond.cumple(s)) {
				aux.add(s);
			}
		}
		Collections.sort(aux, comp);
		return aux;
	}
	
}
