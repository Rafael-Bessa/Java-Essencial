
public class Respeitoso implements FormatadorNome {

	private String sexo;

	public Respeitoso(String sexo) {
		if (sexo.equalsIgnoreCase("feminino")) {
			this.sexo = "Sra.";
		} else {
			this.sexo = "Sr.";
		}
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return this.sexo + " " + sobrenome;
	}

}
