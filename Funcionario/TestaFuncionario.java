
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario rafael = new Funcionario();
		rafael.setNome("Rafael Bessa");
		rafael.setCpf("191.292.382-61");
		rafael.setSalario(2500);
		
		System.out.println(rafael.getNome());
		System.out.println(rafael.getBonificacao());
		
		Gerente g = new Gerente();
		g.setSalario(1000);
		
		
		
		Funcionario f = new Gerente();
		f.setSalario(1000);
		System.out.println(f.getBonificacao());
		
	}

}
