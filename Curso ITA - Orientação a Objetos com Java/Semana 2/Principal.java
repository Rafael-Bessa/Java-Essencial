
public class PrincipalPizza {

	public static void main(String[] args) {

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

		//Pizza pizza4 = new Pizza();
		
		CarrinhoDeCompras2 carrinho = new CarrinhoDeCompras2();
		carrinho.adicionaNoCarrinho(pizza1);
		carrinho.adicionaNoCarrinho(pizza2);
		carrinho.adicionaNoCarrinho(pizza3);
		//carrinho.adicionaNoCarrinho(pizza4);
		

		carrinho.totalCarrinho();
		Pizza.zeraRegistroIngrediente();
		
		
		
	}

}
