
import java.util.Scanner;
public class BJP5SelfCheckChapter4Question7EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        double testnumber = input.nextDouble();



        if ((testnumber + testnumber)  / 2  % 2 == 0 )  {
            System.out.println("The " + testnumber + " you have entered is an even number.");
        } else {
            System.out.println("The " + testnumber + " you have entered is an odd number.");
        }

    }
}
