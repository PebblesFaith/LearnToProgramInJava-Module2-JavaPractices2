/*
Dear Readers:
I had discovered on November 24, 2019 (Sunday, afternoon), while I was working on my online course (Learn to Program in Java) practice assignment Self-Check, section 4.10 “Java Is Awesome” from our online instructor had her students reference to this website, practiceit.cs.washington.edu that has serious Java language API compiler issues and when a student submit the correct answer the “Practice It” website that corresponds to the Building Java Programs, a Back to Basics Approach 5e ” edition does not match to the appropriate student submitted answer when their answer is correct in which, causes a students to have an constant error messages; after, a students’ answers are submitted.  I had experienced, poorly written instruction from some of the Practice It’s website Self-Checks problems.
In this particular Self-Check, section 4.10 “Java Is Awesome,” the author of this instruction fail to declare and initialize the Integer’s Primitive Data Type such as, “int x = 29” instead of x = 29 which is,  an illegal Primitive Data Type. And, in the same self-check Java language problem the author instructions should had notified students to apply in their written Java language codes problem, the Scanner Utility Package (API) import.  After, thoroughly reviewing and analyzing this Self-Check, section 4.10 “Java Is Awesome,” this particular problem is attempting to match a student answer to the Practice It’s Java language API application which is, possibly written programmed by a University of Washington’s instructor and [or] student who has not factor in users (students) experiences and submitted answers deviations when the instructors or students written the Java language API codes program for IT matching principle answers keys, as a correct Java language API results.  The University of Washington’s IT department should be totally embarrassed from their lack of Java language programming abilities onto the Practice It’s website.
I had completed, the practice assignment Self-Check, section 4.10 “Java Is Awesome” onto “GitHub” website, as the correct answer key dated on November 24, 2019.
Respectfully Submitted,
Sarai Hannah Ajai


    Practice It's Instruction shown below.
    The following code is poorly structured. It contains redundant statements that unnecessarily
    occur multiple times. Factor out redundant code from the following example by moving it out of
    the if/else statement, while preserving the same behavior and output. This problem asks for bare
    code. Submit a fragment of Java code as described. Do not write any class or method heading around
    your code; just write the lines of code that will produce the result described.

 */

import java.util.Scanner;

public class BJP4SelfCheckChapter4Question10JavaIsAwesome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number for the value of x? ");
        int x = console.nextInt();
        System.out.print("Enter a number for the value of a? ");
        int a = console.nextInt();

        if (x < 30) {
            a = 2;
            x++;
            System.out.println("Java is awesome! " + x);
        } else {
            System.out.println("Java is awesome! And, your x value remain the same number. " + x);
        }
    }
}
