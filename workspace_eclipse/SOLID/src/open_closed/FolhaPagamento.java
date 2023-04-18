package open_closed;

public class FolhaPagamento {
	
	private Double totalFolha = 0.0;
	public void calcular(Remuneravel r) {
	      this.totalFolha += r.getRemuneracao();
	   }

	   
//	   
//	   public void calcular(Object obj) {
//	      if (obj instanceof ContratoCLT) {
//	         ContratoCLT contratoCLT = (ContratoCLT) obj;
//	         totalFolha += contratoCLT.getSalario();
//
//	      } else if (obj instanceof Estagio) {
//	         Estagio estagio = (Estagio) obj;
//	         totalFolha += estagio.getBolsaAuxilio();
//
//	      } else {
//	         //o que fazer aqui?
//	      }
//	   }
//
	   public Double getTotalFolha() {
	      return totalFolha;
	   }
}
