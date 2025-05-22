import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter your Number: ");
            int number = sc.nextInt();

            for(int i = number; i >= 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }


    }
}