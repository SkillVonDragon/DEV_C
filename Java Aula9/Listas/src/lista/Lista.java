package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		Integer n[] = new Integer[3];
		n[0] = 100;
		n[1] = 200;

		List<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(50);
		lista.add(100);
		lista.add(200);
		Collections.sort(lista);
		int numero = 10;

		System.out.println("Tamanho size: " + lista.size());
		if (lista.contains(numero)) {
			System.out.println("Pos" + lista.indexOf(numero));
			System.out.println("Buscando" + lista.get(lista.indexOf(numero)));
		}

	}
}
