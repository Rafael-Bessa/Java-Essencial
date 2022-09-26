import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	static Map<Produto, Integer> produtosAdicionados = new HashMap<>();
	double valorCompra;
	

	void adicionaProduto(Produto p, int quantidade) {
		if(produtosAdicionados.containsKey(p)){
			produtosAdicionados.put(p, produtosAdicionados.get(p) + quantidade);
		}
		else {
			produtosAdicionados.put(p, quantidade);
		}		
	}

	void removeProduto(Produto p, int quantidade) {
		if(produtosAdicionados.containsKey(p) && quantidade <= produtosAdicionados.get(p)) {
			produtosAdicionados.replace(p, produtosAdicionados.get(p) - quantidade); 
		}
		else {
			System.out.println("Operação não foi efetuada, verifique o produto e a quantidade novamente");
		}
		
	}
	
	double valorTotalCompra() {
		
		for (Map.Entry<Produto,Integer> elemento : produtosAdicionados.entrySet()) {
		    valorCompra += (elemento.getValue() * elemento.getKey().getPreco());	    		
		}
		return valorCompra;
		
	}
	
	
	static void esvaziaCarrinho() {
		produtosAdicionados.clear();
	}
	
	
	

}



