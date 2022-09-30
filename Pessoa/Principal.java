//Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
//nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
//método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
//da pessoa.

public class Principal {
	
	public static void main(String[] args) {
		
		Pessoa usuario = new Pessoa("Rafael", "08/06/1992", 1.78, 95.0);
		System.out.println(usuario);
		System.out.println("A idade do " + usuario.getNome() + " é " +
		usuario.calculaIdade() + " anos");
		System.out.println();	
		
		Pessoa usuario2 = new Pessoa("João", "13/07/1979", 1.82, 77.0);
		System.out.println(usuario2);
		System.out.println("A idade do " + usuario2.getNome() + " é " +
		usuario2.calculaIdade() + " anos");
		System.out.println();
		
		Pessoa usuario3 = new Pessoa("José", "01/01/1970", 1.82, 77.0);
		System.out.println(usuario3);
		System.out.println("A idade do " + usuario3.getNome() + " é " +
		usuario3.calculaIdade() + " anos");
	}

}
