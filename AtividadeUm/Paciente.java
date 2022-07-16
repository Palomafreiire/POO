package AtividadeUm;

public class Paciente {
	
	private String nome;
	private int idade;
	private String plano;
	private String area;
	
	public Paciente (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public void dadosPaciente() {
		System.out.println("====================================================");
		System.out.println("Nome do paciente: "+ nome);
		System.out.println("Idade do paciente: "+idade);
		System.out.println("plano do paciente: "+plano);
		System.out.println("A area de atendimento: "+area);
		System.out.println("====================================================");
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

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
	
	
	
	

}
