package collectionConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamPrep{
    public static void main(String args[]){
    	

        List<String> names=Arrays.asList("Rahul","Chuoudhary","Angel");
        
        //Simple print with stream-----------
         names.stream().forEach(System.out::println);

        //Doing some operation on input-----------
        names.stream().filter(values -> values.startsWith("R")).forEach(System.out::println);
         
        //Transform input so need to use map--------- 
         List<String>values=names.stream().map(input ->input.toUpperCase()).collect(Collectors.toList());
         System.out.println(values);
    }
}