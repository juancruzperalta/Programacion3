package tp6;

import java.util.Collections;

public class ejercReaccion {
/* Una empresa de productos químicos desea almacenar 6 tipos de productos, 
algunos de los cuales reaccionan entre sí pudiendo dar lugar a una explosión si 
entran en contacto. Por ejemplo, p1 reacciona con p2, p4 y p6, p2 reacciona con 
p6, p3 reacciona con p4 y p5, y p5 reacciona con p6. 
 Como medida de precaución, la empresa desea dividir el almacén en 
compartimentos y guardar los productos incompatibles en compartimentos 
diferentes.
  ¿Cuál es el mínimo número de compartimentos que necesitará la empresa?*/
	
	List<Producto> productos; //aca estan los tipos y quien reacciona con quien
	List<List<Integer>> compartimientos;
	
	public List<List<Integer>> greedy(int index, int pos){
		Collections.sort(productos); //ordeno por vertices de menor amayor...
		while(!productos.isEmpty() && pos<productos.size()) {
			Producto primero = productos.get(pos);
			if(!noReaccionaEnProducto(productos.get(pos), compartimientos, index)) {
				//agrego el producto primero, en el compartimientos en el índice ese, por ende
				//en la lista 1 por ejemplo, luego al siguiente voy y digo, 
				index++;
				if(index==compartimientos.size()) {
					return null;
				}
			}
			index=0;
			return greedy(index,pos++);
		}
	}
}
