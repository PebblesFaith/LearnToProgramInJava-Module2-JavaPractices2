/*
    For each of the following while loops, state how many times the loop will execute its body.
    Remember that "zero," "infinity," and "unknown" are legal answers. Also, what is the output
    of the code in each case? In chapter 5, Self Check number 1 - problem e on page 376 and 377 from my
    "Building Java Programs, A Back to Basics Approach 5e" textbook" for my online course
    "Learn to Program in Java" dated on November 29, 2019.

    I had completed, the Self Check, Problem 1:e “While Loops” based on the best possible textbook
    instructions posted onto “GitHub” website, as the correct answer key dated on November 29, 2019.

   Completed by Sarai Hannah Ajai
 */
public class BJP5SelfCheckChapter5Problem1e {
    public static void main(String[] args) {
        String word = "a";
        while (word.length() < 10) {
            word = "b" + word + "b";
        }
        System.out.println(word);
    }
}
