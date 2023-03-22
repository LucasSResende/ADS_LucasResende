package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparator_1 {
	public static void main(String[] args) {
		List<Animal> listaDeAniamais = new ArrayList<>();
		
		listaDeAniamais.add(new Animal(1L, "Gato"));
		listaDeAniamais.add(new Animal(2L, "Cachorro"));
		listaDeAniamais.add(new Animal(3L, "Coelho"));
		listaDeAniamais.add(new Animal(4L, "Gato"));
		listaDeAniamais.add(new Animal(5L, "Tataruga"));
		listaDeAniamais.add(new Animal(6L, "Girafa"));
		
		System.out.println(">Pela ordem do nome: ");
		Collections.sort(listaDeAniamais, new ComparadorPorNome());
		System.out.println(listaDeAniamais);
		
		System.out.println(">Pela ordem do ID: ");
		Collections.sort(listaDeAniamais, new ComparadorPorID());
		System.out.println(listaDeAniamais);
	}

}
