/*
    Convert each of the following for loops into an equivalent while loop.

    In chapter 5, Self Check number 2 - problem d on page 377 and 378 from my
    "Building Java Programs, A Back to Basics Approach 5e" textbook" for my online course
    "Learn to Program in Java" dated on November 29, 2019.

    I had completed, the Self Check, Problem 2:d “For To While” based on the best possible textbook
    instructions posted onto “GitHub” website, as the correct answer key dated on November 29, 2019.

   Completed by Sarai Hannah Ajai
 */
public class BJP5SelfCheckChapter5Problem2d {
    public static void main(String[] args) {
        int numberFour = 4;
        int count = 1;
        while (count <= numberFour) {
            System.out.println(numberFour);
            numberFour = numberFour / 2;
            count++;
        }
    }
}
