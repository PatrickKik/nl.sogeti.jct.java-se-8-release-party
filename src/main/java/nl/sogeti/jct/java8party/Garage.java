package nl.sogeti.jct.java8party;

import java.util.HashSet;
import java.util.Set;

/**
 * Cars can be put in a garage and two garages can merge their cars.
 */
class Garage {

    private String name;
    private Set<Car> cars = new HashSet<>();

    private Garage(String name) {
        this.name = name;
    }

    /**
     * Builds a new garage.
     *
     * @return Garage
     */
    static Garage build() {
        Garage garage = new Garage(Thread.currentThread().getName());
        System.out.println(String.format("[%s] - Building a new garage.", garage.name));
        return garage;
    }

    /**
     * Puts a car in this garage.
     *
     * @param car Car
     */
    void accept(Car car) {
        System.out.println(String.format("[%s] - Accepting a car: %s", Thread.currentThread().getName(), car.toString()));
        cars.add(car);
    }

    /**
     * Merges (the cars of) a garage with this garage.
     *
     * @param garage Garage
     */
    void merge(Garage garage) {
        System.out.println(String.format("[%s] - Merging garage: '%s'.", name, garage.name));
        this.cars.addAll(garage.getCars());
    }


    /**
     * @return All the cars in this garage.
     */
    public Set<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
