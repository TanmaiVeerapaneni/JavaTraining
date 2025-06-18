package fundamentals;

public class Employee {
	int eno=2;
	String ename;
	String eadd="Vijayawda";
	double esal=250.02;
	void displayDetails() {
		System.out.println(eno+ename+eadd+esal);
	}
	public static void main(String[]args) {
		Employee emp=new Employee();
		emp.ename="Ta";
		System.out.println(emp.eno+"Name is:"+emp.ename+"Add is:"+emp.eadd+"Sal is:"+emp.esal);
		Employee emp1=new Employee();
		emp1.ename="Tan";
		System.out.println(emp1.eno+"Name is:"+emp1.ename+"Add is:"+emp1.eadd+"Sal is:"+emp1.esal);
		emp.displayDetails();
		emp1.displayDetails();
	}

}
