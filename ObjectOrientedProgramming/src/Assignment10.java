package ObjectOrientedProgramming.src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment10 {

    void primeNumberCheck() {
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int divider;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Number is A not Prime");
        } else {
            System.out.println("Number is A Prime ");
        }
    }

    public void fibonacciSeries() {
        int a = 0;
        int b = 1;
        int empty;
        int n = 0;
        while (n <= 20) {
            empty = a + b;
            a = b;
            b = empty;
            System.out.println(empty);
            n++;
        }
    }

    void armstrongNumber() {
        int n = 1634;
        int input = n;
        double a = 0 ;
        while (n != 0) {
            double stack = n % 10;
            n = n / 10;
            a= a +(Math.pow(stack,3));
            System.out.println(a +"  "+ stack);



        }
        System.out.println(a);
        System.out.println(input);
        String b = a == input ? "Armstrong":"Not armstrong" ;
        System.out.println(b);

    }

    public static void main(String[] args) {
        Assignment10 assignment10 = new Assignment10();
        // assignment10.primeNumberCheck();
        // assignment10.fibonacciSeries();
        //assignment10.armstrongNumber();
    }
}
