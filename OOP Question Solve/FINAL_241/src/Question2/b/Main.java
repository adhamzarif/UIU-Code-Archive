package Question2.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Appliance {
    String name, category;
    double powerConsumption;

    Appliance(String n, String c, double d) {
        name = n;
        category = c;
        powerConsumption = d;
    }

    public String toString() {
        return name + " " + category + " " + powerConsumption;
    }

    public static double getPowerConsumption(Object o) {
        return ((Appliance) o).powerConsumption;
    }
}

class ApplianceTest {

    public static void main(String[] args) {
        // Task-1: Create an empty ArrayList of "Appliance" type
        ArrayList<Appliance> appliances = new ArrayList<>();

        // Task-2: Add the appliances
        appliances.add(new Appliance("Television", "Entertainment", 150));
        appliances.add(new Appliance("Washing machine", "Laundry", 2000));
        appliances.add(new Appliance("Refrigerator", "Kitchen", 100));

        // Task-3: Find the "kitchen" appliances from the list and print their details
        for (int i = 0; i < appliances.size(); i++) {
            if (appliances.get(i).category.equals("Kitchen")) {
                System.out.println(appliances.get(i));
            }
        }

        // Task-4: Sort the list based on power consumption in descending order
        /*You must use comparator or comparable interfaces for comparing objects of Appliance type and sort method of Collections class*/
        Collections.sort(appliances, new Comparator<Appliance>() {
            @Override
            public int compare(Appliance o1, Appliance o2) {
                if (o1.powerConsumption > o2.powerConsumption) {
                    return -1;
                } else if (o1.powerConsumption < o2.powerConsumption) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // Task-5: Print the appliances with highest and lowest power consumption
        System.out.println("Highest power consumption: " + appliances.get(0));
        System.out.println("Lowest power consumption: " + appliances.get(appliances.size() - 1));
    }
}

