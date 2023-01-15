import java.util.Objects;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputPassword ;


        do{
            System.out.println("Enter Password");
            inputPassword = scanner.nextLine();

        }
        while (!inputPassword.equals("shark50"));
        System.out.println("Access Approved");




    }
}