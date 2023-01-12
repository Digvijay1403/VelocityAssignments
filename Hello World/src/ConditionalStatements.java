import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter value for x = ");
        int x = scanner.nextInt() ;


        System.out.print(" Enter value for y = ");
        int y = scanner.nextInt() ;

        if (x > y){
            System.out.println("x is greater than y ");
        }
        else if (x < y){
            System.out.println("x is less than y ");
        }
        else {
            System.out.println("x is equals to y ");
        }

        System.out.format("The difference in x and y is %d",(x-y));

    }
}
