class Student {
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    // ✅ Override equals() to compare Student objects by id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // same reference
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // different types
        }

        Student other = (Student) obj;
        return this.id == other.id; // compare by id
    }

    // Optional: override hashCode() when you override equals()
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("John", 119);
        Student studentTwo = new Student("Alice", 119); // Same id, different name

        System.out.println(studentOne.equals(studentTwo)); // Should print true

        // 💬 Why == doesn't work here:
        // '==' checks if two references point to the exact same object in memory.
        // But we want to compare the *contents* (in this case, id values) of two different objects.
        // So we override equals() to compare values, not references.
    }
}
