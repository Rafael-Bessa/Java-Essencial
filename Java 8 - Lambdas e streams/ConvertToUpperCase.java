import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Write a method that converts all strings in a list to their upper case.
 * 
 * @author Rafael Bessa
 *
 */

public class ConvertToUpperCase {
	
	public List<String> upperCase(List<String> list) {
		
		return list.stream().map(s -> s.toUpperCase())
		  .collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("rafael");
		list.add("bessa");
		list.add("java");
		
		System.out.println(list);
		
		ConvertToUpperCase ctuc = new ConvertToUpperCase();
		List<String> listUpper = ctuc.upperCase(list);
		System.out.println(listUpper);
		
	}

}
