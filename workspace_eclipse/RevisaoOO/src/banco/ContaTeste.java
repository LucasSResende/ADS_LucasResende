package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {

	@Test
	void testarContaCorrente() {
		Double saldoEsperado = 101.0;
				
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100.0);
		contaCorrente.rentabilizar();
		
		assertEquals(saldoEsperado, contaCorrente.saldo);
	}
	
	@Test
	void testarContaPoupanca() {
		Double saldoEsperado = 102.0;
		
		
		Conta poupanca = new ContaPoupanca();
		poupanca.depositar(100.0);
		poupanca.rentabilizar();
		
		assertEquals(saldoEsperado, poupanca.saldo);
	}
}
