package day26_3_AbstractDesignPattern;

/*
 * Step 3: Create the Abstract Factory
The abstract factory declares methods to create abstract products.
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
