package fila;
import java.util.LinkedList;
import java.util.Queue;
public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criação de uma fila
		Queue<Integer> fila = new LinkedList<Integer>();
		
		System.out.println(fila);
		
		fila.add(5);
		fila.add(10);
		fila.add(15);
		fila.add(20);
		
		//System.out.println(fila.peek());
		
		fila.remove(10);
		System.out.println(fila);
	}

}
