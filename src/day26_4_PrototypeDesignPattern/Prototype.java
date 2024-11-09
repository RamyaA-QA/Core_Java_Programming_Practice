package day26_4_PrototypeDesignPattern;

/*
 * Step 1: Create the Prototype Interface
The prototype interface defines the clone method, which will be used to copy objects
 */
public interface Prototype extends Cloneable {
    Prototype clone();
}