import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {
	
	
	@BeforeEach
	void testeZeraCarrinho() {
		CarrinhoDeCompras.esvaziaCarrinho();
		assertEquals(CarrinhoDeCompras.produtosAdicionados, new HashMap<>());
	}
	
	@Test
	void adicionaProduto() {
		Produto p1 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(p1, 1);	
		assertEquals(1, CarrinhoDeCompras.produtosAdicionados.get(p1));
		carrinho.adicionaProduto(p1, 2);
		assertEquals(3, CarrinhoDeCompras.produtosAdicionados.get(p1));
		carrinho.adicionaProduto(p1, 3);
		assertEquals(6, CarrinhoDeCompras.produtosAdicionados.get(p1));
		
		// Produto com o mesmo CÓDIGO E MESMO TAMANHO, são consideros IGUAIS!!!!!!!!!!!!!!!!!!
		//Consequentemente o PREÇO TEM QUE SER O MESMO
		
		// Note que eu mudei o Nome e ele irá considerar como se fosse o mesmo produto p1
		
		Produto p2 = new ProdutoComTamanho("OutraBermuda", "BE1234", 50.0, "G");
		
		carrinho.adicionaProduto(p2, 3);
		assertEquals(9, CarrinhoDeCompras.produtosAdicionados.get(p2));
		carrinho.adicionaProduto(p2, 8);
		assertEquals(17, CarrinhoDeCompras.produtosAdicionados.get(p2));
		
		// Agora irei criar um produto totalmente diferente com o CÓDIGO DIFERENTE
		
		Produto p3 = new ProdutoComTamanho("OutraBermuda", "BE12345", 30.0, "G");
		carrinho.adicionaProduto(p3, 3);
		
		// 3 produtos p3  e 17 produtos p1 e p2 já que são IGUAIS
		assertEquals(3, CarrinhoDeCompras.produtosAdicionados.get(p3));
		assertEquals(17, CarrinhoDeCompras.produtosAdicionados.get(p2));
		
		// Agora irei criar um produto totalmente diferente com o TAMANHO DIFERENTE
		
		Produto p4 = new ProdutoComTamanho("OutraBermuda", "BE1234", 30.0, "M");
		carrinho.adicionaProduto(p4, 5);
		
		// 5 produtos do tipo p4, 3 do tipo p3 e 17 do tipo p1 e p2
		
		assertEquals(5, CarrinhoDeCompras.produtosAdicionados.get(p4));
		assertEquals(3, CarrinhoDeCompras.produtosAdicionados.get(p3));
		assertEquals(17, CarrinhoDeCompras.produtosAdicionados.get(p2));
		
	}
	
	
	@Test
	void removeProduto() {
		
		Produto p1 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(p1, 8);
		assertEquals(8, CarrinhoDeCompras.produtosAdicionados.get(p1));
		
		carrinho.removeProduto(p1, 6);
		assertEquals(2, CarrinhoDeCompras.produtosAdicionados.get(p1));
		
		carrinho.adicionaProduto(p1, 8);
		assertEquals(10, CarrinhoDeCompras.produtosAdicionados.get(p1));
		
		//Ele não remove do carrinho se o número for maior que a quantidade
		
		carrinho.removeProduto(p1, 11);
		assertEquals(10, CarrinhoDeCompras.produtosAdicionados.get(p1));
			
	}
	
	@Test
	void valorTotalCompra() {
		Produto p1 = new ProdutoComTamanho("Bermuda", "BE1234", 50.0, "G");
		Produto p2 = new ProdutoComTamanho("OutraBermuda", "BE1234", 50.0, "G");
		Produto p3 = new ProdutoComTamanho("OutraBermuda", "BE12345", 30.0, "G");
		Produto p4 = new ProdutoComTamanho("OutraBermuda", "BE1234", 30.0, "M");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(p1, 5);
		carrinho.adicionaProduto(p2, 5);
		carrinho.adicionaProduto(p3, 4);
		carrinho.adicionaProduto(p4, 2);
		
		//Lembrando que: Produtos com o mesmo codigo e mesmo tamanho são considerados IGUAIS
		// No caso p1 e p2 são IGUAIS!!!
		
		assertEquals(680.0, carrinho.valorTotalCompra());
		
		carrinho.valorCompra = 0;
		CarrinhoDeCompras.esvaziaCarrinho();
		
		carrinho.adicionaProduto(p1, 1);
		carrinho.adicionaProduto(p2, 1);
		carrinho.adicionaProduto(p3, 1);
		carrinho.adicionaProduto(p4, 1);
		
		assertEquals(160.0, carrinho.valorTotalCompra());

	}
	
	

}
