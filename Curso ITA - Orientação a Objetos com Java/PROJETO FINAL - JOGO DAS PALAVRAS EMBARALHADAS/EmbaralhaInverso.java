import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhaInverso implements Embaralhador{

	@Override
	public String embaralha(String palavra) {
		List<String> letras = Arrays.asList(palavra.toLowerCase().split(""));
	    
	    Collections.reverse(letras);
	    StringBuilder t = new StringBuilder(palavra.length());
	    for (String k : letras) {
	        t.append(k);
	    }
	    return t.toString();
	    
	}

}
