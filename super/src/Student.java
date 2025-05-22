public class Student extends Person {

    double gpa;

    Student(String fname, String lnamea, double gpa){
        super(fname, lnamea);

        this.firstName = fname;
        this.lastName = lnamea;
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.firstName+ "'s GPA is: "+ this.gpa);
    }
}
