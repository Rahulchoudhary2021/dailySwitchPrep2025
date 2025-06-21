package collectionConcept;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//		List<Integer> flatterList = nestedList.stream()
//									.flatMap(List::stream)
//									.collect(Collectors
//									.toList());
//		System.out.println(flatterList);
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);
		
		List<Integer>result=Stream.of(list1,list2)
				            .flatMap(Collection::stream)
				            .distinct()
				            .sorted(Comparator.reverseOrder())
				            .collect(Collectors.toList());
		
		
//		List<String>fallternresult=nestedStringList.stream()
//								   .flatMap(list -> list.stream()
//								    .map(String::toUpperCase))
//								    .collect(Collectors.toList());
//		System.out.println(fallternresult);
	}
}
