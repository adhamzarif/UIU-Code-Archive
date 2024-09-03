public class Player implements Comparable<Player> {
    private String name;
    private int score;

    // Constructor to initialize name and score
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter methods for name and score
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Override the compareTo method for sorting
    @Override
    public int compareTo(Player other) {
        // First compare by score in descending order
        int scoreComparison = Integer.compare(other.score, this.score);
        if (scoreComparison != 0) {
            return scoreComparison;
        }
        // If scores are the same, compare by name in ascending order
        return this.name.compareTo(other.name);
    }

    // Method to print Player details in the format "name score"
    @Override
    public String toString() {
        return name + " " + score;
    }
}
