package nl.sogeti.jct.java8party;

import java.util.*;

/**
 * When adding element to a map of lists there's always the check if the list exists.
 * <p/>
 * What if, in Java SE 8, map could do this himself?
 */
public class NewListWhenNoList7 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        Map<Integer, List<String>> map = new HashMap<>();

        for (String name : names) {
            int length = name.length();
            List<String> list = map.get(length);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(name);
            map.put(length, list);
        }

        System.out.println(map);
    }
}
