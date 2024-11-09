package day26_3_AbstractDesignPattern;

/*
 * Step 5: Client Code
The client uses the abstract factory to get different furniture products without worrying about the specific furniture style.
 */
public class Main {
	public static void main(String[] args) {
        // Using Modern Furniture Factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        Table modernTable = modernFactory.createTable();

        // Modern products
        modernChair.sitOn();  // Output: Sitting on a modern chair.
        modernSofa.lieOn();   // Output: Lying on a modern sofa.
        modernTable.placeItemsOn();  // Output: Placing items on a modern table.

        // Using Victorian Furniture Factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        Table victorianTable = victorianFactory.createTable();

        // Victorian products
        victorianChair.sitOn();  // Output: Sitting on a Victorian chair.
        victorianSofa.lieOn();   // Output: Lying on a Victorian sofa.
        victorianTable.placeItemsOn();  // Output: Placing items on a Victorian table.
    }
}
/*
When to Use the Abstract Factory Pattern:

When you need to create families of related or dependent objects that work together.
When the system needs to be independent of how its objects are created or composed.
When you want to enforce consistency among products (e.g., you only want Victorian furniture or Modern furniture in a given room).

Advantages:

Encapsulates object creation: The factory methods encapsulate the logic for creating related objects.
Consistency: Ensures that products from the same family are used together.
Flexibility: You can easily change the product family (e.g., from Victorian to Modern) by changing the factory, without affecting the client code.

Disadvantages:

Complexity: The pattern introduces additional complexity due to the creation of multiple abstract and concrete classes.
Tight coupling: The client is coupled to specific factory implementations, making it harder to modify individual products without changing the entire family.
*/