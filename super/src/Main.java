

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Harry", "Potter");
        person.showName();

        Student student = new Student("tom", "holand", 34);

        student.showGPA();

        Employee employee = new Employee("Tony", "Starks", 10000);
        employee.showSalary();
    }
}