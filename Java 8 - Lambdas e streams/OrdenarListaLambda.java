import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarListaLambda {

	public void ordenarPorTamanho(List<String> lista) {

		lista.sort(Comparator.comparingInt(s -> s.length()));

	}

	public void ordenarOrdemlexicografica(List<String> lista) {

		lista.sort(Comparator.comparing(s -> s));

	}

	public void inverteLista(List<String> lista) {
		lista.sort(Comparator.reverseOrder());
	}

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Ana");
		lista.add("Rafael");
		lista.add("Zebra");
		lista.add("Geladeira");

		OrdenarListaLambda oll = new OrdenarListaLambda();
		oll.ordenarPorTamanho(lista);
		System.out.println(lista + "    Ordenado por tamanho");

		System.out.println();

		oll.ordenarOrdemlexicografica(lista);
		System.out.println(lista + "    Ordenado por ordem alfabetica");

		System.out.println();

		oll.inverteLista(lista);
		System.out.println(lista);

	}

}
