import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome to the How is that number!");

        Scanner scan = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int attempts = 0;

        while (attempts < 5) {
            System.out.println("type a number between 0 and 100");
            int numberTyped = scan.nextInt();
            attempts++;

            if (numberTyped == randomNumber) {
                System.out.println("Congrats! You got the number right!");
                break;
            } else if (numberTyped < randomNumber) {
                System.out.println("the number written is less than the number generated");
            } else if (numberTyped > randomNumber) {
                System.out.println("the number written is greater than the number generated");
            }
        }

        if (attempts == 5) {
            System.out.println("you lost the game");
        }
    }
}