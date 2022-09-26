import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePessoa {

	@Test
	void getIdade() {
		Pessoa primeira = new Pessoa("08/06/1992");
		Pessoa segunda = new Pessoa("25/12/1951");
		Pessoa terceira = new Pessoa("09/08/1984");

		assertEquals(30, primeira.getIdade());
		assertEquals(70, segunda.getIdade());
		assertEquals(38, terceira.getIdade());
	}
	
	@Test
	void getSigno() {
		Pessoa primeira = new Pessoa("08/06/1992");
		Pessoa segunda = new Pessoa("25/12/1951");
		Pessoa terceira = new Pessoa("09/08/1984");
		Pessoa quarta = new Pessoa("27/02/1976");
		
		assertEquals("Gêmeos", primeira.getSigno());
		assertEquals("Capricórnio", segunda.getSigno());
		assertEquals("Leão", terceira.getSigno());
		assertEquals("Peixes", quarta.getSigno());
		
		
		
	}

}
