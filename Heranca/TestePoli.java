package Heranca;

public class TestePoli {
	
		public static void main (String args[])
		{
		CavaloTeste cavalo = new CavaloTeste();
		cachorroTeste cachorro = new cachorroTeste();
		BichoPreguicaTeste bichoPreguica = new BichoPreguicaTeste();
		
		
		cavalo.setNome("bichana");
		cavalo.setSom("bruuuuu");
		System.out.println(cavalo.imprimir());
		
		cachorro.setNome("Suzy");
		cachorro.setSom("auauau");
		System.out.println(cachorro.imprimir());
		
		bichoPreguica.setNome("Soninho");
		bichoPreguica.setSom("uhhhh");
		System.out.println(bichoPreguica.imprimir());
		
		
	
			
		}

}


