import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {

	static List<String> palavras = new ArrayList<>();

	private void lerArquivo() {

		Scanner s;
		try {
			s = new Scanner(new File("BancoDePalavras.txt"));

			while (s.hasNext()) {

				BancoDePalavras.palavras.add(s.nextLine());

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public String escolhePalavraAleatoria() {
		lerArquivo();
		Random rd = new Random();
		return BancoDePalavras.palavras.get(rd.nextInt(BancoDePalavras.palavras.size()));

	}

}
