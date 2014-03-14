package nl.sogeti.jct.java8party;

/**
 * A car.
 */
class Car {

    private String brand;
    private String color;

    /**
     * A car.
     *
     * @param brand Brand
     * @param color Color
     */
    Car(String brand, String color) {
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
    String getBrand() {
        return brand;
    }

    /**
     * @return Color
     */
    String getColor() {
        return color;
    }
}
