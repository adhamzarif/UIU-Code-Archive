import java.io.*;
import java.util.*;

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

class TotalUnitSoldMinimumBoundException extends Exception {
    public TotalUnitSoldMinimumBoundException(String message) {
        super(message);
    }
}

class TotalUnitSoldMaximumBoundException extends Exception {
    public TotalUnitSoldMaximumBoundException(String message) {
        super(message);
    }
}

class Product {
    String item;
    double unitCost;
    double unitSellingPrice;
    int totalUnitSold;

    public Product(String item, double unitCost, double unitSellingPrice, int totalUnitSold) {
        this.item = item;
        this.unitCost = unitCost;
        this.unitSellingPrice = unitSellingPrice;
        this.totalUnitSold = totalUnitSold;
    }

    public double calculateProfit() {
        return (unitSellingPrice - unitCost) * totalUnitSold;
    }
}

public class Q11_ProfitCalculator {
    public static void main(String[] args) {
        String inputFileName = "AnnualSell.txt";
        String outputFileName = "Profit.txt";
        List<Product> products = new ArrayList<>();
        double totalProfit = 0;
        String maxProfitItem = "";
        double maxProfit = Double.NEGATIVE_INFINITY;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                try {
                    String[] parts = line.trim().split("\\s+"); // Split by whitespace

                    if (parts.length != 4) {
                        System.out.println("Skipping malformed line: " + line);
                        continue;
                    }

                    String item = parts[0];
                    double unitCost = Double.parseDouble(parts[1]);
                    double unitSellingPrice = Double.parseDouble(parts[2]);
                    int totalUnitSold = Integer.parseInt(parts[3]);

                    // Validate inputs
                    if (unitCost < 0) {
                        throw new InvalidPriceException("Price cannot be less than zero for item: " + item);
                    }
                    if (totalUnitSold < 0) {
                        throw new TotalUnitSoldMinimumBoundException("TotalUnitSold cannot be less than zero for item: " + item);
                    }
                    if (totalUnitSold > 1000) {
                        throw new TotalUnitSoldMaximumBoundException("TotalUnitSold cannot exceed 1000 for item: " + item);
                    }

                    // Create a new product and calculate profit
                    Product product = new Product(item, unitCost, unitSellingPrice, totalUnitSold);
                    products.add(product);
                    double profit = product.calculateProfit();
                    totalProfit += profit;

                    // Check for max profit
                    if (profit > maxProfit) {
                        maxProfit = profit;
                        maxProfitItem = item;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in input file for line: " + line);
                } catch (InvalidPriceException | TotalUnitSoldMinimumBoundException | TotalUnitSoldMaximumBoundException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the input file: " + e.getMessage());
        }

        // Write output to Profit.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {
            bw.write("Item\tProfit\n");
            for (Product product : products) {
                double profit = product.calculateProfit();
                bw.write(product.item + "\t" + String.format("%.2f", profit) + "\n");
            }
            bw.write("Total Profit: " + String.format("%.2f", totalProfit) + "\n");
            bw.write("Max Profit Item: " + maxProfitItem + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to the output file: " + e.getMessage());
        }
    }
}
