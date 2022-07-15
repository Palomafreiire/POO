package Heranca;

public abstract class animalTeste {
		// atributos
		private String nome;
		private int idade;
		private String som;
		
		//construtor
		
		public animalTeste (String nome, int idade)
		{
			this.nome = nome;
			this.idade = idade ;
			
		}
		
		//modo abstrato
		 abstract void ani (String imprimir);
		
		// metodos (comportamentos)
		 
		public void sobreAnimal() {
			System.out.println("O nome é: "+ nome + " E sua idade é: "+ idade);
			}
		
		

		// ja entro com os gets e sets
		
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


	
		
		
		
	
	
	
}
