package FlowControls;
import java.util.Scanner;
public class FarenheitToCelsius {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input temperature in Fahrenheit
	        System.out.print("Enter temperature in Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();

	        // Convert to Celsius
	        double celsius = (fahrenheit - 32) * 5 / 9;

	        // Display the result
	        System.out.println("Temperature in Celsius: " + celsius);

	        // Classify the temperature using if-else
	        if (celsius < 10) {
	            System.out.println("It's cold.");
	        } else if (celsius >= 10 && celsius <= 30) {
	            System.out.println("The weather is moderate.");
	        } else {
	            System.out.println("It's hot.");
	        }

	        scanner.close();
	    }
	}


