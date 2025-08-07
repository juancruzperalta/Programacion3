package ejerc2;

import java.util.*;

public class ejerc2 {
/* Ejercicio 2
 Problema de la mochila: Se tienen n objetos y una mochila. Para i = 1,2,..n, el objeto i tiene un peso
 positivo pi y un valor positivo vi. La mochila puede llevar un peso que no sobrepase P. El objetivo es
 llenar la mochila de tal manera que se maximice el valor de los objetos transportados, respetando la
 limitación de capacidad impuesta. Los objetos pueden ser fraccionados, si una fracción xi (0 ≤ xi ≤ 1)
 del objeto i es ubicada en la mochila contribuye en xipi al peso total de la mochila y en xivi al valor
 de la carga.
 ¿Qué estrategia Greedy seguiría para resolver el problema? Esquematice la resolución mediante un
 pseudocódigo en Java*/
	
	List<Objeto> objetos; //objeto con peso y valor positivo...
	int mochila=20; //peso maximo
	List<Objeto> solucion = new LinkedList<>();
	
	//La Estrategia greedy que usaría sería la estrategia en donde es VALOR*PESO....es decir,
	//valor peso primero, el que tenga mejor relacion entre el valor yel peso...
	public ejerc2(List<Objeto> obj) {
		objetos = obj;
	}
	public List<Objeto> greedy(){
		Collections.sort(objetos); //ordeno por valor y peso...el mejor valor/peso va primero...
		int pesollevo = mochila;
		
		while(!objetos.isEmpty() && pesollevo > 0) {
			Objeto primerObj = objetos.get(0); //tendría que hacer un metodo pero es igual...
			objetos.remove(0);
			if(primerObj.getPeso() <= pesollevo) {
				pesollevo-=primerObj.getPeso();
				solucion.add(primerObj);
			}else{
				double fraccion = pesollevo/primerObj.getPeso();
				double valorFracc = primerObj.getValor()*fraccion;
				Objeto fracc = new Objeto(fraccion, valorFracc);
				pesollevo-=fracc.getPeso();
				solucion.add(fracc);
				}
		}
		if(solucion!=null) {
			return solucion;
		}
		return null;
	}
	public static void main(String[]args) {
		List<Objeto> obj = new LinkedList<>();
		Objeto primero = new Objeto(10, 20);
		Objeto segundo = new Objeto(20, 30);
		Objeto tercero = new Objeto(30, 66);
		Objeto cuarto = new Objeto(40, 40);
		Objeto quinto = new Objeto(50, 60);

		obj.add(primero);
		obj.add(segundo);
		obj.add(tercero);
		obj.add(cuarto);
		obj.add(quinto);
		
		ejerc2 eje = new ejerc2(obj);
		
		System.out.println(eje.greedy());
	}
}
