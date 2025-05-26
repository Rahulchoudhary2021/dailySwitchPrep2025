package collectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
         
         //parallel stream in java----------------------
         //without parallel stream------------------
         long startTime=System.currentTimeMillis();
         List<String> custNames = Arrays.asList(
                 "Alice Johnson", "Bob Smith", "Charlie Brown", "Diana Evans", "Ethan Wright",
                 "Fiona Lewis", "George Clark", "Hannah Scott", "Ian Walker", "Julia Adams",
                 "Kevin Moore", "Laura Hill", "Michael Young", "Nina Brooks", "Oscar James",
                 "Paula Morris", "Quincy Allen", "Rachel King", "Steve Reed", "Tina Ward",
                 "Umar Baker", "Vera Ross", "Walter Diaz", "Xena Holt", "Yusuf Miles",
                 "Zara Lane", "Amber Long", "Brian Stone", "Cathy Wells", "Derek Boyd",
                 "Elena Nash", "Fred Drake", "Grace Pope", "Henry Lowe", "Isla Webb",
                 "Jack Doyle", "Kylie Shaw", "Leon Fox", "Megan Cain", "Noah Ray",
                 "Olivia Hunt", "Peter Neal", "Queen Flores", "Raymond Holt", "Sophie Hale",
                 "Tom Kerr", "Uma Glover", "Victor Rowe", "Wendy Cross", "Xander Pratt"
             );
        // custNames.stream().filter(x -> x.length()>4).map(String :: toUpperCase).forEach(System.out::println);
         List<Integer>infLoop=Stream.iterate(1,x-> x +1).limit(20000).toList();
         long endTime=System.currentTimeMillis();
         System.out.println("Time taken by strem : "+(endTime - startTime));
         
         //with parallel stream---------------
         startTime=System.currentTimeMillis();
       //  custNames.parallelStream().filter(x -> x.length()>4).map(String :: toUpperCase).forEach(System.out::println);
      //   infLoop= infLoop.parallelStream().iterate(1,x-> x +1).limit(20000).toList();
         endTime=System.currentTimeMillis();
         System.out.println("Time taken by parallelStream  : "+(endTime - startTime));
         
         
         
         List<Integer>list=new CopyOnWriteArrayList<Integer>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);
         for(Integer value : list) {
        	 if(value % 2==0) {
        		 list.remove(value);
        	 }
         }
         System.out.println(list);
         try {
         ArrayList<Integer> newList=new ArrayList<>();
         newList.add(1);
         newList.add(2);
         newList.add(3);
         newList.add(4);
         newList.add(5);
         newList.add(6);
         newList.add(7);
         newList.add(8);
         
         Iterator<Integer>itr=newList.iterator();
         while(itr.hasNext()) {
        	 if(itr.next() % 2 == 0) {
        		 itr.remove();
        	 }
         }
         System.out.println(newList);
         
         }catch(Exception e) {
        	 e.printStackTrace();
         }
         
         
         
         
         
         
    }
}