import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the leg length: ");
            double leg = sc.nextDouble();

            System.out.print("Enter other leg length: ");
            double leg2 = sc.nextDouble();

//            double length = Math.round(Math.sqrt(Math.pow(leg, 2) + Math.pow(leg2, 2)) * 1000.0) / 1000.0;
            double length = Math.sqrt(Math.pow(leg, 2) + Math.pow(leg2, 2));


            System.out.println("the hypotenuse is: "+ length+"cm");

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}