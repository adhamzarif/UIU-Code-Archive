import java.util.ArrayList;
class Student {
    int id;
    String cgpa;
    String name;

    public Student(int id, String cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }
    void printInfo() {
        System.out.println("Id "+ id + " Name "+ name + "Cgpa "+ cgpa);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsInfo = new ArrayList<>();

        studentsInfo.add(new Student(123, "3.98","XYZ") );
        studentsInfo.add(new Student(122, "3.22","ABC") );
        studentsInfo.add(new Student(121, "3.12","EFC") );
        studentsInfo.add(new Student(120, "3.80","MNO") );
      
        for(Student s: studentsInfo){
            if(Double.parseDouble(s.cgpa) > 3.50){
                s.printInfo();
            }
        }
    }
}
