package Heranca;

public class BichoPreguicaTeste extends animalTeste{

	public BichoPreguicaTeste(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	
	public BichoPreguicaTeste() {
		// TODO Auto-generated constructor stub
	}


	private String escalar;
		
	@Override
	
	public String toString(){
		return "Bicho preguiça" + super.toString();
	}
	
	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	public String getSom() {
		return "\nSom do animal"+ super.getSom();
	}
	
	
}
