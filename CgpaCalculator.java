import java.util.Scanner;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();

        System.out.print("Enter number of courses: ");
        int numCourses = input.nextInt();

        double totalCredit = 0, totalGradePoint = 0, creditEarned = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");

            System.out.print("Credit (Max 3): ");
            double credit = input.nextDouble();

            System.out.print("Class Test (out of 30): ");
            double ct = input.nextDouble();

            System.out.print("Attendance (out of 10): ");
            double at = input.nextDouble();

            System.out.print("Final Exam (out of 60): ");
            double fe = input.nextDouble();

            double totalMarks = ct + at + fe;

            double gradePoint;
            if (totalMarks >= 80) gradePoint = 4.0;
            else if (totalMarks >= 75) gradePoint = 3.75;
            else if (totalMarks >= 70) gradePoint = 3.5;
            else if (totalMarks >= 65) gradePoint = 3.25;
            else if (totalMarks >= 60) gradePoint = 3.0;
            else if (totalMarks >= 55) gradePoint = 2.75;
            else if (totalMarks >= 50) gradePoint = 2.5;
            else if (totalMarks >= 45) gradePoint = 2.25;
            else if (totalMarks >= 40) gradePoint = 2.0;
            else gradePoint = 0.0;

            totalCredit += credit;
            totalGradePoint += (gradePoint * credit);

            if (gradePoint > 0) creditEarned += credit;
        }

        double cgpa = totalGradePoint / totalCredit;

        String grade;
        if (cgpa >= 4.0) grade = "A+";
        else if (cgpa >= 3.75) grade = "A";
        else if (cgpa >= 3.5) grade = "A-";
        else if (cgpa >= 3.25) grade = "B+";
        else if (cgpa >= 3.0) grade = "B";
        else if (cgpa >= 2.75) grade = "B-";
        else if (cgpa >= 2.5) grade = "C+";
        else if (cgpa >= 2.25) grade = "C";
        else if (cgpa >= 2.0) grade = "D";
        else grade = "F";

        System.out.println("\n--- Result Summary ---");
        System.out.println("Student ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredit);
        System.out.println("Credit Earned: " + creditEarned);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);
    }
}
