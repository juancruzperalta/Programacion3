package ejerc1;

public class ejerc8DadoIA {
/*Ejercicio 8 – Torres de vigilancia
Una ciudad amurallada está dividida en una grilla de n x n sectores. 
Se desea ubicar torres de vigilancia en algunas casillas, de forma que:
No haya dos torres en la misma fila ni en la misma columna (como el problema de las n-reinas).
No puede colocarse una torre en una casilla donde haya un edificio prohibido
 (representado como true en una matriz de booleanos).
Se deben colocar exactamente n torres (una por fila).
Además, ninguna torre puede verse con otra en diagonal (como en ajedrez).
Se pide: Diseñar un algoritmo que ubique todas las formas posibles de colocar n 
torres cumpliendo las condiciones anteriores y devuelva la cantidad total de formas válidas.*/
	Sector[][] ciudad = new [fila][col];//una matriz con unbooleano que tiene true si tiene un edificio prohibido
	List<Torre> torresAUbicar;
	int fila=0;
	int col =0;
	Solucion cantFormasValidas; //cantidad de formas validas que se puede...
	Sector casillaInicial;
	public Solucion backtracking() {
		Estado e = new Estado(ciudad, casillaInicial, 0);//le paso al estado la matriz
		//así puedo ir asignando las torres ahi y la casilla inicial, mas la cantidad de ubicadas que arranca en 0
		cantFormasValidas = new Solucion(0); //cant formas validas;
		backtracking(e);
		return cantFormasValidas;
	}
	private void backtracking(Estado e) {
		if (e.cantUbicadas == ciudad.length) {
			cantFormasValidas.cantidadFormas++;
		}
		Torre primera = torresAUbicar.get(0);
		torresAUbicar.remove(primera);
		List<Sector> ciudadHijos = generarHijos(e.casillaActual());
		if(puedoPonerEnFilaOColumna(primera, e.matrizActual)) {
			//metodo que recorre la fila y columna a ver si hay otra torre
			if(!enDiagonalTengo(e.matrizActual))//Verifica que en diagonal no tenga otra torre
			for(Sector se: ciudadHijos) {
				Sector seAnterior = e.casillaActual();
				e.pasarSiguienteCelda(se);
				e.ponerTorreAhi(se, primera); //en la pos de la matrizActual del estado
				//pone la celda en esa posicion (se)
				backtracking(e);
				e.quitartorre(se, primera);
				e.volverAtras(seAnterior);
			}
		}
	}
}
