/*
    Dear Instructor:
    
    I had discovered on November 24, 2019 (Sunday, afternoon), while I was working on my online course
    (Learn to Program in Java) practice assignment Self-Check, section 4.13 “Colors” from our online
    instructor had her students reference to this website, practiceit.cs.washington.edu that has serious
    Java language API compiler issues and when a student submit the correct answer the “Practice It”
    website that corresponds to the Building Java Programs, a Back to Basics Approach 5e ” edition does
    not match to the appropriate student submitted answer when their answer is correct in which, causes
    a students to have an constant error messages; after, a students’ answers are submitted.  I had
    experienced, poorly written instruction from some of the Practice It’s website Self-Checks problems.
    In this particular Self-Check, section 4.13 “Colors,” the author of this instruction fail to realize
    there are numerous variations in students’ answer outcome, as a result for this particular Self-Check,
    section 4.13 “Colors” problem. And, in the same self-check Java language problem the author
    instructions should had notified students to apply in their written Java language codes problem,
    the Scanner Utility Package (API) import and what type of text processing the students should have
    applied in the problem such as, “primitive type char” or “cumulative text algorithm for loops.
    Personally, as a student, I feel, I am playing a guessing game onto which textbook approach I should
    applied in this particular problem and others textbook or “Practice It” problems.  After, thoroughly
    reviewing and analyzing this Self-Check, section 4.13 “Colors,” this particular problem is attempting
    to match a student answer to the Practice It’s Java language API application which is, possibly written
    programmed by a University of Washington’s instructor and [or] student who has not factor in users
    (students) experiences and submitted answers deviations when the instructors or students who had written
    the Java language API codes program; in order to achieve the IT matching principle answers keys, as a
    correct Java language API results.  The University of Washington’s IT department should be totally
    embarrassed from their lack of Java language programming abilities onto the Practice It’s website.

    I had completed, the practice assignment Self-Check, section 4.13 “Colors” based on the best possible
    textbook instructions posted onto “GitHub” website, as the correct answer key dated on November 25,
    2019.

    Respectfully Submitted,
    Sarai Hannah Ajai

 */

import java.util.Scanner;
public class BJP5elfCheckChapter4Question13Colors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String color = input.next();

        if (color.equals("B") || color.equals("b")) {
            System.out.println("You have chosen Blue.");
        } else if  (color.equals("G") || color.equals("g")) {
            System.out.println("You have chosen Green.");
        } else if  (color.equals("R") || color.equals("r")) {
            System.out.println("You have chosen Red.");
        } else {
            System.out.println("Unknown color: " + color + ".");
        }
    }
}
