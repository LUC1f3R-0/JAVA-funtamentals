import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter what is you want to loop: ");
            String loop = sc.nextLine();

            System.out.print("how Many times you want to loop: ");
            int num = sc.nextInt();

            for(int i = 1; i <= num; i++){
                System.out.println(i+". "+loop);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}