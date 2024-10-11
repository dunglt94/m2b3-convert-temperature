import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        while (true) {
            callMenu();
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cToF(celsius) + "°F");
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToC(fahrenheit) + "°C");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void callMenu() {
        System.out.println("Menu");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");
    }

    public static double cToF (double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static double fToC (double farenheit) {
        double celsius = (farenheit - 32) * 5/9;
        return celsius;
    }
}
