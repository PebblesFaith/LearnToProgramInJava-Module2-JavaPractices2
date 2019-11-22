public class IFElseStatementOnlinePractice1 {
    public static void main(String[] args) {
        int temperature = 0;
        if (temperature > 70) {
            System.out.println("No coat required");
        } else if (temperature > 50) {
            System.out.println("Wear a jacket");
        } else if (temperature > 20) {
            System.out.println("Wear a warm coat");
        } else {
            System.out.println("Stay inside!");
        }
    }
}
