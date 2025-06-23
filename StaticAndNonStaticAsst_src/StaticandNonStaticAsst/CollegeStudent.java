package StaticandNonStaticAsst;

public class CollegeStudent {
	    // Instance variables
	    int studentId;
	    String studentName;

	    // Static variable shared by all CollegeStudent objects
	    static String collegeName;

	    // Constructor to initialize student details
	    public CollegeStudent(int studentId, String studentName) {
	        this.studentId = studentId;
	        this.studentName = studentName;
	    }

	    // Method to display student details
	    public void displayStudentDetails() {
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Student Name: " + studentName);
	        System.out.println("College Name: " + collegeName);  // static variable
	        System.out.println("----------------------------");
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        // Set the static college name (shared across all students)
	        CollegeStudent.collegeName = "University of Excellence";

	        // Create multiple student objects
	        CollegeStudent s1 = new CollegeStudent(101, "Alice");
	        CollegeStudent s2 = new CollegeStudent(102, "Bob");
	        CollegeStudent s3 = new CollegeStudent(103, "Charlie");

	        // Display details for each student
	        s1.displayStudentDetails();
	        s2.displayStudentDetails();
	        s3.displayStudentDetails();
	        // Change college name using one object
	        s2.collegeName = "Global Tech University";

	        // Show that change is reflected in all objects
	        s1.displayStudentDetails();
	        s2.displayStudentDetails();
	        s3.displayStudentDetails();
	    }
}
