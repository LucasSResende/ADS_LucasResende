package contabilidade;

public class EmpresaMEI implements Tributavel{
	
	Double faturamentoMensal;

	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return this.faturamentoMensal * 0.275;
		
	}

	@Override
	public Double getValorISS() {
		return this.faturamentoMensal * 0.0;
	}
	
	

}
