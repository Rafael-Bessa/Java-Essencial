import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProduto {

	@Test
	void testeAtributos() {
		Produto p1 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		assertEquals("Bermuda", p1.getNome());
		assertEquals("BE1234", p1.getCodigo());
		assertEquals(50, p1.getPreco());
	
	}

}
