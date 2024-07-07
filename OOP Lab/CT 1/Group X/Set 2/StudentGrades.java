package GroupX.Set2;

public class StudentGrades {
    private double[] grades;

    // Constructor to initialize grades attribute
    public StudentGrades(double[] grades) {
        this.grades = grades;
    }

    // Getter for grades array
    public double[] getGrades() {
        return grades;
    }

    // Method to calculate average grade
    public double averageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to find maximum grade
    public double maxGrade() {
        if (grades.length == 0) {
            throw new IllegalStateException("No grades recorded.");
        }

        double max = grades[0];
        for (double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    // Method to find minimum grade
    public double minGrade() {
        if (grades.length == 0) {
            throw new IllegalStateException("No grades recorded.");
        }

        double min = grades[0];
        for (double grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    // Method to fix grades below 0
    public void fixGrades() {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 0) {
                grades[i] = 0;
            }
        }
    }

    // Method to display grades as letter grades
    public void displayGrades() {
        System.out.println("Student grades:");
        for (double grade : grades) {
            if (grade >= 0 && grade < 50) {
                System.out.println("F");
            } else if (grade >= 50 && grade < 70) {
                System.out.println("D");
            } else if (grade >= 70 && grade < 80) {
                System.out.println("C");
            } else if (grade >= 80 && grade < 90) {
                System.out.println("B");
            } else if (grade >= 90 && grade <= 100) {
                System.out.println("A");
            } else {
                System.out.println("Invalid grade");
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        double[] studentGrades = {85, 92, 68, 45, 78};
        StudentGrades grades = new StudentGrades(studentGrades);

        // Test each method
        System.out.println("Average grade: " + grades.averageGrade());
        System.out.println("Maximum grade: " + grades.maxGrade());
        System.out.println("Minimum grade: " + grades.minGrade());

        // Fix grades and display them
        grades.fixGrades();
        grades.displayGrades();
    }
}

