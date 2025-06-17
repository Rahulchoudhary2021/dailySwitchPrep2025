package collectionConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapVsFlatmap {
	public static void main(String args[]) {
		List<List<Integer>> nestedList = Arrays.asList(
				Arrays.asList(1, 5, 6, 9, 20), 
				Arrays.asList(42, 40, 8, 2),
				Arrays.asList(3, 100, 56, 52));

		List<List<String>> nestedStringList = Arrays.asList(
				Arrays.asList("apple", "banana"),
				Arrays.asList("cat", "dog"), 
				Arrays.asList("elephant", "fox"));

		List<Integer> flatterList = nestedList.stream()
									.flatMap(List::stream)
									.collect(Collectors
									.toList());
		System.out.println(flatterList);
		
		
		List<String>fallternresult=nestedStringList.stream()
								   .flatMap(list -> list.stream()
								    .map(String::toUpperCase))
								    .collect(Collectors.toList());
		System.out.println(fallternresult);
	}
}
