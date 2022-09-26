import java.util.Random;

public class FabricaEmbaralhadores {

	Embaralhador getEmbaralhador() {

		Random rd = new Random();

		int escolha = rd.nextInt(2);

		if (escolha == 0) {
			return new EmbaralhaAleatorio();
		}

		return new EmbaralhaInverso();

	}

}
