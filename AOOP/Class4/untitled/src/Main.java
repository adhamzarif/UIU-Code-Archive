import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("List of strings = " + list);

        list.add("Apple");
        list.add("Banana");

        System.out.println("List of strings = " + list);

        list.add(0,"Scooby");

        System.out.println("List of strings = " + list);

        list.set(1, "Jimmy");

        System.out.println("List of strings = " + list);
        System.out.println("For Loop\n");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));

        }

        String removeElement = list.remove(1);
        System.out.println("Remove element " + removeElement);
        System.out.println("List : " + list);

        list.add("Zarif");
        System.out.println("List: " + list);

        list.remove("Scooby");
        System.out.println("List: " + list);
        System.out.println("Iterator\n");
        Iterator<String> iter = list.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next() + "");
        }
        System.out.println("List :" + list);


    }
}