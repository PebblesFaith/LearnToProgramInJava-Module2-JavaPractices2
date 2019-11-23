public class IFStatementOnlinePractice1 {
    public static void main(String[] args) {
        String status = "preferred";
        double price = 10.00;

        if (status.equals("preferred")) {
            System.out.println("Preferred discount applied" + " " + (price * .90));

        } else {
            System.out.println("Preferred no discount applied");
        }
    }

}
