
public class Pessoas {
		
	private String nome;
	private int idade;
	private float altura;
		
	public int getIdade() {
		return idade;
	}

	public Pessoas(String nome, int idade, float altura) {
		
		this.altura = altura;
		this.idade = idade;
		this.nome = nome;
	
	}

	public String getNome() {
		return nome;
	}

	public float getAltura() {
		return altura;
	}
	
	public String toString() {
		return nome + " | " + idade + " | " + altura + " ";
		
	}
	 
}