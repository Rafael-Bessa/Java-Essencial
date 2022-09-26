 
public class CarrinhoDeCompras2 {

	private Pizza pizza = new Pizza();
	static int totalPizzas;
	static int precoTotal;

	void adicionaNoCarrinho(Pizza p) {
		if(p.getIngredientes() == 0) {
			throw new IllegalStateException("Você está tentando adicionar uma pizza sem ingredientes!");
		}	
		pizza = p;
		precoTotal += p.getPreco();
		totalPizzas++;	
	}
	
	void totalCarrinho() {
		System.out.println("O carrinho possui " + totalPizzas + " pizzas adicionadas");
		System.out.println("------------------------------------");
		System.out.println("E o valor das " + totalPizzas + " pizzas juntas é de : " + precoTotal + " Reais");
		System.out.println("------------------------------------");
		System.out.println("O número total de ingredientes utilizados nas " + totalPizzas + 
				" pizzas é : " + Pizza.totalIngredientes);
		System.out.println("------------------------------------");
		System.out.println("Quantidade utilizada de cada ingrediente : " + Pizza.ingredientesAdicionados);
	}
	
	
}
