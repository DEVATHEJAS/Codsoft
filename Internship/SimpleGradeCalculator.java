import java.util.Scanner;

public class SimpleGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + " marks: ");
            totalMarks += scanner.nextInt();
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        char grade = calculateGrade(averagePercentage);

        displayResults(totalMarks, averagePercentage, grade);

        scanner.close();
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) return 'A';
        if (averagePercentage >= 80) return 'B';
        if (averagePercentage >= 70) return 'C';
        if (averagePercentage >= 60) return 'D';
        return 'F';
    }

    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.printf("\nResults:%n%nTotal Marks:       %d%n" +
                "Percentage: %.2f%%%nGrade:             %c%n%n",
                totalMarks, averagePercentage, grade);
    }
}
