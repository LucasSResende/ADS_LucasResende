package avancado;

import java.util.Set;
import java.util.TreeSet;

public class SobreSet_2 {
	public static void main(String[] args) {
		Set<String> setDeFrutas = new TreeSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		
		System.out.println(setDeFrutas);
		
		// ordem definida: ordem natural dos elementos
		// ordem natural de uma String: ordem alfabética
	}
}
