import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the temperature: ");
            double temp = sc.nextDouble();
            sc.nextLine();

            System.out.print("Convert to celsius or fahrenheit: (C or f)");
            String unit = sc.nextLine().toUpperCase();

            double newTemp = (unit.equals("C") ? (temp - 32) * (5.0 / 9) : (temp * 5 / 9) + 32);

            System.out.printf("%.2f in %s is %.2f°%s%n",
                    temp,
                    unit.equals("C") ? "celsius" : "fahrenheit",
                    newTemp,
                    unit.equals("C") ? "C" : "F"
            );

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}