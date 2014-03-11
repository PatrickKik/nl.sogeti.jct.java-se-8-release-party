package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.Collection;

/**
 * The new join method on the String class makes life very easy.
 * Also check out the overloaded varargs variant of this method.
 */
public class Join8 {

    public static void main(String[] args) {

        Collection<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        String csv = String.join(",", names);

        System.out.println(csv);
    }
}
