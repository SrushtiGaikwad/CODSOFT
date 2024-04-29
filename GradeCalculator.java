import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        System.out.print("English: ");
        int English = scanner.nextInt();
        System.out.print("Science: ");
        int Science = scanner.nextInt();
        System.out.print(" Hindi: ");
        int Hindi = scanner.nextInt();
        System.out.print(" SST: ");
        int SST = scanner.nextInt();
        System.out.print(" SocialStudies: ");
        int SocialStudies = scanner.nextInt();

        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        int totalMarks = English + Science + Hindi + SST + SocialStudies;

        // Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
        double averagePercentage = (double) totalMarks / 5;

        // Grade Calculation: Assign grades based on the average percentage achieved.
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
