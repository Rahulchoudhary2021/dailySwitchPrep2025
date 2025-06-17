package collectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamJava8 {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("rahul", "KoMaL", "SaRIta", "suRESH", "NEha");

		List<String> result = names.stream().filter(name -> name.length() > 5).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);

		// Find secound Highest number no. with stream ####using optional List
		List<Integer> secondHighNo = Arrays.asList(1, 5, 8, 3, 9, 9, 4, 7, 3, 2, 6, 1, 0, 7, 4);
		Optional<Integer> result1 = secondHighNo.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
		result1.ifPresentOrElse(resul1 -> System.out.println("Second highest value is " + result1),
				() -> System.out.println("Second highest value not present!!"));
	}

}
