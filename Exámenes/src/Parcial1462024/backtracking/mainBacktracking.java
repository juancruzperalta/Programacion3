package Parcial1462024.backtracking;
import java.util.List;
import java.util.LinkedList;
public class mainBacktracking {
	    public static void main(String[] args) {
	        // Definir el conjunto de letras
	    	List<String> conjunto = new LinkedList<>();
	    	{
	    		conjunto.add("E");
	    		conjunto.add("R");
	    		conjunto.add("N");
	    		conjunto.add("O");
	    		conjunto.add("M");
	    		conjunto.add("A");
	    		conjunto.add("T");
	    	}
	        palabraBacktracking bt = new palabraBacktracking(conjunto, 4);
	        bt.backTracking();
	        bt.imprimirMetodo();
	    }
}
