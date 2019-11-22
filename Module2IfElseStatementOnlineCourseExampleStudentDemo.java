/*
    This is a Student grade percentage questions and answers demonstration's calculation in a two (2) ways
    communication between the developer's program and the end-user interactions for my online edX.org
    course "Learn to Program in Java." In module two (2) section if/else statements online instructor lecture and
    example.
 */

import java.util.*;
public class Module2IfElseStatementOnlineCourseExampleStudentDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What was your overall grade percentage?");
            int grade = input.nextInt();
            if (grade > 85) {
                System.out.println("Congratulation, you are admitted to the ABC University!");
            } else if (grade > 75) {
                System.out.println("Your name has been added to our ABC University waiting list.");
            } else {
                System.out.println("Sorry, your overall grade do not meet our ABC University requirements.");
            }
    }

}
