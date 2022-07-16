package AtividadeUm;

public class ObjetoPaciente {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente ("Fernando", 22);
		
		paciente1.setPlano("viva");
		paciente1.getPlano();
		paciente1.setArea("clinico geral");
		paciente1.getArea();
		paciente1.dadosPaciente();
		System.out.println();

	}

}
