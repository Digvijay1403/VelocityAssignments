import java.util.ArrayList;
import java.util.Scanner;

public class Assignent4 {

    void sumOfTwoNums(int num1,int num2){
        System.out.println("Sum of two number is "+ (num1+num2));
//        return (num1+num2);
    }

    void diffOfTwoNums(int num1,int num2){
        System.out.println("Sum of two number is "+ Math.abs((num1-num2)));
//        return (num1-num2);
    }

    void multiplicationOfTwoNums(int num1,int num2){
        System.out.println("Sum of two number is "+ Math.abs((num1*num2)));
//        return (num1-num2);
    }

    void divOfTwoNums(int numerator,int denominator){
        System.out.println("Sum of two number is "+ Math.abs((numerator/denominator)));
//        return (num1-num2);
    }

    void averageOfNum(){
        ArrayList<Integer> arrayname = new ArrayList<Integer>();
        System.out.println("Enter how many number you want average of: ");

        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        System.out.println("enter number in list");
        do {
            int num = scan.nextInt();
            arrayname.add(num);
            System.out.println(arrayname);
        }   while ( arrayname.size() < limit);
        float sum = 0.0f;
        for (Integer integer : arrayname) {
            sum = sum + integer;
        }
        System.out.println("Average of number is :" +(sum/arrayname.size()));




    }

    public static void main(String[] args) {
        Assignent4 calculate = new Assignent4();

        calculate.sumOfTwoNums(3,4);
        calculate.diffOfTwoNums(14,44);
        calculate.averageOfNum();

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
