/*
    Modify your StarFigure program from the previous exercise to become a new program named StarFigure2
    that uses a global constant fro the figure's height. (You may want to make loop tables first (1st).
    The previous output used a constant height of 5, The following are the outputs for the constant
    heights of 3 and 6 using nested loops for chapter 2, Exercise 21 onto page number, 136 from my "Building Java
    Programs, A Back to Basics Approach 5e" textbook" for my online course "Learn to Program in Java"
    dated on November 27, 2019.

    I had completed, the Exercise, section 2.21 “Star Figure 2” based on the best possible textbook
    instructions posted onto “GitHub” website, as the correct answer key dated on November 27, 2019.

   Completed by Sarai Hannah Ajai
 */

// Star Figure 2, the second version that is Java language coded in class constants.
public class BJP2ExerciseChapter2Problem21StarFigure2 {
    public static final int SUB_HEIGHT3 = 3;
    public static final int SUB_HEIGHT6 = 6;
    public static void main(String[] args) {
        firstLine();
        secondLine();
        thirdLine();
        fourthLine();
        fifthLine();
        sixthLine();
    }
    /*
    Produces the first row of forward and back slashes onto the first (1st) console window line output.
    */
    public static void firstLine() {
        System.out.println();
        System.out.print("/");
        for (int forwardSlashes = 1; forwardSlashes <= SUB_HEIGHT3 + 7; forwardSlashes++) {
            System.out.print("/");
        }
        for (int backSlashes = 1; backSlashes <= SUB_HEIGHT3 + 9; backSlashes++) {
            System.out.print("\\");
        }
        //System.out.println("\\");
        for (int spaces = 1; spaces  <= SUB_HEIGHT3 +2; spaces++) {
            System.out.print(" ");
        }
        System.out.print("/");
        for (int forwardSlashes = 1; forwardSlashes <= SUB_HEIGHT6 + 8; forwardSlashes++) {
            System.out.print("/");
        }
        for (int backSlashes = 1; backSlashes <= SUB_HEIGHT6 + 10; backSlashes++) {
            System.out.print("\\");
        }
        System.out.println("\\");
    }
    /*
     Produces the second row of forward, asterisks and back slashes onto the second (2nd)
     console window line output.
     */
    public static void secondLine() {
        System.out.print("/");
        for (int forwardSlashes = 1; forwardSlashes <= SUB_HEIGHT3 + 3; forwardSlashes++) {
            System.out.print("/");
        }
        for (int Asterisks = 1; Asterisks <= SUB_HEIGHT3 + 5; Asterisks++) {
            System.out.print("*");
        }
        for (int backSlashes = 1; backSlashes <= SUB_HEIGHT3 + 3; backSlashes++) {
            System.out.print("\\");
        }
        System.out.print("\\");
        for (int spaces = 1; spaces  <= SUB_HEIGHT3 + 3; spaces++) {
            System.out.print(" ");
        }
        System.out.print("/");
        for (int forwardSlashes = 1; forwardSlashes <= SUB_HEIGHT6 + 4; forwardSlashes++) {
            System.out.print("/");
        }
        for (int Asterisks = 1; Asterisks <= SUB_HEIGHT6 + 2; Asterisks++) {
            System.out.print("*");
        }
        for (int backSlashes = 1; backSlashes <= SUB_HEIGHT6 + 6; backSlashes++) {
            System.out.print("\\");
        }
        System.out.println("\\");
    }
    /*
    Produces the third row of forward, asterisks and back slashes onto the third (3rd)
    console window line output.
    */
    public static void thirdLine() {
        System.out.print("*");
        for (int thirtyTwoAsterisks = 1; thirtyTwoAsterisks <= SUB_HEIGHT3 + 17; thirtyTwoAsterisks++) {
            System.out.print("*");
        }
        System.out.print("*");
        for (int spaces = 1; spaces  <= SUB_HEIGHT3 + 3; spaces++) {
            System.out.print(" ");
        }
        System.out.print("/");
        for (int forwardSlashes = 1; forwardSlashes <= SUB_HEIGHT6 + 1; forwardSlashes++) {
            System.out.print("/");
        }
        for (int Asterisks = 1; Asterisks <= SUB_HEIGHT6 + 10; Asterisks++) {
            System.out.print("*");
        }
        for (int backSlashes = 1; backSlashes <= SUB_HEIGHT6 + 3; backSlashes++) {
            System.out.print("\\");
        }
        System.out.println("\\");
    }
    /*
   Produces the fourth row of forward, asterisks and back slashes onto the fourth (4th)
   console window line output.
   */
    public static void fourthLine() {
        for (int spaces = 1; spaces  <= SUB_HEIGHT3 + 25; spaces++) {
            System.out.print(" ");
        }
        System.out.print("/");
        for (int forwardSlashes = 1; forwardSlashes <= SUB_HEIGHT3; forwardSlashes++) {
            System.out.print("/");
        }
        for (int Asterisks = 1; Asterisks <= SUB_HEIGHT6 + 18; Asterisks++) {
            System.out.print("*");
        }
        for (int backSlashes = 1; backSlashes <= SUB_HEIGHT3 + 2; backSlashes++) {
            System.out.print("\\");
        }
        System.out.println("\\");
    }
    /*
   Produces the fifth row of forward, asterisks and back slashes onto the fifth (5th)
   console window line output.
   */
    public static void fifthLine() {
        for (int spaces = 1; spaces  <= SUB_HEIGHT3 + 25; spaces++) {
            System.out.print(" ");
        }
        System.out.print("/");
        for (int forwardSlashes = 1; forwardSlashes <= SUB_HEIGHT3 - 1; forwardSlashes++) {
            System.out.print("/");
        }
        for (int Asterisks = 1; Asterisks <= SUB_HEIGHT6 + 26; Asterisks++) {
            System.out.print("*");
        }
        for (int backSlashes = 1; backSlashes <= SUB_HEIGHT3 - 1; backSlashes++) {
            System.out.print("\\");
        }
        System.out.println("\\");
    }
    /*
   Produces the six row of asterisks onto the sixth (6th) console window line output.
   */
    public static void sixthLine() {
        for (int spaces = 1; spaces  <= SUB_HEIGHT3 + 25; spaces++) {
            System.out.print(" ");
        }
        System.out.print("*");
       for (int Asterisks = 1; Asterisks <= SUB_HEIGHT6 + 24; Asterisks++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
}
