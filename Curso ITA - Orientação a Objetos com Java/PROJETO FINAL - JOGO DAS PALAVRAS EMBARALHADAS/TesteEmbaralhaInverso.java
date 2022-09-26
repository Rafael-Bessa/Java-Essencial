import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteEmbaralhaInverso {

	@Test
	void embaralha() {
		EmbaralhaInverso ei = new EmbaralhaInverso();
		
		String palavra = "Rafael";
		assertEquals("leafar", ei.embaralha(palavra));
		
		String palavra2 = "testedeUnidade";
		assertEquals("edadinuedetset", ei.embaralha(palavra2));
		
		String palavra3 = "teste";
		assertEquals("etset", ei.embaralha(palavra3));
	}

}
