package AtividadeUm;

public class ContaBancaria {

	private String nomeCliente;
	private String conta;
	
	
	public ContaBancaria (String nomeCliente, String conta) {
		this.nomeCliente = nomeCliente;
		this.conta = conta;	
	}
	
	public void dadosCliente() {
		System.out.println("=============================================");
		System.out.println("O nome do cliente: "+nomeCliente);
		System.out.println("O tipo de conta: "+conta);
		System.out.println("=============================================");
	}
	
	

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	
	
	
	
	
	
}
