package Heranca;

public abstract class animalTeste {
		
		private String nome;
		private int idade;
		private String som;
		
		public animalTeste (String nome, int idade,String som)
		{
			this.nome = nome;
			this.idade = idade;
			this.som = som;
		}
		
		public abstract String imprimir();
		
		@Override
		
		public String toString() {
			return "\nO nome do animal" + nome+ "A idade do animal: "+idade+ "O som que ele emite: "+som;
		}
		
		public void som() {
			System.out.println("\nEmitindo som....");
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

		public void setIdade(int string) {
			this.idade = string;
		}

		public String getSom() {
			return som;
		}

		public void setSom(String som) {
			this.som = som;
		}


		public String getCorrer() {
			
			return null;
		}
		
		
		
		
	
	
	
}
