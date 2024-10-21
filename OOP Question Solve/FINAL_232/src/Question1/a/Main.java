package Question1.a;

abstract class Student {
    String firstName;
    String lastName;
    String studentID;
    int age;

    // Abstract method
    abstract void register();

    // Concrete method
    void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
    }
}


interface TA {
    String ROLE = "teaching assistant";

    void assistProfessor();
}


interface RA {
    String ROLE = "research assistant";

    void conductResearch();
}

class UG_SuperStudent extends Student implements TA, RA {
    String professor;
    String research;
    int salary;

    // Overriding the display method from the Student class
    @Override
    void display() {
        super.display();
        System.out.println("Professor: " + professor);
        System.out.println("Research: " + research);
        System.out.println("Salary: " + salary);
    }

    // Implementing the assistProfessor method from the TA interface
    @Override
    public void assistProfessor() {
        System.out.println("Assisting Professor: " + professor);
    }

    // Implementing the conductResearch method from the RA interface
    @Override
    public void conductResearch() {
        System.out.println("Conducting Research: " + research);
    }

    // Implementing the register method from the Student class (abstract method)
    @Override
    void register() {
        System.out.println("Courses registered.");
    }
}

/* No need to write the main method for the solution. This code is written to check the implementation of the classes and interfaces. */
public class Main {
    public static void main(String[] args) {
        UG_SuperStudent student = new UG_SuperStudent();
        student.firstName = "John";
        student.lastName = "Doe";
        student.studentID = "12345";
        student.age = 20;
        student.professor = "Dr. Smith";
        student.research = "Machine Learning";
        student.salary = 2000;

        student.display();
        student.assistProfessor();
        student.conductResearch();
        student.register();
    }
}
