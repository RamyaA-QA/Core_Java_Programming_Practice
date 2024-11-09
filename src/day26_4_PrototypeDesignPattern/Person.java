package day26_4_PrototypeDesignPattern;

//In case you need deep cloning where the objects contain references to other objects, you would also clone those referenced objects.

public class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.address.clone());  // Deep cloning
    }
}

