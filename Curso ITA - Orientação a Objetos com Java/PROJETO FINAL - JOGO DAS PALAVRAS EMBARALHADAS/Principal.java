import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("|    Vamos começar o jogo     |");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();

		FabricaMecanicaDoJogo fm = new FabricaMecanicaDoJogo();

		MecanicaDoJogo mecanicaEscolhida = fm.getMecanica();
		System.out.println(mecanicaEscolhida);
		System.out.println();

		while (mecanicaEscolhida.getVidas() != 0) {

			System.out.println(mecanicaEscolhida.mostraPalavraEmbaralhada());
			System.out.println();
			System.out.println("Digite abaixo a resposta: V \n");

			if (new Scanner(System.in).nextLine().equalsIgnoreCase(mecanicaEscolhida.comparaResposta())) {
				System.out.println("Acertou!");
				System.out.println();
				mecanicaEscolhida.somaPontuacao();
			} else {
				System.out.println();
				System.out.println("Errou!");
				System.out.println();
				System.out.println("A resposta correta era: " + mecanicaEscolhida.comparaResposta());
				System.out.println();
				mecanicaEscolhida.errou();
			}

		}
		
		System.out.println("Você fez: " + mecanicaEscolhida.getPontuacao() + " ponto(s)");
		
		if(mecanicaEscolhida.getPontuacao() > 20) {
			System.out.println("VOCÊ É MUITO BOM NISSO! PARABÉNS");
		}

	}

}