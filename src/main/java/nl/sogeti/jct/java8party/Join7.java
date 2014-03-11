package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.Collection;

/**
 * Creates a CSV header based on a collection of column names.
 * <p/>
 * The tedious part is that the comma must only be places between every column name.
 * <p/>
 * In Java SE 8 the String class is given a very useful method.
 */
public class Join7 {

    public static void main(String[] args) {

        Collection<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        StringBuilder stringBuilder = new StringBuilder();

        boolean comma = false;
        for (String name : names) {
            if (comma) {
                stringBuilder.append(',');
            }
            stringBuilder.append(name);
            comma = true;
        }

        String csv = stringBuilder.toString();

        System.out.println(csv);

    }
}
