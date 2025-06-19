package Aseguradora.Condiciones;

import Aseguradora.SeguroGeneral;

public abstract class Condicion {
	public abstract boolean cumple(SeguroGeneral sg);
}
