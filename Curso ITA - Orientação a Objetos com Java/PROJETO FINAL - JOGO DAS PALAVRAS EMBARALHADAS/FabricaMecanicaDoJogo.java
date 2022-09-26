import java.util.Random;

public class FabricaMecanicaDoJogo {

	MecanicaDoJogo getMecanica() {

		Random rd = new Random();

		int escolha = rd.nextInt(2);

		if (escolha == 0) {
			return new MecanicaErrouAcabou();
		}

		return new MecanicaTresTentativa();

	}

}
