import java.util.Scanner;

public class CodingChallengee2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is you age : ");
        int age = scanner.nextInt();
        System.out.println("What is you Name : ");
        String name = scanner.next();


        System.out.format("You have lived %d years and" +
           " in next %d you will be %d years of age ",age,age,(2*age));
        System.out.format("\nYour name has %d letters in them",name.length());


    }
}
