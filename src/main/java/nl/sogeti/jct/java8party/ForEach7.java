package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.List;

/**
 * Prints each element of a collection.
 * <p/>
 * How can a for each be done on a Stream in Java SE 8?
 */
public class ForEach7 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
