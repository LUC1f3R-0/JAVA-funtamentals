public class Person {
    String firstName;
    String lastName;

    Person(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    void showName(){
        System.out.println(this.firstName+ " "+this.lastName);
    }
}
