package ArraylstWithInterface;

public class Student implements Comparable<Student> {
    int ID;
    String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public int compareTo(Student obj) {
        int nameComparison = this.name.compareTo(obj.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.ID, obj.ID);
        }
    }
}
