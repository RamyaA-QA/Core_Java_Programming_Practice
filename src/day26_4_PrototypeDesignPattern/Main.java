package day26_4_PrototypeDesignPattern;

// Create an example where we have different shapes, and we want to clone these shapes rather than creating new ones.

/*
 * Step 3: Use the Prototype in the Main Application
Now, let's use the clone method to create new instances of shapes based on the existing ones.
 */
public class Main {
	public static void main(String[] args) {
        // Create original objects
        Circle originalCircle = new Circle(10, "Red");
        Rectangle originalRectangle = new Rectangle(15, 20, "Blue");

        // Clone the original objects
        Circle clonedCircle = originalCircle.clone();
        Rectangle clonedRectangle = originalRectangle.clone();

        // Print the details of the original and cloned objects
        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}


/*
Explanation:

Prototype Interface: Defines the clone method, allowing for the cloning of objects.

Concrete Classes (Circle, Rectangle): Implement the clone method by returning new instances of themselves.

Cloning: In the Main class, the original objects (originalCircle and originalRectangle) are cloned using the clone method. 
		 The cloned objects (clonedCircle and clonedRectangle) are independent copies of the original ones.
		 
Shallow vs. Deep Cloning: In this example, the cloning is shallow since no nested objects are involved. 
						  If the class had complex attributes like objects within objects, deep cloning would be required.

*/

/*

When to Use the Prototype Pattern:

When creating objects directly is expensive (e.g., when there is a performance cost in terms of initialization).
When you want to create multiple objects with similar configurations or states.
When you want to avoid subclasses of a creator class in the client code (e.g., when the client wants to avoid dealing with constructors).

Advantages:

Reduces the overhead of creating complex objects.
Cloning can be faster than creating a new instance when the original object is complex to create.
Allows for runtime flexibility, as objects can be cloned without requiring their specific classes to be known at runtime.

Disadvantages:

Deep cloning complexity: If the object has references to other objects, deep cloning can become complicated.
Memory overhead: If many clones are created, the memory overhead might increase.

*/
