package Heranca;

public class CavaloTeste extends animalTeste{

	public CavaloTeste(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	public CavaloTeste() {
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public String toString(){
		return "Cavalo..." + super.toString();
	}
	
	
	private String correr;

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
