package ObjectOrientedProgramming.src;

import java.util.Scanner;

public class Assignment6 {

    Scanner scan = new Scanner(System.in);


    void tableOfNum(){
        int a = scan.nextInt();

        for(int i=1; i<11;i++){
        System.out.printf("%d  * %d = %d",a,i,a*i).println();
    }
    }
    void evenNums(){
        for(int i = 50 ; i <= 75;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
    }

    void factorial(int no){
        while(no!=0){
            int mul=no*(no-1);
            no--;
            System.out.println(no=no+mul);
        }


    }



    public static void main(String[] args) {

        int i = 25;
        while ( i <= 50 ){
            System.out.println(i);
            i++;

        }
        Assignment6 assignment6 = new Assignment6();
        System.out.println("Type an number whose table u want");
        assignment6.tableOfNum();
        assignment6.evenNums();
        assignment6.factorial(5);

    }



}












//Assignments-6
//        1.write a program to print 25 to 50 numbers using while loop.
//        2. Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like
//        5*1=5.......5*10=50)
//        3.write a program  to print all even number from 50 to 75.
//        4. Design method int factorial(int no)  which returns int value to that method. print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
//        Note- Once you are done with your assignments keep it with you don't send me. I will share one PDF to you which will have answer of all assignments. All you need to do is self review check your answers and verify with sheet... Correct them if wrong.
//        VIMP - Do not use Google it will reduce your chances of getting placed.
