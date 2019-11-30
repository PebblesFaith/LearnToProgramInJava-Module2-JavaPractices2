/*
    Convert each of the following for loops into an equivalent while loop.

    In chapter 5, Self Check number 2 - problem c on page 377 and 378 from my
    "Building Java Programs, A Back to Basics Approach 5e" textbook" for my online course
    "Learn to Program in Java" dated on November 29, 2019.

    I had completed, the Self Check, Problem 2:c “For To While” based on the best possible textbook
    instructions posted onto “GitHub” website, as the correct answer key dated on November 29, 2019.

   Completed by Sarai Hannah Ajai
 */
public class BJP5SelfCheckChapter5Problem2c {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 2) {
            i++;
            int j = 1;
            while (j <= 3) {
                j++;
                int k = 1;
                while (k <= 4) {
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
            }
            System.out.println();
        }
    }
}
