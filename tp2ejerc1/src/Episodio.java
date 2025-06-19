package practico2.ejercicio2;

public class Episodio {
/*
 * . Cada episodio posee un título, una descripción, un flag indicando
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
episodio particular, la calificación dada será un valor negativo.
 */
  private String titulo;
  private String descripcion;

  private int calificacion;

  
  public Episodio(String titulo, String descripcion) {
	
	this.titulo = titulo;
	this.descripcion = descripcion;
	calificacion = -1;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


public boolean seVio() {
	return calificacion >0;
}


public void setSeVio(int calificacion) {
	this.setCalificacion(calificacion);
	
}


public int getCalificacion() {
	return calificacion;
}


public void setCalificacion(int calificacion) {
	
	if (calificacion >=1 && calificacion <=5) {
    	this.calificacion = calificacion;
    	
     } else {
    	 System.out.println("ERROR " + calificacion +" no es una calificacion validad");
     }
  
}
  
  
}
