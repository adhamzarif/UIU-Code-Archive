package Q_2_B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ApplianceTest {
    String name;
    String category;
    double powerConsumption;

    public ApplianceTest(String n, String c, double d) {
        name = n;
        category = c;
        powerConsumption = d;
    }

    @Override
    public String toString() {
        return name + " " + category + " " + powerConsumption;
    }

    public static void main(String[] args) {
        ArrayList<ApplianceTest> appliances = new ArrayList<>();

        appliances.add(new ApplianceTest("Television", "Entertainment", 150));
        appliances.add(new ApplianceTest("Washing machine", "Laundry", 2000));
        appliances.add(new ApplianceTest("Refrigerator", "Kitchen", 100));

        System.out.println("Kitchen appliances:");
        for (ApplianceTest appliance : appliances) {
            if (appliance.category.equalsIgnoreCase("Kitchen")) {
                System.out.println(appliance);
            }
        }

        Collections.sort(appliances, new Comparator<ApplianceTest>() {
            @Override
            public int compare(ApplianceTest a1, ApplianceTest a2) {
                return Double.compare(a2.powerConsumption, a1.powerConsumption);
            }
        });

        System.out.println("\nAppliance with the highest power consumption:");
        System.out.println(appliances.get(0));

        System.out.println("\nAppliance with the lowest power consumption:");
        System.out.println(appliances.get(appliances.size() - 1));
    }
}
