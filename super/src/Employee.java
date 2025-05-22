public class Employee extends Person {

    int salary;

    Employee(String fName, String lName, int salary) {
        super(fName, lName);
        this.firstName = fName;
        this.lastName = lName;
        this.salary = salary;
    }

    void showSalary(){
        System.out.printf("%s's salary is $%d", this.firstName, this.salary);
    }

}
