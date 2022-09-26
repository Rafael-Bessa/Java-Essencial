import java.util.HashMap;

public class Pizza {
	
	static HashMap<String,Integer> ingredientesAdicionados = new HashMap<>();
	static int totalIngredientes;
	int ingredientes;
	int preco;

	
	 void adicionaIngrediente(String ingrediente) {
		++totalIngredientes;
		++ingredientes;	
		contabilizaIngrediente(ingrediente);
	}

	 static void contabilizaIngrediente(String chave){
		if (!ingredientesAdicionados.containsKey(chave)) {
			ingredientesAdicionados.put(chave, 1);	
		}
		else {
		ingredientesAdicionados.put(chave, ingredientesAdicionados.get(chave) + 1);
		}

	}
	
	 int getPreco() {
			if(ingredientes < 3) {
				preco += 15;		
			}
			
			else if (ingredientes < 6) {
				preco += 20;			
			}
			
			else preco += 23;
					
		return preco;	
			
		}

	public int getIngredientes() {
		return ingredientes;
	}
	
	
	static void zeraRegistroIngrediente() {
		ingredientesAdicionados = new HashMap<>();
	}

}
