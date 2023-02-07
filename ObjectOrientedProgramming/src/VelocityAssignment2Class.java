import java.util.Scanner;

public class VelocityAssignment2Class {

    int numberInteger;
    byte numberByte;
    char characterChar;
    short numberShort;
    long numberLong;
    float decimalNumberFloat;
    double decimalNumberDouble;
    boolean valueBoolean;
    //Question 4 Make a Global Variable Y
    int y = 25;


    public static void main(String[] args) {

        //Question 1. Write a java program to print first character of your name on console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Name ");
        String name = scan.nextLine();
        String[] split = name.split("");
        System.out.println("First Character of your word is :" + split[0]);
        for (String elements : split) {

            System.out.print(elements);

        }
        //Question 2 Write a Program to declare Local Variable as 'x'
        int x;
        //Question 3 Assign 'x' to 50
        x = 50;

        //Question 4 Make a Global Variable Y
        VelocityAssignment2Class valueOfY = new VelocityAssignment2Class();
        System.out.println("");
        System.out.println(valueOfY.y);

    }
}
