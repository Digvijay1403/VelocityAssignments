package ObjectOrientedProgramming.src;

import java.util.Scanner;

public class Assignment8EmployeeInformation {
       Assignment8Employee employee = new Assignment8Employee();//Create instance of class employee
       Scanner scan = new Scanner(System.in);//Scanner class for input instantiated

       public void getUserInput() {
              System.out.println("Enter First Name");
              employee.firstName = scan.next();

              System.out.println("Enter Last Name ");
              employee.lastName = scan.next();


              System.out.print("Enter Your city Name");
              employee.city = scan.next();

              System.out.println("Enter your mobile Number");
              employee.mobileNumber = scan.nextLong();


              System.out.println(employee.firstName+employee.lastName+employee.city+employee.mobileNumber+employee.country);



       }
       public static void main (String[] args){
              Assignment8EmployeeInformation a = new Assignment8EmployeeInformation(); //Create instance for employee information class
              a.getUserInput();                  //method call for employee information class
       }
}
