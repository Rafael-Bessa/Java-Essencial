import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, write a method that returns a list of all strings
 * that start with the letter 'a' (lower case) and have exactly 3 letters.
 * 
 * @author Rafael Bessa
 *
 */

public class FilterString {

	public List<String> search(List<String> list) {
		return list.stream().filter(s -> s.startsWith("a"))
				.filter(s -> s.length() == 3)
				.collect(Collectors.toList());

	}

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ana");
		list.add("anaconda");
		list.add("cachorro");
		list.add("abc");
		list.add("oba");
		
		FilterString fs = new FilterString();
		List<String> filter = fs.search(list);
		System.out.println(filter);
		
	}
	
}
