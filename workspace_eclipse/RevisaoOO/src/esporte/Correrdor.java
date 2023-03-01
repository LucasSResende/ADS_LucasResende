package esporte;

public class Correrdor extends Atleta{

	public Correrdor(String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade, peso, aposentado);
	}
	
	void correr() {
		
		System.out.println("Corredor correndo");
	}

}
