package Heranca;

public class cachorroTeste extends animalTeste  {

	public cachorroTeste(String nome, int idade, String som) {
		super(nome, idade, som);		
	}

	public cachorroTeste() {
		// TODO Auto-generated constructor stub
	}

	private String correr;
	
	
	@Override
	public String toString(){
		return "cachorro" + super.toString();
	}
	
	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}	
	
	public String getSom() {
		return "\nSom do animal"+ super.getSom();
	}
	}
	
		
	
		
		
	

	
	
	

