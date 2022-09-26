import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	private static Map<String, String> mapa = new HashMap<>();

	public static Map<String, String> processar(String nomeArquivo) throws IOException {

		Scanner leitor = null;
		try {
			leitor = new Scanner(new File(nomeArquivo));
		} catch (IOException e) {
			throw new IOException("Erro ao abrir o arquivo : " + e.getMessage());
		}

		if (!leitor.hasNext()) {
			throw new LeituraArquivoException("Arquivo Vazio");
		}

		while (leitor.hasNext()) {

			String linha = leitor.nextLine();
			String[] valores = linha.split("->");
			if (valores.length != 2) {
				throw new LeituraArquivoException("Formato de arquivo inválido");
			}
			ProcessadorArquivo.mapa.put(valores[0], valores[1]);
		}

		return mapa;

	}

}
