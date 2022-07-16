package AtividadeUm;

public class Cliente {
	
	private String nome;
	private String CPF;
	private int idade;
	
	
	// construtor
	
	public Cliente (String nome, String CPF, int idade) {  //public e depois o nome da class e atribuido 
		                                                   // os parametros que eu quero seguir no objeto
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
		
	} // construtor apenas executa o objeto criado 
	
	// metodo
	
	public void dadosCliente() {
		System.out.println("===============================================================");
		System.out.println("O nome do cliente: " +nome);
		System.out.println("CPF: " +CPF);
		System.out.println("Idade: " +idade);
		System.out.println("===============================================================");			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	

}
