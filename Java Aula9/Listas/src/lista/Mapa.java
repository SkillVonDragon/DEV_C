package lista;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<String, Object> mapa = new HashMap<String, Object>();

		mapa.put("Chave-1", LocalDate.now());
		mapa.put("Chave-2", LocalDateTime.now());
		mapa.put("Chave-3", Boolean.TRUE);
		
		
		System.out.println(mapa.get("Chave-1"));
		System.out.println(mapa.get("Chave-2"));
		System.out.println(mapa.get("Chave-3"));
		
		 for (String pos: mapa.keySet()) {
			 System.out.println(mapa.get(pos));
		 }
		
	}
}
