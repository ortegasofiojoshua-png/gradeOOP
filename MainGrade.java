
package maingrade;

import java.util.Scanner;
public class MainGrade {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create subclass object
        gradeSubClass studentGrade = new gradeSubClass();

        double grade;

        // Input validation
        while (true) {

            System.out.print("Enter Grade: ");
            grade = input.nextDouble();

            // Check if the grade is valid
            if (grade >= 1.0 && grade <= 5.0) {

                studentGrade.setGrade(grade);
                break;

            }
            else {

                System.out.println("Invalid Grade! Please enter a grade from 1.0 to 5.0.");

            }
        }

        // Display grade and remarks
        System.out.println("Grade: " + studentGrade.getGrade());
        System.out.println("Remarks: " + studentGrade.evaluateGrade());

        // Close Scanner
        input.close();
    }
}

