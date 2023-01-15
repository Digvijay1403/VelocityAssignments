import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPlayer {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        Scanner scanner = new Scanner(System.in);
        int inputValue;
        int count= 0;
        do{ count++;
            System.out.println("Print a value");
            inputValue = scanner.nextInt();
            if (inputValue > randomNumber){
                System.out.println("Lower");
            }
            else if(inputValue<randomNumber){
                System.out.println("Higher");

            }
            else {
                System.out.println("Right");
                System.out.println(count);
            }

        }
        while (inputValue!=randomNumber);




    }
}
