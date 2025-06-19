package tp4ejerc5;

import java.time.LocalDate;

public class congelados extends productos{
	private int codigoSuperAlimentaria;
	private double TemperaturaMant;
	private ArrayList<tipos>();
	public congelados(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen) {
		super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen);
		
	}

}
//Hay tres tipos de productos congelados: congelados por aire, congelados por agua y
//congelados por nitrógeno. Los productos congelados por aire deben llevar la información de
//la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido
//de carbono y % de vapor de agua). Los productos congelados por agua deben llevar la
//
//información de la salinidad del agua con que se realizó la congelación en gramos de sal por
//litro de agua. Los productos congelados por nitrógeno deben llevar la información del método
//de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos.
