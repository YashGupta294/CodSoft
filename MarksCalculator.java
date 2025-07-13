import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking how many subjects
        System.out.print("Enter number of subjects: ");
        int subjectCount = sc.nextInt();

        int totalMarks = 0;

        // Loop to take marks input
        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            // Adding to total
            totalMarks = totalMarks + marks;
        }

        // Calculating average percentage
        float avgPercentage = (float) totalMarks / subjectCount;

        // Deciding grade
        String grade = "";

        if (avgPercentage >= 90) {
            grade = "A+";
        } else if (avgPercentage >= 80) {
            grade = "A";
        } else if (avgPercentage >= 70) {
            grade = "B+";
        } else if (avgPercentage >= 60) {
            grade = "B";
        } else if (avgPercentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Showing results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);
    }
}