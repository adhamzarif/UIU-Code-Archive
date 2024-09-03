package ArraylstWithInterface;

import java.util.ArrayList;
import java.util.Collections;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Student> arr = new ArrayList<>();
            arr.add(new Student(120, "Rahim"));
            arr.add(new Student(130, "Karim"));
            arr.add(new Student(128, "Azim"));
            arr.add(new Student(122, "Azim"));
            Collections.sort(arr);
            for (Student obj : arr) {
                System.out.println(obj.ID + " " + obj.name);
            }
        }
    }
