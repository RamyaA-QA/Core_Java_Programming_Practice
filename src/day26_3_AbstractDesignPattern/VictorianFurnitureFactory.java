package day26_3_AbstractDesignPattern;

/*
 * Step 4: Create Concrete Factories
Concrete factories implement the abstract factory and return the concrete products for each style.
 */

//Victorian Furniture Factory
public class VictorianFurnitureFactory implements FurnitureFactory {
@Override
public Chair createChair() {
   return new VictorianChair();
}

@Override
public Sofa createSofa() {
   return new VictorianSofa();
}

@Override
public Table createTable() {
   return new VictorianTable();
}
}