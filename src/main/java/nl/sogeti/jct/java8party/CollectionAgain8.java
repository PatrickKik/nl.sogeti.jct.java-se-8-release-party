package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.List;

/**
 * Using a custom collector to collect all the cars in a garage.
 */
public class CollectionAgain8 {

    public static void main(String[] args) {

        List<String> descriptions = Arrays.asList("black Audi", "blue Mercedes", "red Audi", "blue Seat", "black Seat");

        Garage garage = descriptions.parallelStream().collect(
                Garage::build,
                (g, description) -> {
                    String[] parts = description.split(" ");
                    g.accept(new Car(parts[1], parts[0]));
                },
                Garage::merge
        );

        System.out.println(garage);
    }
}
