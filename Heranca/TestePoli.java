package Heranca;

import java.util.Scanner;

public class TestePoli {
	
		public static void main (String args[])
		{
		Scanner ler = new Scanner(System.in);
		CavaloTeste cavalo = new CavaloTeste("bichana", 5);
		cachorroTeste cachorro = new cachorroTeste("suzy", 6);
		BichoPreguicaTeste bichoPreguica = new BichoPreguicaTeste("soninho", 3);
		
		
		
		System.out.println();
		cavalo.sobreAnimal();
		
		
		
	
		System.out.println();
		cachorro.sobreAnimal();
	
		
		System.out.println();
		bichoPreguica.sobreAnimal();
		
		
		
	
			
		}

}


