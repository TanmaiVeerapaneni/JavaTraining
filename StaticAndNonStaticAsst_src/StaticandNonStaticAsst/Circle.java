package StaticandNonStaticAsst;

public class Circle {
	    // Instance variable
	    double radius;

	    // Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to compute and print area using a local variable
	    public void printArea() {
	        double area = Math.PI * radius * radius;  // local variable
	        System.out.println("Area of the circle: " + area);
	    }

	    // Method to compute and print circumference using a local variable
	    public void printCircumference() {
	        double circumference = 2 * Math.PI * radius;  // local variable
	        System.out.println("Circumference of the circle: " + circumference);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        Circle c1 = new Circle(5.0);  // Circle with radius 5

	        c1.printArea();
	        c1.printCircumference();
	    }
	}


