package nl.sogeti.jct.java8party;

/**
 * A car.
 */
public class Car {

    private String brand;
    private String color;

    /**
     * A car.
     *
     * @param brand Brand
     * @param color Color
     */
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * @return Brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return Color
     */
    public String getColor() {
        return color;
    }
}
