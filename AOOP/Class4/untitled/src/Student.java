import java.util.Comparator;

public class Student {
    String name;
    double cgpa;
    Student(String name, double cgpa)
    {
        this.name = name;
        this.cgpa = cgpa;
    }
    public String toString()
    {
        return "{Name: " + name + ", CGPA: " + cgpa + "}";
    }

    public int compareTo(Student s)
    {
        if(this.cgpa > s.cgpa)
            return 1;
        else if(this.cgpa < s.cgpa)
            return -1;
        else
            return 0;
    }
}

class nameComparator implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

