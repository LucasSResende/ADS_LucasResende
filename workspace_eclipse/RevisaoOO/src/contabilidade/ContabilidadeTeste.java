package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTeste {

	@Test
	void testeEmpresaMEI() {
		EmpresaMEI empresaMEI = new EmpresaMEI(100.0);
		
		Double valorIREsperado = 27.5;
		assertEquals(valorIREsperado, empresaMEI.getValorIR(), 2);
		
		Double valorISSEsperado = 0.0;
		assertEquals(valorISSEsperado, empresaMEI.getValorISS());
		
	}
	
	@Test
	void testeEmpresaSimples() {
		EmpresaSimples empresaSimples = new EmpresaSimples(100.0);
		
		Double valorIREsperado = 15.0;
		assertEquals(valorIREsperado, empresaSimples.getValorIR(), 2);
		
		Double valorISSEsperado = 8.0;
		assertEquals(valorISSEsperado, empresaSimples.getValorISS());
		
	}
}
