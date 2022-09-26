import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProdutoComTamanho {

	@Test
	void testeEquals() {
		
		Produto p1 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		Produto p2 = new ProdutoComTamanho("OutraBermuda", "BE1234", 50.0, "G");
		assertTrue(p1.equals(p2));
		
		Produto p3 = new ProdutoComTamanho("Bermuda", "AAAAAA", 50.0, "G");
		Produto p4 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		assertFalse(p3.equals(p4));
		
		Produto p5 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		Produto p6 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "M");
		assertFalse(p5.equals(p6));
		
		Produto p7 = new ProdutoComTamanho("Bermuda", "XXYYZZ", 50.0, "P");
		Produto p8 = new ProdutoComTamanho("PRODUTOALEATORIO", "XXYYZZ", 50.0, "P");
		assertTrue(p7.equals(p8));
		
	}
	
	
	@Test
	void testeHashCode() {
		
		Produto p1 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		Produto p2 = new ProdutoComTamanho("OutraBermuda", "BE1234", 50.0, "G");
		assertTrue(p1.hashCode() == p2.hashCode());
		
		Produto p3 = new ProdutoComTamanho("Bermuda", "AAAAAA", 50.0, "G");
		Produto p4 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		assertFalse(p3.hashCode() == p4.hashCode());
		
		Produto p5 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		Produto p6 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "M");
		assertFalse(p5.hashCode() == p6.hashCode());
		
		Produto p7 = new ProdutoComTamanho("Bermuda", "XXYYZZ", 50.0, "P");
		Produto p8 = new ProdutoComTamanho("PRODUTOALEATORIO", "XXYYZZ", 50.0, "P");
		assertTrue(p7.hashCode() == p8.hashCode());
		
	}
	
	
	

}
