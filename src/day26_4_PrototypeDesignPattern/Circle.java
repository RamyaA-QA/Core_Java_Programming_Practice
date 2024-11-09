package day26_4_PrototypeDesignPattern;

/*
 * Step 2: Create Concrete Classes that Implement the Prototype
In this case, we'll implement concrete classes like Circle and Rectangle, both of which can be cloned.
 */

	public class Circle implements Prototype {
	    private int radius;
	    private String color;

	    public Circle(int radius, String color) {
	        this.radius = radius;
	        this.color = color;
	    }

	    // Getters and Setters
	    public int getRadius() {
	        return radius;
	    }

	    public void setRadius(int radius) {
	        this.radius = radius;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    // Implement clone method
	    @Override
	    public Circle clone() {
	        return new Circle(this.radius, this.color);
	    }

	    @Override
	    public String toString() {
	        return "Circle [radius=" + radius + ", color=" + color + "]";
	    }
	}

