package Question5.a;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "example";
        ArrayList<Character> charList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            charList.add(str.charAt(i));
        }

        if (charList.size() > 2) {
            charList.set(2, 'z');
        }

        System.out.println("Character list: " + charList);
    }
}

