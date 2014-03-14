package nl.sogeti.jct.java8party;

/**
 * A person with a name.
 */
class Person {

    private String name;

    /**
     * A person.
     *
     * @param name name of this person
     */
    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
