/* Draw a Star Figure using nested loops for Exercise 20 onto page number, 136 from my "Building Java
   Programs, A Back to Basics Approach 5e" textbook" for my online course "Learn to Program in Java" dated on
   November 27, 2019.

   I had completed, the Exercise, section 2.20 “Star Figure” based on the best possible textbook
    instructions posted onto “GitHub” website, as the correct answer key dated on November 27, 2019.

   Completed by Sarai Hannah Ajai
 */

public class BJP2ExerciseChapter2Problem20StarFigure {
    public static void main(String[] args) {
        firstLine();
        secondLine();
        thirdLine();
        fourthLine();
        fifthLine();
    }
        /*
        Produces sixteen (16) forward slashes and sixteen (16) back slashes onto the first (1st)
        console window line output.
        */
        public static void firstLine() {
            System.out.print("/");
            for (int forwardSlashes = 1; forwardSlashes <= 15; forwardSlashes++) {
                System.out.print("/");
            }
            for (int backSlashes = 1; backSlashes <= 15; backSlashes++) {
                System.out.print("\\");
            }
            System.out.println("\\");
        }
        /*
        Produces twelve (12) forward slashes, eight (8) asterisks and twelve (12) back slashes onto
        the second (2nd) console window line output.
         */
        public static void secondLine() {
            System.out.print("/");
            for (int forwardSlashes = 1; forwardSlashes <= 11; forwardSlashes++) {
                System.out.print("/");
            }
            for (int eightAsterisks = 1; eightAsterisks <= 8; eightAsterisks++) {
                System.out.print("*");
            }
            for (int backSlashes = 1; backSlashes <= 11; backSlashes++) {
                System.out.print("\\");
            }
         System.out.println("\\");
        }
        /*
        Produces eight (8) forward slashes, sixteen (16) asterisks and eight (8) back slashes onto
        the third (3rd) console window line output.
       */
        public static void thirdLine() {
            System.out.print("/");
            for (int forwardSlashes = 1; forwardSlashes <= 7; forwardSlashes++) {
                System.out.print("/");
            }
            for (int eightAsterisks = 1; eightAsterisks <= 16; eightAsterisks++) {
                System.out.print("*");
            }
            for (int backSlashes = 1; backSlashes <= 7; backSlashes++) {
                System.out.print("\\");
            }
            System.out.println("\\");
        }
       /*
       Produces four (4) forward slashes, twenty-four (24) asterisks and four (4) back slashes onto
       the fourth (4th) console window line output.
       */
        public static void fourthLine() {
            System.out.print("/");
            for (int forwardSlashes = 1; forwardSlashes <= 3; forwardSlashes++) {
                System.out.print("/");
            }
            for (int eightAsterisks = 1; eightAsterisks <= 24; eightAsterisks++) {
                System.out.print("*");
            }
            for (int backSlashes = 1; backSlashes <= 3; backSlashes++) {
                System.out.print("\\");
            }
            System.out.println("\\");
        }
        /*
       Produces thirty-two (32) asterisks onto the fifth (5th) console window line output.
        */
        public static void fifthLine() {
            System.out.print("*");
            for (int thirtyTwoAsterisks = 1; thirtyTwoAsterisks <= 30; thirtyTwoAsterisks++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
}

