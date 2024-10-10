package lista;

import java.util.Set;
import java.util.TreeSet;

public class Sete {
	public static void main(String[] args) {
		Set <Integer> sete = new TreeSet<Integer>();
		
		sete.add(10);
		sete.add(5);
		System.out.println(sete.add(10));
		sete.add(100);
		for(Integer n: sete) {
			System.out.println(n);
		}
		System.out.println(sete.size());
		
	}

}
