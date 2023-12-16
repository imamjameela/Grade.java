import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store the grades and calculate the average
        double totalGrade = 0.0;
        int numSubjects = 5;

        // Input grades for 5 subjects
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + ": ");
            double grade = scanner.nextDouble();
            totalGrade += grade;
        }

        // Calculate the average grade
        double averageGrade = totalGrade / numSubjects;

        // Display the average grade
        System.out.println("Total Marks is 500");
        System.out.println("Average Grade: " + averageGrade);
       

        // Determine the overall grade
        if (averageGrade >= 90) {
            System.out.println("Overall Grade: A");
        } else if (averageGrade >= 80) {
            System.out.println("Overall Grade: B");
        } else if (averageGrade >= 70) {
            System.out.println("Overall Grade: C");
        } else if (averageGrade >= 60) {
            System.out.println("Overall Grade: D");
        } else {
            System.out.println("Overall Grade: F");
        }
    

        scanner.close();
    }
}
