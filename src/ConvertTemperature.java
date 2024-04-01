// Thực hành Chuyển đổi nhiệt độ

import java.util.*;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));

                    break;
                }
                case 2: {
                    System.out.print("Enter Celsius");
                    double celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));

                    break;
                }
                case 0: {
                    System.exit(0);
                }
                default: {
                    System.out.println("No choice!");
                }
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = ((9 / 5.0) * celsius) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
