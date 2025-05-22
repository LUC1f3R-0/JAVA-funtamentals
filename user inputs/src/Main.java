import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try(Scanner sc  = new Scanner(System.in);) {
/*        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Are you a Student: ");
        boolean isStudent = sc.nextBoolean();

        System.out.println(
                "My name is "+name+ " and I'm "+age+" years old, and I am "+(isStudent ? "a " :"not a ") +"student "+(isStudent?"with "+gpa+" with GPA":".")
        );
*/


    System.out.print("Enter the Width: ");
    double width = sc.nextDouble();

    System.out.print("Enter the height: ");
    double height = sc.nextDouble();

    double area = width * height;

    System.out.print(width + "cm x " + height + "cm :" + area + "cm²");

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}