package Question3.a;

public class Employee {
    public String name;
    public int id;
    double[] scores;

    public Employee(String name, int id, double[] scores) {
        this.name = name;
        this.id = id;
        this.scores = scores;
    }

    public double getAverageScore() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
