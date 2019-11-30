/*
    Convert each of the following for loops into an equivalent while loop.

    In chapter 5, Self Check number 2 - problem b on page 377 and 378 from my
    "Building Java Programs, A Back to Basics Approach 5e" textbook" for my online course
    "Learn to Program in Java" dated on November 29, 2019.

    I had completed, the Self Check, Problem 2:b “For To While” based on the best possible textbook
    instructions posted onto “GitHub” website, as the correct answer key dated on November 29, 2019.

   Completed by Sarai Hannah Ajai
 */
public class BJP5SelfCheckChapter5Problem2b {
    public static void main(String[] args) {
        int total = 25;
        int number = 1;
        while(number <= (total / 2)) {
            total = total - number;
            System.out.println(total + " " + number);
            number++;
        }
    }
}
