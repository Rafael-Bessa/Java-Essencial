
public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome formatador;

	void getTratamento() {
		formatador.formatarNome(nome, sobrenome);
	}

}
