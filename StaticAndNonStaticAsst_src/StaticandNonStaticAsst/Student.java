package StaticandNonStaticAsst;

public class Student {
	    // Instance variables
	    int studentId;
	    String name;

	    // Static variable shared by all Student objects
	    static String schoolName;

	    // Constructor
	    public Student(int studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	    }

	    // Method to display student details
	    public void displayDetails() {
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Name: " + name);
	        System.out.println("School Name: " + schoolName);  // static variable
	        System.out.println("--------------------------");
	    }

	    // Main method to demonstrate sharing of static variable
	    public static void main(String[] args) {
	        // Set static variable (shared by all instances)
	        Student.schoolName = "Green Valley High School";

	        // Create student objects
	        Student s1 = new Student(1, "Alice");
	        Student s2 = new Student(2, "Bob");
	        Student s3 = new Student(3, "Charlie");

	        // Display details of all students
	        s1.displayDetails();
	        s2.displayDetails();
	        s3.displayDetails();

	        // Change static variable through one object
	        s2.schoolName = "Blue Ridge Academy";

	        // Show that the change reflects in all objects
	        s1.displayDetails();
	        s2.displayDetails();
	        s3.displayDetails();
	    }
	}


