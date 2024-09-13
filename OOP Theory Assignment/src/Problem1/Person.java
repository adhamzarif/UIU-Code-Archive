package Problem1;

public class Person {
    public String name, gender;
    private int age;// private = restricted access

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Prof. Albert Einstein", "Male");
        System.out.println(p1.name);
    }
}
