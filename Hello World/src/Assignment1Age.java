import java.util.Scanner;

public class Assignment1Age {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("you have %d letters in your name\n",firstName.length());
        System.out.println("You have lived "+ age + " years . In another "+age + " You will be " + 2*age + " years");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);
    }
}
