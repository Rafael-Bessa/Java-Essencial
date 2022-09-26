import static java.util.Arrays.asList;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Customer rafael = new Customer("Paulo Bessa");
		Customer odair = new Customer("Odair Bessa");
		Customer katia = new Customer("Katia Bessa");
		Customer pedro = new Customer("Pedro Luppi");

		Product bach = new Product("Bach Completo", Paths.get("/music/bach.mp3"), new BigDecimal(100));
		Product poderosas = new Product("Poderosas Anita", Paths.get("/music/poderosas.mp3"), new BigDecimal(90));
		Product bandeira = new Product("Bandeira Brasil", Paths.get("/images/brasil.jpg"), new BigDecimal(50));
		Product beauty = new Product("Beleza Americana", Paths.get("beauty.mov"), new BigDecimal(150));
		Product vingadores = new Product("Os Vingadores", Paths.get("/movies/vingadores.mov"), new BigDecimal(200));
		Product amelie = new Product("Amelie Poulain", Paths.get("/movies/amelie.mov"), new BigDecimal(100));

		LocalDateTime today = LocalDateTime.now();
		LocalDateTime yesterday = today.minusDays(1);
		LocalDateTime lastMonth = today.minusMonths(1);

		Payment payment1 = new Payment(asList(bach, poderosas), today, rafael);
		Payment payment2 = new Payment(asList(bach, bandeira, amelie), yesterday, odair);
		Payment payment3 = new Payment(asList(beauty, vingadores, bach), today, katia);
		Payment payment4 = new Payment(asList(bach, poderosas, amelie), lastMonth, pedro);
		Payment payment5 = new Payment(asList(beauty, amelie), yesterday, rafael);

		List<Payment> payments = asList(payment1, payment2, payment3, payment4, payment5);
		
		
		//O primeiro desafio é fácil. Ordenar os pagamentos por data e imprimi-los
		
		payments.stream()
		.sorted(Comparator.comparing(Payment::getDate))
		.forEach(System.out::println);
		
		//Reduzindo BigDecimal em somas
		
		
		payment1.getProducts().stream()
		.map(Product::getPrice)
		.reduce(BigDecimal::add)
		.ifPresent(System.out::println);
		

	}

}
