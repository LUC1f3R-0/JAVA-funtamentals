import java.util.Random;

public class Main {
    static Random rand = new Random();


    static private void randomNum(){
        while (true) {
            int number = rand.nextInt(1, 10);
            int number2 = rand.nextInt(1, 10);
            int number3 = rand.nextInt(1, 10);

            System.out.println("first: " + number + "| Second: " + number2 + "| Third: " + number3);

            if (number == number2 && number2 == number3) {
                System.out.println("all of them are the same\n");
                return;
            } else if (number == number2) {
                System.out.println("First one and second one are the same\n");
            } else if (number2 == number3) {
                System.out.println("second number and third numbers are the same\n");
            } else if (number == number3) {
                System.out.println("First number and third numbers are the same\n");
            } else {
                System.out.println("None of them are the same\n");
            }
        }
    }

    static private void randomDouble(){
        double number1 = rand.nextDouble();
        double number2 = rand.nextDouble(-10, 10);
        double number3 = rand.nextDouble();

        System.out.println("First one: "+number1);
        System.out.println("Second one: "+number2);
        System.out.println("Third one: "+number3);
    }

    static private void randomBoolean(){
        boolean first = rand.nextBoolean();
        boolean second = rand.nextBoolean();

        System.out.println("First one: "+ first);
        System.out.println("Second one: "+second);
    }

    public static void main(String[] args) {

//        randomNum();
//        randomDouble();
        randomBoolean();
    }
}