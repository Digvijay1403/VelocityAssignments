import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {

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
        Assignment4 calculate = new Assignment4();

        calculate.sumOfTwoNums(3,4);
        calculate.diffOfTwoNums(14,44);
        calculate.averageOfNum();

    }


}
