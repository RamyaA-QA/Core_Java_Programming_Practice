package day26_4_PrototypeDesignPattern;

// In case you need deep cloning where the objects contain references to other objects, you would also clone those referenced objects.

public class Address implements Cloneable {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public Address clone() {
        return new Address(this.city);
    }
}

