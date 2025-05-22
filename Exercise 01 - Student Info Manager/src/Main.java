import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String course;
    private String ContactNumber;

    public Student(String _name, int _age, String _course, String _contNumber) throws IllegalArgumentException {
        if(_name.isEmpty()){ throw new IllegalArgumentException("name cant be empty"); }
        if(_age < 0){ throw new IllegalArgumentException("Invalid age"); }
        if(_course.isEmpty()){ throw new IllegalArgumentException("course cant be empty"); }
        if(_contNumber.isEmpty()){ throw new IllegalArgumentException("contact number cant be empty"); }

        this.name = _name;
        this.age = _age;
        this.course = _course;
        this.ContactNumber = _contNumber;
    }

public String getName(){
        return this.name;
    }

//    public void setAge(int _age){
//        if(_age < 0){ throw new IllegalArgumentException("Invalid age"); }
//        this.age = _age;
//    }
    public int getAge(){
        return this.age;
    }

//    public void setCourse(String _course){
//        if(_course.isEmpty()){ throw new IllegalArgumentException("name cant be empty"); }
//        this.course = _course;
//    }
    public String getCourse(){
        return this.course;
    }

//    public void setContactNumber(String _contNumber){
//        if(_contNumber.isEmpty()){ throw new IllegalArgumentException("Contact number cant be empty"); }
//        this.ContactNumber = _contNumber;
//    }
    public String getContactNumber(){
        return this.ContactNumber;
    }

    public void details(){
        System.out.println("--- Student Info ---");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Course: "+getCourse());
        System.out.println("Contact: "+getContactNumber());
    }
}

class Main{

    public static void main(String... args){

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter student name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter course: ");
            String course = sc.nextLine().trim();

            System.out.print("Enter contact number: ");
            String contNumber = sc.nextLine().trim();

            Student student = new Student(name, age, course, contNumber);
            student.details();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}