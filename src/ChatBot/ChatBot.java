package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Qwerty.\nI was created in 2021.\nPlease, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!\nLet me guess your age.\nEnter remainders of dividing your age by 3");
        int remainder_of_division_by_3 = scanner.nextInt();
        System.out.println("Enter remainders of dividing your age by 5");
        int remainder_of_division_by_5 = scanner.nextInt();
        System.out.println("Enter remainders of dividing your age by 7");
        int remainder_of_division_by_7 = scanner.nextInt();
        int your_age = ((remainder_of_division_by_3 * 70 + remainder_of_division_by_5 * 21 + remainder_of_division_by_7 * 15) % 105);
        System.out.println("Your age is " + your_age + "; that's a good time to start programming!\nNow a will prove to you that I can count to any number you want");
        int amount = scanner.nextInt();
        int i = 0;
        while (i < amount) {
            i ++;
            System.out.println(i + " !");
        }
        System.out.println("Let's test your programming knowledge.\n " +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several.\n" +
                "3. To determinate the execution time of a program.\n" +
                "4. To interrupt the execution of the program.");
        String answer;
        while (true) {
            answer = scanner.next();
            if (answer.equals ("2")) {
                System.out.println("Great, you right!\nGoodbye, have a nice day!");
                break;
            }
            else if (answer != "2") {
                System.out.println("Please, try again");
            }
        }

    }
}
