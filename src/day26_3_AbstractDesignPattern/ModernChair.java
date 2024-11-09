package day26_3_AbstractDesignPattern;

/*
 * Step 2: Create Concrete Product Classes
These classes implement the abstract product interfaces for each furniture style (Modern and Victorian).
 */
//Modern Chair
public class ModernChair implements Chair {
 @Override
 public void sitOn() {
     System.out.println("Sitting on a modern chair.");
 }
}
