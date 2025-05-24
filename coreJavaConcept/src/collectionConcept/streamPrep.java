package collectionConcept;

import java.util.function.Predicate;

public class streamPrep{
    public static void main(String args[]){
        Predicate<Integer>isBoolean=x->x % 2==0;
        System.out.println(isBoolean.test(10));

    }
}