import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteFormatadorNome {

	private FormatadorNome fn1;
	private FormatadorNome fn2;
	private FormatadorNome fn22;
	private FormatadorNome fn3;
	private FormatadorNome fn33;

	@BeforeEach
	void instancias() {

		this.fn1 = new Informal();

		this.fn2 = new Respeitoso("MASCULINO");

		this.fn22 = new Respeitoso("feminino");

		this.fn3 = new ComTitulo("Magnifico");

		this.fn33 = new ComTitulo("Excelentissimo");

	}

	@Test
	void testeFormasDiferentesDeTratamentoUtilizandoClassesDiferentes() {

		assertEquals("Rafael", fn1.formatarNome("Rafael", "Bessa"));

		assertEquals("Sr. Bessa", fn2.formatarNome("Rafael", "Bessa"));

		assertEquals("Sra. Bessa", fn22.formatarNome("Rafael", "Bessa"));

		assertEquals("Magnifico Rafael Bessa", fn3.formatarNome("Rafael", "Bessa"));

		assertEquals("Excelentissimo Rafael Bessa", fn33.formatarNome("Rafael", "Bessa"));

	}

}
