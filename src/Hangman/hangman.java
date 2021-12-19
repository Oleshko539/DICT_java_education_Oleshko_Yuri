package Hangman;
import java.util.Scanner;

public class hangman {
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("HANGMAN\n" +
                "The game will be available soon");
        String word = "java", WORD;
        System.out.println("Enter word: ");
        WORD = in.nextLine();
        if (word.equals(WORD)){
            System.out.println("You survived! ");
        }
        else if (!"word". equals(WORD)){
            System.out.println("You lost! ");
        }
    }
}
