package avancado;

import java.util.ArrayList;
import java.util.List;

public class SobreList_2 {
	public static void main(String[] args) {
		List<Animal> listaDeAniamis = new ArrayList<>();
		listaDeAniamis.add(new Animal(1L, "Tataruga"));
		listaDeAniamis.add(new Animal(2L, "Coelho"));
		listaDeAniamis.add(new Animal(3L, "Cachorro"));
		listaDeAniamis.add(new Animal(4L, "Gato"));
		listaDeAniamis.add(new Animal(5L, "Girafa"));
		listaDeAniamis.add(new Animal(6L, "Gato"));
		
		System.out.println(listaDeAniamis);
		
	}

}
