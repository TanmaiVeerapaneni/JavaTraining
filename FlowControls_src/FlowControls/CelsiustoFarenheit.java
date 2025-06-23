package FlowControls;
import java.util.Scanner;

public class CelsiustoFarenheit {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input temperature in Celsius
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = scanner.nextDouble();

	        // Convert to Fahrenheit
	        double fahrenheit = (celsius * 9 / 5) + 32;

	        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

	        // Classify temperature using if-else
	        if (fahrenheit < 50) {
	            System.out.println("It's cold.");
	        } else if (fahrenheit >= 50 && fahrenheit <= 85) {
	            System.out.println("The weather is moderate.");
	        } else {
	            System.out.println("It's hot.");
	        }
	    }
}


