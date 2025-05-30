package tp2Repracticado;
import java.util.*;
public class ejercicio4 {
  public static void main(String[]args) {
	  List<Integer> fibo = new LinkedList<>();
	  fibonnacci(50, 0, 1, fibo);
	  for(int i=0; i<fibo.size(); i++) {
		  System.out.println(fibo.get(i));
	  }
  }
	
	public static List<Integer> fibonnacci(int i, int value, int value2, List<Integer> fibo) {
		if(value2 < i) {
			int tmp = value;
			value=value2;
			value2=tmp+value2;
			fibo.add(value);
			return fibonnacci(i, value, value2, fibo);
		}
		return fibo;
		
	}
  
}
