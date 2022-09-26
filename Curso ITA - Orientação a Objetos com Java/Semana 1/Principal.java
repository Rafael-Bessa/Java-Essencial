
public class PrincipalIMC {

	public static void main(String[] args) {
		
		Paciente primeiro = new Paciente(85, 1.9);
		System.out.print(primeiro.calculaIMC() + " e ");
		System.out.println(primeiro.diagnostico());
		System.out.println();

		
		Paciente segundo = new Paciente(50, 1.75);
		System.out.print(segundo.calculaIMC() + " e ");
		System.out.println(segundo.diagnostico());
		System.out.println();
				
		Paciente terceiro = new Paciente(150, 1.8);
		System.out.print(terceiro.calculaIMC() + " e ");
		System.out.println(terceiro.diagnostico());

	}

}
