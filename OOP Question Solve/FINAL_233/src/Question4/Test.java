package Question4;

import java.util.*;

class Address {
    String building_number, area, city;
    int zip_code;

    Address(String building_number, String area, String city, int zip_code) {
        this.building_number = building_number;
        this.area = area;
        this.city = city;
        this.zip_code = zip_code;
    }

    int getZip_code() {
        return zip_code;
    }

    @Override
    public String toString() {
        return building_number + ", " + area + ", " + city + ", " + zip_code;
    }
}

public class Test {
    public static void main(String[] args) {
        // Task 1: Create an empty ArrayList of Address type
        ArrayList<Address> addresses = new ArrayList<>();

        // Task 2: Add objects to the ArrayList
        addresses.add(new Address("19/A", "Dhanmondi", "Dhaka", 1209));
        addresses.add(new Address("2/A", "Tejgaon", "Dhaka", 1215));
        addresses.add(new Address("65", "Nirala", "Khulna", 9100));

        // Task 3: Add object at index 1
        addresses.add(1, new Address("215", "Aamtola", "Barishal", 8200));

        // Task 4: Set object at index 2
        addresses.set(2, new Address("36", "Gulshan", "Dhaka", 1212));

        /* Sort the arraylist in, ascending order of zip codes using a
        comparator for comparing objects of Address class [You can also
        define the Comparator as a separate class if you want] */

        Collections.sort(addresses, new Comparator<Address>() {
            @Override
            public int compare(Address o1, Address o2) {
                return o1.getZip_code() - o2.getZip_code();
            }
        });

        // Task 5: Delete the object at index 2
        addresses.remove(2);

        // Print the final list
        for (Address address : addresses) {
            System.out.println(address);
        }
    }
}

