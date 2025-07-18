package collectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Generics {
	public static void main(String args[]) {
		List<String> name = Arrays.asList("rahul", "Jony", "Komal");
		Optional<String> data = name.stream().map(String::toUpperCase).filter(s -> s.startsWith("R")).findFirst();
		data.ifPresent(s -> System.out.println("Names start with R present"));
		String result=data.orElse("Name start with R not present");
		System.out.println(result);
		
		Object obj="Rahul";
//		if(obj instanceof String ) {
//			String str=(String) obj;
//			System.out.println(str.length());
//			
//		}
		
		switch(obj){
			case String s->System.out.println("This is instanceof String");
			case Integer I->System.out.println("This is instanceof Integer");
			default -> System.out.println("NOt a valid case !");
		}
			
		
		
		
		

	}
}
