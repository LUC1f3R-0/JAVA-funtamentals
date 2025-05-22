
import java.util.Scanner;

public class Main {
    public static void main(String... args) {

//        String email = "example123@gmail.com";

//        String userName = email.substring(0, 11);
//        System.out.println(userName);
//
//        String name = email.substring(0, email.indexOf("@"));
//        System.out.println(name);
//
//        String domain = email.substring(email.indexOf('@')+1);
//        System.out.println(domain);
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter your Email address: ");
            String email = sc.nextLine().trim();

            String domain = email.substring(email.indexOf("@")+1);
            String userName = email.substring(0, email.indexOf("@"));

            System.out.println("User Name: "+userName);
            System.out.println("Domain: "+domain);

        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}