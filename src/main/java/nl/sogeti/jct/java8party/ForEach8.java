package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.List;

/**
 * You can use the forEach method on the Stream class.
 * <p/>
 * Notice the difference between the lambda expression and the method reference.
 */
public class ForEach8 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        // Lambda expression
        names.stream().forEach(name -> System.out.println(name));

        // Method reference
        names.stream().forEach(System.out::println);
    }
}
