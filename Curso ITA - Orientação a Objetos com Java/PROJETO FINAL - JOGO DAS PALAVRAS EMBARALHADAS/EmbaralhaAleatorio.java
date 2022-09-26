import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhaAleatorio implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		List<String> letras = Arrays.asList(palavra.toLowerCase().split(""));

		Collections.shuffle(letras);
		StringBuilder t = new StringBuilder(palavra.length());
		for (String k : letras) {
			t.append(k);
		}
		return t.toString();
	}

}
