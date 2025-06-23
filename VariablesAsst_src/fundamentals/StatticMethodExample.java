package fundamentals;

public class StatticMethodExample {
static int i=100;
static void display() {
	System.out.println("Static variable and method");
}
public static void main(String[]args) {
	System.out.println("Directly:"+i);
	display();
	
	System.out.println("Using classname:"+StatticMethodExample.i);
	StatticMethodExample.display();
	
	StatticMethodExample sme=new StatticMethodExample();
	System.out.println("Using object:"+sme.i);
	sme.display();
	StatticMethodExample sme1=null;
	System.out.println("Using object:"+sme1.i);
	sme1.display();
}
}
