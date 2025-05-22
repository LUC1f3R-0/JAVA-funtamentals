import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();

            double circumference  = (2 * (Math.PI * radius));
            double area = Math.PI * Math.pow(radius, 2);
            double volume = (4.0/3) * Math.PI * Math.pow(radius, 3);

            System.out.printf("circumference: %.1fcm\n", circumference);
            System.out.printf("Area: %.1fcm²\n", area);
            System.out.printf("Volume: %.1fcm³\n",volume);

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }


    }
}