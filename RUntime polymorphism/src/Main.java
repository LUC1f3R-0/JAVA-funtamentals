import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal = null;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Would you like a dog or cat? (1. dog, 2. cat): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> animal = new Dog();

                case 2 -> animal = new Cat();

                default -> System.out.println("Error");

            }
            if (animal != null) {
                animal.speak();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}