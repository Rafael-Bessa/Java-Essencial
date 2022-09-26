import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestePizza {

	@BeforeEach
	public void testeZeraRegistroIngrediente() {
		Pizza.zeraRegistroIngrediente();
		assertEquals(Pizza.ingredientesAdicionados, new HashMap<>());
	}

	@Test
	public void testeContabilizaIngrediente() {
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

		assertEquals(3, Pizza.ingredientesAdicionados.get("Peperone"));
		assertEquals(3, Pizza.ingredientesAdicionados.get("Milho"));
		assertEquals(2, Pizza.ingredientesAdicionados.get("Palmito"));
		assertEquals(2, Pizza.ingredientesAdicionados.get("Azeitona"));
		assertEquals(1, Pizza.ingredientesAdicionados.get("Atum"));
		assertEquals(1, Pizza.ingredientesAdicionados.get("Calabresa"));

	}
	
	@Test
	public void testeContabilizaIngrediente2() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Milho");
		pizza1.adicionaIngrediente("Milho");

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Milho");
		pizza2.adicionaIngrediente("Milho");
		pizza2.adicionaIngrediente("Milho");
		pizza2.adicionaIngrediente("Milho");

		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Azeitona");

		assertEquals(11, Pizza.ingredientesAdicionados.get("Milho"));
		assertEquals(1, Pizza.ingredientesAdicionados.get("Azeitona"));

	}
	
	@Test
	public void testeGetPreco() {

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
		
		assertEquals(15, pizza1.getPreco());
		assertEquals(20, pizza2.getPreco());
		assertEquals(23, pizza3.getPreco());

	}
	

}
