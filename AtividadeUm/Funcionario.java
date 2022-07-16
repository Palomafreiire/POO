package AtividadeUm;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cargo;
	
	
	public Funcionario(String nome, int idade, String cargo) {
		
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;		
	}
	
	public void dadosFuncionarios() {
		System.out.println("=================================================");
		System.out.println("O nome do funcionário: "+nome);
		System.out.println("A idade do funcionário: "+idade);
		System.out.println("O cargo do funcionário: "+cargo);
		System.out.println("=================================================");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
