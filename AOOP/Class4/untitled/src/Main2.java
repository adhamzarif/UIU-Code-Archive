import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student student1 = new Student("John Doe", 20);

        list.add(student1);
        System.out.println("List of students: " + list);

        list.add(new Student("Adham", 3.33));
        list.add(new Student("Zarif", 3.00));
        System.out.println("List: " + list);

        // Sorting using the compareTo method defined in Student class (grade-based sorting)
        //Collections.sort(student1.list);
        System.out.println("List after sorting by grade: " + list);

        // Using custom comparator to sort in reverse order (by grade)
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List after reverse sorting: " + list);

        // Sorting using a custom comparator (e.g., by name)
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name); // Sorting by name
            }
        });
        System.out.println("List after sorting by name: " + list);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(11);
        numbers.add(9);
        numbers.add(14);

        System.out.println("Numbers: " + numbers);

        Collections.sort(numbers);
        System.out.println("Numbers after sorting: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Numbers after reversing: " + numbers);
    }
}
