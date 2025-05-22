import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

class Person{
    private String name;
    private int age;

    @Override
    public String toString(){
        return "name: " + this.name + "age: "+ this.age;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    } public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }


}

class Main {
   static ArrayList<Person> one = new ArrayList<>();

    public static void main(String... args){
        Person person = new Person("John", 37);
        Person person2 = new Person("Smith", 17);

        one.add(person);
        one.add(person2);

        System.out.println(person);
        System.out.println(person2);
    }
}