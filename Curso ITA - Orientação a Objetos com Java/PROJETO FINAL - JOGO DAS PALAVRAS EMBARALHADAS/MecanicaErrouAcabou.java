public class MecanicaErrouAcabou implements MecanicaDoJogo {

	private String palavraEscolhida;
	private int pontuacao;
	private int vidas = 1;

	@Override
	public String mostraPalavraEmbaralhada() {
		palavraEscolhida = null;

		palavraEscolhida = new BancoDePalavras().escolhePalavraAleatoria();
		String palavraEmbaralhada = new FabricaEmbaralhadores().getEmbaralhador().embaralha(palavraEscolhida);
		return palavraEmbaralhada;

	}

	public String comparaResposta() {
		return palavraEscolhida;
	}

	@Override
	public void errou() {
		--vidas;
	}

	@Override
	public void somaPontuacao() {
		pontuacao++;
	}

	@Override
	public int getPontuacao() {
		return pontuacao;
	}

	@Override
	public String toString() {
		return "O computador escolheu a Mecânica Errou Acabou, boa sorte" + " e qualquer erro pode ser fatal.";
	}

	@Override
	public int getVidas() {
		return vidas;
	}

}
