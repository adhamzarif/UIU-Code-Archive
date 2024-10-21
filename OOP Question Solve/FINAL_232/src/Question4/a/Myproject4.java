package Question4.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Myproject4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 4 students [Elias with gpa 3.5, Sourav with gpa 3.2, Barakat with gpa 4.5, Bidu with gpa 2.5] in ArrayList.
        students.add(new Student(3.5, "Elias"));
        students.add(new Student(3.2, "Sourav"));
        students.add(new Student(4.5, "Barakat"));
        students.add(new Student(2.5, "Bidu"));

        // Removing student at index 1
        students.remove(1);

        // Set a student Ali with gpa 3.7 at index 2.
        students.set(2, new Student(3.7, "Ali"));

        // Add a student Hasil with 2.95 at index 1.
        students.add(1, new Student(2.95, "Hasil"));

        // Sorting the ArrayList by GPA in descending order
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.get_gpa() > s2.get_gpa()) {
                    return -1;
                } else if (s1.get_gpa() < s2.get_gpa()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // Computing the average GPA
        double totalGPA = 0;
        for (int i = 0; i < students.size(); i++) {
            totalGPA += students.get(i).get_gpa();
        }
        double averageGPA = totalGPA / students.size();

        System.out.println("Average GPA: " + averageGPA);
    }
}

