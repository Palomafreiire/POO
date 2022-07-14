package Heranca;

public class CavaloTeste extends animalTeste{

	public CavaloTeste(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}
