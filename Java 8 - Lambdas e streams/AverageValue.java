import java.util.ArrayList;
import java.util.List;

/**
 * Write a method that returns the average of a list of integers.
 * 
 * @author Rafael Bessa
 *
 */

public class AverageValue {

	public Double average(List<Integer> list) {

		return list.stream().mapToInt(i -> i).average().getAsDouble();

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(3);

		System.out.println(list);

		AverageValue av = new AverageValue();
		Double average = av.average(list);
		System.out.println(average);

	}

}
