import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * O enunciado do exercício fala em classe Date para o atributo, porém, desde as
 * últimas versões do Java esta classe junto com a classe Calendar, ficaram
 * obsoletas. O recomendado é utilizar a classe LocalDate.
 * 
 * @author Rafael Bessa
 *
 */

public class Pessoa {

	private LocalDate dataDeNascimento;
	private LocalDate hoje = LocalDate.now();

	public Pessoa(String dataDeNascimento) {
		this.dataDeNascimento = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	protected LocalDate getHoje() {
		return hoje;
	}

	protected LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public int getIdade() {
		return Period.between(this.dataDeNascimento, this.hoje).getYears();
	}

	public String getSigno() {
		if (dataDeNascimento.getMonthValue() == 3 || dataDeNascimento.getMonthValue() == 4) {
			if (dataDeNascimento.getDayOfMonth() > 20 && dataDeNascimento.getMonthValue() == 3
					|| dataDeNascimento.getDayOfMonth() < 21 && dataDeNascimento.getMonthValue() == 4) {
				return "Áries";
			}
		}

		if (dataDeNascimento.getMonthValue() == 4 || dataDeNascimento.getMonthValue() == 5) {
			if (dataDeNascimento.getDayOfMonth() > 20 && dataDeNascimento.getMonthValue() == 4
					|| dataDeNascimento.getDayOfMonth() < 21 && dataDeNascimento.getMonthValue() == 5) {
				return "Touro";
			}
		}

		if (dataDeNascimento.getMonthValue() == 5 || dataDeNascimento.getMonthValue() == 6) {
			if (dataDeNascimento.getDayOfMonth() > 20 && dataDeNascimento.getMonthValue() == 5
					|| dataDeNascimento.getDayOfMonth() < 21 && dataDeNascimento.getMonthValue() == 6) {
				return "Gêmeos";
			}
		}

		if (dataDeNascimento.getMonthValue() == 6 || dataDeNascimento.getMonthValue() == 7) {
			if (dataDeNascimento.getDayOfMonth() > 20 && dataDeNascimento.getMonthValue() == 6
					|| dataDeNascimento.getDayOfMonth() < 22 && dataDeNascimento.getMonthValue() == 7) {
				return "Câncer";
			}
		}

		if (dataDeNascimento.getMonthValue() == 7 || dataDeNascimento.getMonthValue() == 8) {
			if (dataDeNascimento.getDayOfMonth() > 21 && dataDeNascimento.getMonthValue() == 7
					|| dataDeNascimento.getDayOfMonth() < 23 && dataDeNascimento.getMonthValue() == 8) {
				return "Leão";
			}
		}

		if (dataDeNascimento.getMonthValue() == 8 || dataDeNascimento.getMonthValue() == 9) {
			if (dataDeNascimento.getDayOfMonth() > 22 && dataDeNascimento.getMonthValue() == 8
					|| dataDeNascimento.getDayOfMonth() < 23 && dataDeNascimento.getMonthValue() == 9) {
				return "Virgem";
			}
		}

		if (dataDeNascimento.getMonthValue() == 9 || dataDeNascimento.getMonthValue() == 10) {
			if (dataDeNascimento.getDayOfMonth() > 22 && dataDeNascimento.getMonthValue() == 9
					|| dataDeNascimento.getDayOfMonth() < 23 && dataDeNascimento.getMonthValue() == 10) {
				return "Libra";
			}
		}

		if (dataDeNascimento.getMonthValue() == 10 || dataDeNascimento.getMonthValue() == 11) {
			if (dataDeNascimento.getDayOfMonth() > 22 && dataDeNascimento.getMonthValue() == 10
					|| dataDeNascimento.getDayOfMonth() < 22 && dataDeNascimento.getMonthValue() == 11) {
				return "Escorpião";
			}
		}

		if (dataDeNascimento.getMonthValue() == 11 || dataDeNascimento.getMonthValue() == 12) {
			if (dataDeNascimento.getDayOfMonth() > 21 && dataDeNascimento.getMonthValue() == 11
					|| dataDeNascimento.getDayOfMonth() < 22 && dataDeNascimento.getMonthValue() == 12) {
				return "Sagitário";
			}
		}

		if (dataDeNascimento.getMonthValue() == 12 || dataDeNascimento.getMonthValue() == 1) {
			if (dataDeNascimento.getDayOfMonth() > 21 && dataDeNascimento.getMonthValue() == 12
					|| dataDeNascimento.getDayOfMonth() < 21 && dataDeNascimento.getMonthValue() == 1) {
				return "Capricórnio";
			}
		}

		if (dataDeNascimento.getMonthValue() == 1 || dataDeNascimento.getMonthValue() == 2) {
			if (dataDeNascimento.getDayOfMonth() > 20 && dataDeNascimento.getMonthValue() == 1
					|| dataDeNascimento.getDayOfMonth() < 20 && dataDeNascimento.getMonthValue() == 2) {
				return "Aquário";
			}
		}

		return "Peixes";

	}

}
