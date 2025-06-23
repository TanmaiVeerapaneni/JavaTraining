package StaticandNonStaticAsst;

public class StudentMarks {
	    // Instance variables
	    String name;
	    int mark1, mark2, mark3;

	    // Constructor
	    public StudentMarks(String name, int mark1, int mark2, int mark3) {
	        this.name = name;
	        this.mark1 = mark1;
	        this.mark2 = mark2;
	        this.mark3 = mark3;
	    }

	    // Method to calculate and display average using local variables
	    public void calculateAverage() {
	        int total = mark1 + mark2 + mark3;      // local variable
	        double average = total / 3.0;           // local variable

	        System.out.println("Student Name: " + name);
	        System.out.println("Average Marks: " + average);
	        System.out.println("----------------------------");
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        StudentMarks s1 = new StudentMarks("Alice", 85, 90, 80);
	        StudentMarks s2 = new StudentMarks("Bob", 70, 75, 65);

	        s1.calculateAverage();
	        s2.calculateAverage();
	    }
	}


