package day26_3_AbstractDesignPattern;

/*
 * Step 4: Create Concrete Factories
Concrete factories implement the abstract factory and return the concrete products for each style.
 */

//Modern Furniture Factory
public class ModernFurnitureFactory implements FurnitureFactory {
 @Override
 public Chair createChair() {
     return new ModernChair();
 }

 @Override
 public Sofa createSofa() {
     return new ModernSofa();
 }

 @Override
 public Table createTable() {
     return new ModernTable();
 }
}

