package nl.sogeti.jct.java8party;

import java.util.*;

/**
 * Map can perform an action when the key does not exists.
 */
public class NewListWhenNoList8 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        Map<Integer, List<String>> map = new HashMap<>();

        names.forEach(
                name -> map.computeIfAbsent(name.length(), key -> new ArrayList<>()).add(name)
        );

        System.out.println(map);
    }
}
