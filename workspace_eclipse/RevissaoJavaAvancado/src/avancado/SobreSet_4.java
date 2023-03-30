package avancado;

import java.util.Set;
import java.util.HashSet;

public class SobreSet_4 {
	public static void main(String[] args) {
		Set<Animal> setDeAnimal = new HashSet<>();
		
		setDeAnimal.add(new Animal(1L, "Coelho"));
		setDeAnimal.add(new Animal(2L, "Papagaio"));
		setDeAnimal.add(new Animal(3L, "Piriquito"));
		setDeAnimal.add(new Animal(4L, "Avestruz"));

		setDeAnimal.add(new Animal(1L, "Coelho"));
		
		setDeAnimal.forEach(System.out::println);
		
		// set não aceita o mesmo elemento 2 vezes.
		// nesse caso ele aceitou o "Coelho de id 1L"
		// duas vezes porque não se trata do mesmo objeto,
		// mas de 2 objetos com mesmos atributos.
		
		// a verificação é feita usando equals()
		
		// por padrão o equals() compara o endereço de memória
		// nesse caso, são duas instâncias diferentes de memória.
		
		// para que ele entenda que os nossos coelhos são um só...
		// vamos fazer um @Override do equals() na classe Animal
		
		// Ctrl + 3... generate HashCode and Equals
		// check "id". Generate
		
		// depois do @Override, ele também passa a ordenar
		// talvez por conta do hashCode()
		
		// Comparator e Comparable são para: ordenção
		// Enquanto equals() é para distinção
		
		
	}
}