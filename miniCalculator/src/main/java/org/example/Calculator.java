package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
    public Scanner scan = new Scanner(System.in);

    void sumOfTwoNums() {
        System.out.println("Enter num 1 ");
        int num1 = scan.nextInt();
        System.out.println("Enter num 2 ");
        int num2 = scan.nextInt();
        System.out.println("Sum of two number is " + (num1 + num2));
//        return (num1+num2);
    }

    void diffOfTwoNums() {
        System.out.println("Enter num 1 ");
        int num1 = scan.nextInt();
        System.out.println("Enter num 2 ");
        int num2 = scan.nextInt();
        System.out.println("Difference of two number is " + Math.abs((num1 - num2)));
//        return (num1-num2);
    }

    void multiplicationOfTwoNums() {
        System.out.println("Enter num 1 ");
        int num1 = scan.nextInt();
        System.out.println("Enter num 2 ");
        int num2 = scan.nextInt();
        System.out.println("Multiplication of two number is " + Math.abs((num1 * num2)));
//        return (num1-num2);
    }

    void divOfTwoNums() {
        System.out.println("Enter numerator ");
        float numerator = scan.nextInt();
        System.out.println("Enter Denominator ");
        float denominator = scan.nextInt();
        System.out.println("Division of two number is " + Math.abs((numerator / denominator)));
//        return (num1-num2);
    }

    void averageOfNum() {
        ArrayList<Integer> arrayname = new ArrayList<Integer>();
        System.out.println("Enter how many number you want average of: ");

        int limit = scan.nextInt();
        System.out.println("enter number in list");
        do {
            int num = scan.nextInt();
            arrayname.add(num);
            System.out.println(arrayname);
        } while (arrayname.size() < limit);
        float sum = 0.0f;
        for (Integer integer : arrayname) {
            sum = sum + integer;
        }
        System.out.println("Average of number is :" + (sum / arrayname.size()));
    }

    void moduloOfTwoNumbers() {
        System.out.println("Enter the Dividend ");
        float dividend = scan.nextInt();
        System.out.println("Enter a Divisor ");
        float divisor = scan.nextInt();
        System.out.println("Modulo/Reminder of " + dividend + " and " + divisor + " is :" + dividend % divisor);
    }

    void factorOfANumber() {
        System.out.println(" Enter a Integer that you want factors of : ");
        int numberForFactor = scan.nextInt();
        for (int i = 1; i <= numberForFactor; i++) {
            if (numberForFactor % i == 0) {
                System.out.println(i + "  factor is a factor \n ");
            }
        }
    }
    void cubeOfNumber(){
        System.out.println("Enter a number for cubing");
        int input = scan.nextInt();
        System.out.println("Cube of "+input+ " is " + Math.pow(input,3));
    }
    void squareOfNumber(){
        System.out.println("Enter a number for cubing");
        int input = scan.nextInt();
        System.out.println("Cube of "+input+ " is " + Math.pow(input,2));
    }
    void evenOddCheker(){
        System.out.println(" Enter a number to check if its Even or Odd");
        int input = scan.nextInt();
        String msg = (input == 0) ? "Even" : "Odd";
        System.out.println(msg);
    }


    public static void main(String[] args) {
        Calculator calculate = new Calculator();

        System.out.println("Enter / Press :\n 1 for Sum\n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 for average  \n 6 for Modulo of 2 numbers  \n " +
                "7 for factors of an Integer \n 8 for cube of a number  \n 9 for Square of Number  \n 10 for checking Even or Odd");
        int input = 0;
        do {
            try {
                input = calculate.scan.nextInt();
            } catch (InputMismatchException e) {

                System.out.println("Please enter Integers");

            }

            switch (input) {
                case 1 -> calculate.sumOfTwoNums();
                case 2 -> calculate.diffOfTwoNums();
                case 3 -> calculate.multiplicationOfTwoNums();
                case 4 -> calculate.divOfTwoNums();
                case 5 -> calculate.averageOfNum();
                case 6 -> calculate.moduloOfTwoNumbers();
                case 7 -> calculate.factorOfANumber();
                case 8 -> calculate.cubeOfNumber();
                case 9 -> calculate.squareOfNumber();
                case 10 ->calculate.evenOddCheker();
                default -> System.out.println("Enter a Valid Input Sirji");

            }
            break;
        } while (true);


    }


}


//Assignments 4
//        1. Write the java program to design method for addition of two number which returns int results to that method and result should be print into main method.
//        2. Write the java program to design method for substraction of two number which returns int value to that method and result should be print into main method.
//        3. Write the java program to design method for multiplication of two number which returns int value to that method and result should be print into main method.
//        4. Write the java program to design method for division of two number which returns int value to that method and result should be print into main method.
//        5. Write the Java Program to calculate total of five subject marks and average of it.
//        Note-Once you are done with your assignments keep it with you don't send me. I will share one PDF to you which will have answer of all assignments. All you need to do is self review check your answers and verify with sheet... Correct them if wrong.
//        VIMP - Do not use Google it will reduce your chances of getting placed.


