package esporte;

import org.junit.jupiter.api.Test;

public class AtletaTeste {
	
	@Test
	void testarConstrutor() {
		
		Pessoa pessoaEdson = new Pessoa ("Edson", 40);
		
		System.out.println(pessoaEdson.nome);
		System.out.println(pessoaEdson.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 40, 90, false);
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
		
	}
	
	@Test
	void testeNadador() {
		Nadador nadador = new Nadador("Gustavo", 35, 90, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
	}
	
	@Test
	void testarCiclista() {
		Ciclista ciclista = new Ciclista("Edson", 44, 85, false);
		System.out.println("Está aposentado");
		if (ciclista.aposentado) {
			System.out.println("sim");
			
			
		} else {
			System.out.println("não");

		}
		ciclista.pedalar();
		ciclista.envelhecer();
		ciclista.aposentar();
		System.out.println("Agora já está aposentado?");
		System.out.println(ciclista.aposentado ? "Sim" : "Não");
	}

}
