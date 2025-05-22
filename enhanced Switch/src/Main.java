import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your day: ");
            String day = sc.nextLine().toLowerCase();

            switch (day) {
                case "monday" -> System.out.println("It's Monday.");
                case "tuesday" -> System.out.println("It's Tuesday.");
                case "wednesday" -> System.out.println("It's Wednesday.");
                case "thursday" -> System.out.println("It's Thursday.");
                case "friday" -> System.out.println("It's Friday.");
                case "saturday" -> System.out.println("It's Saturday.");
                case "sunday" -> System.out.println("It's Sunday.");
                default -> System.out.println("Invalid day entered.");
            }

            System.out.print("\n\nEnter your day again: ");
            String secondDay = sc.nextLine().toLowerCase();

            switch(secondDay){
                case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("All of them are week days");
                case "saturday", "sunday" -> System.out.println("these both are week ends");
                default -> System.out.println("Invalid day entered.");
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
