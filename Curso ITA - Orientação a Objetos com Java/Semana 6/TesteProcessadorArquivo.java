import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TesteProcessadorArquivo {

	@Test
	void processar() throws IOException {
		assertThrows(IOException.class, () -> ProcessadorArquivo.processar("arquivoInexistente.txt"),
				"Erro ao abrir o arquivo : arquivoInexistente.txt (O sistema não pode encontrar o arquivo especificado");

		assertThrows(IOException.class, () -> ProcessadorArquivo.processar("arquivoVazio"), "Arquivo Vazio");

		assertThrows(IOException.class, () -> ProcessadorArquivo.processar("arquivoDuplicado.txt"),
				"Formato de arquivo inválido");

		assertEquals("Rafael", ProcessadorArquivo.processar("arquivoCorreto.txt").get("nome"));
		assertEquals("Bessa", ProcessadorArquivo.processar("arquivoCorreto.txt").get("sobrenome"));
		assertEquals("30", ProcessadorArquivo.processar("arquivoCorreto.txt").get("idade"));

	}

}
