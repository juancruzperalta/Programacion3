package ejercicio1_tp9;

import java.util.List;

public interface SimpleList {
	
	int size();
	//Retorna la cantidad de elementos de la lista

	
	boolean isEmpty();
	//Retorna true si la lista no contiene elementos y false si contiene al 
	//menos un elemento
	
	boolean contains(Object element);
	//Retorna true si la lista contiene al objeto o pasado como parámetro
	void add(Object element);
	//Agrega el objeto o al final de la lista
	
	Object add(int index, Object element);
	/*Agrega el objeto element en la posición index pasada como parámetro. 
	Se realizan los corrimientos necesarios con los elementos posteriores 
	a dicha posición. Si la posición index no existe retorna null, caso 
	contrario retorna el mismo objeto agregado.*/
	
	Object set(int index, Object element);
	/*Similar al método anterior, pero se sobreescribe el elemento 
	existente en la posición index. El elemento que anteriormente ocupaba 
	la posición index es retornado al usuario. Si la posición index no 
	existe retorna null.*/
	
	boolean remove(Object element);
	/*Elimina la primera ocurrencia del objeto element pasado como 
	parámetro. Si el objeto no se encontró, retorna false. Caso contrario 
	retorna true.*/
	Object remove(int index);
	//Elimina el objeto que ocupa la posición index pasada como parámetro y 
	//lo retorna al usuario. Si no existe, retorna null.
	
	
	void addAll(List otherList);
	//Agrega todos los elementos de la lista otherList pasada como 
	//parámetro al final de la lista que recibe el mensaje
	
	void clear();
	//Elimina todos los elementos de la lista
	
	Object get(int index);
	//Retorna el objeto almacenado en la posición index. Si no existe la posición retorna null;
	
	int indexOf(Object element);
	//Retorna la posición (indice) en la que se encuentra el objeto element pasado como parametro
	//Si el objeto no existe en la lista, retorna -1
	
}