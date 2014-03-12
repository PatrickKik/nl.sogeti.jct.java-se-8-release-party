package nl.sogeti.jct.java8party;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Filters a collection on even numbers.
 * <p/>
 * Streams can filter too!
 */
public class Filtering7 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers);
    }
}
