package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.List;

/**
 * Mapping and collecting sequentially.
 * <p/>
 * This can be rewritten to use a collector. And make it run parallel very easily!
 */
public class CollectingAgain7 {

    public static void main(String[] args) {

        List<String> descriptions = Arrays.asList("black Audi", "blue Mercedes", "red Audi", "blue Seat", "black Seat");

        Garage garage = Garage.build();

        for (String description : descriptions) {
            String[] parts = description.split(" ");
            Car car = new Car(parts[1], parts[0]);
            garage.accept(car);
        }

        System.out.println(garage);

    }
}
