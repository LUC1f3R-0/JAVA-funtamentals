import java.util.Scanner;

class Main{

    public static void main(String... args){

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("What item would you like to buy: ");
            String food = sc.nextLine().trim();

            System.out.print("What is the price for each?: ");
            double price = sc.nextDouble();

            System.out.print("how many would you like?: ");
            int quantity = sc.nextInt();

            double amount = price * quantity;
            char currency = '$';

            System.out.println("You have bought "+quantity +" "+ food+(quantity>1?"s ":""));
            System.out.println("Your total is: "+currency+amount);

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}