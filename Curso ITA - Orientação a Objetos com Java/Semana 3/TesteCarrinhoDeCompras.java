import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras2 {

	@Test
	void adicionaNoCarrinho() {
		Pizza pizza1 = new Pizza();
		CarrinhoDeCompras2 carrinho = new CarrinhoDeCompras2();
		assertThrows(IllegalStateException.class, () -> carrinho.adicionaNoCarrinho(pizza1),
				"Você está tentando adicionar uma pizza sem ingredientes!");
	}

	@Test
	void totalCarrinho() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Peperone");
		pizza1.adicionaIngrediente("Milho");

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Palmito");
		pizza2.adicionaIngrediente("Azeitona");
		pizza2.adicionaIngrediente("Peperone");
		pizza2.adicionaIngrediente("Milho");

		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Atum");
		pizza3.adicionaIngrediente("Calabresa");
		pizza3.adicionaIngrediente("Peperone");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Palmito");
		pizza3.adicionaIngrediente("Azeitona");

		CarrinhoDeCompras2 carrinho = new CarrinhoDeCompras2();
		carrinho.adicionaNoCarrinho(pizza1);
		carrinho.adicionaNoCarrinho(pizza2);
		carrinho.adicionaNoCarrinho(pizza3);

		assertEquals(3, CarrinhoDeCompras2.totalPizzas);
		assertEquals(58, CarrinhoDeCompras2.precoTotal);
		assertEquals(12, Pizza.totalIngredientes);

	}

}
