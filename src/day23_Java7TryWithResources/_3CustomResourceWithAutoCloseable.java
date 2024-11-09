package day23_Java7TryWithResources;

//You can also create your own class that implements AutoCloseable to be used in a try-with-resources block.

class MyResource implements AutoCloseable {
    public MyResource() {
        System.out.println("Resource opened.");
    }

    public void doSomething() {
        System.out.println("Doing something with the resource.");
    }

    @Override
    public void close() {
        System.out.println("Resource closed.");
    }
}

public class _3CustomResourceWithAutoCloseable {
	public static void main(String[] args) {
        try (MyResource resource = new MyResource()) { //MyResource implements AutoCloseable, so it can be used with try-with-resources.
            resource.doSomething(); // When the try block completes, the close() method is called automatically to release the resource.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
