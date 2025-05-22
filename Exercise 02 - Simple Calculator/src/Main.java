import java.util.Scanner;
import java.util.jar.JarOutputStream;

class Calculator{
    static double add(double a, double b){
        return a + b ;
    }

    static double subtract(double a, double b){
        return a - b;
    }

    static double multiply(double a, double b){
        return a * b;
    }

    static double divide(double a, double b){
        if(a == 0 || b == 0){ return 0;}
        return a / b;
    }

}

class Main{

    public static void main(String... args){
        try(Scanner sc = new Scanner(System.in)){

            while(true){
                System.out.print("Enter the first Number: ");
                int firstNumber = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter the second number: ");
                int secondNumber = sc.nextInt();
                sc.nextLine();

                System.out.print("Choose operation: ");
                String operator = sc.nextLine();

                    switch(operator){
                        case "+":
                            System.out.println(firstNumber+" "+operator+" "+secondNumber+" = "+Calculator.add(firstNumber, secondNumber));
                            break;

                        case "-":
                            System.out.println(firstNumber+" "+operator+" "+secondNumber+" = "+Calculator.subtract(firstNumber, secondNumber));
                            break;

                        case "*":
                            System.out.println(firstNumber+" "+operator+" "+secondNumber+" = "+Calculator.multiply(firstNumber, secondNumber));
                            break;

                        case "/":
                            System.out.println(firstNumber+" "+operator+" "+secondNumber+" = "+Calculator.divide(firstNumber, secondNumber));
                            break;

                        default:
                            System.out.println("Invalid input");
                    }
            }

        }catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}