import java.util.Scanner;

public class BJP5SelfCheckChapter4Question9FavoriteColor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your favorite color?");
        String name = console.next();
        if (name.equals("blue")) {
            System.out.println("Mine, too!");
        } else {
            System.out.println(name + " is not my favorite color.");
        }
    }
}
