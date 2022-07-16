package AtividadeUm;

import java.util.Scanner;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ("Paloma", "123.123.123-12", 28);
		Scanner ler = new Scanner (System.in);
		
		cliente1.dadosCliente();
		System.out.println();
		
		
	}

}
