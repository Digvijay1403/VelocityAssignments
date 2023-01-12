import java.util.Scanner;

public class BillSplit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is bill");
        double bill = scanner.nextDouble();

        System.out.println("enter no. of people");
        double peopleInTotal = scanner.nextDouble();

        double eachWillPay = bill/peopleInTotal;
        System.out.format("Each shall pay %d ",eachWillPay);
    }
}
